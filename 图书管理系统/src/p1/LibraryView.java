package p1;

import java.util.Scanner;

//import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class LibraryView {

	private static Scanner sc = new Scanner(System.in);
	private static LibrarySystem ps = new LibrarySystemImpl();
	public static void main(String[] args) {
		System.out.println("****************************欢迎使用图书管理系统****************************");
		while(true){
		System.out.println("管理员登陆");
		System.out.print("用户名：");
		@SuppressWarnings("unused")
		String username = sc.next();			//输入管理员账号
		System.out.print("密码：");
		@SuppressWarnings("unused")
		String password = sc.next();			//输入管理员密码
		if(!ps.login(username, password)){		//判断账号密码是否正确
			System.out.println("用户名或密码错误！~");	
			continue;							//账号密码错误时从新输入
		}
		System.out.println("登陆成功");			//账号密码正确时登录系统并输出“登陆成功”
		
		//登录验证
		while (true) {
			// 管理员登陆
			System.out.println("\t\t" + "【1】：增加图书  "+"\t 【2】：删除图书");
			System.out.println("\t\t" + "【3】：修改图书信息"+"【4】：查看所有图书");
			System.out.println("\t\t" + "【5】：根据价格区间查找图书"+"【6】：类别名称，查找图书");
			System.out.print("请输入你的选项:");
			int choice = sc.nextInt();
			switch (choice) {					//选择管理员功能
			case 1:
				add();
				break;
			case 2:
				remove();
				break;
			case 3:
				update();
				break;
			case 4:
				getAll();
				break;
			case 5:
				searchByPriceRange();
				break;
			case 6:
				searchByCategory();
				break;
			default:										
				System.out.println("选项错误，请重新输入");
			}
		}
	}	
}

	
	public static void add(){							//添加新书籍
		System.out.println("请输入添加图书的信息");
		System.out.println("产品的名字");
		String name=sc.next();							//输入新书籍名称
		System.out.println("产品的价格");
		double price=sc.nextDouble();					//输入新书籍价格
		System.out.println("产品的类别");
		String category=sc.next();						//输入新书籍类别
		System.out.println("产品的描述");
		String description=sc.next();					//输入新书籍描述
		Book book=new Book(getPid(), name,price,category,description);  	//创建新书籍对象，并设置其属性
		ps.addBook(book);								//将新书籍添加到图书数据库中
	}		
	
	private static void remove() {						//删除书籍
		System.out.println("请输入您要删除书籍的bookID:");
		int bookId = sc.nextInt();						//输入要删除的书籍标号
		ps.removeBook(bookId);							//调用删除书籍的方法
	}

	private static void update() {						//更改书籍属性
		System.out.println("请输入更改书籍的信息");
		System.out.println("请输入您要更新书籍的bookId:");
		int bookId = sc.nextInt();						//输入要更改的书籍标号
		System.out.println("书籍更改后名字");
		String productName=sc.next();					//输入新名称
		System.out.println("书籍更改后价格");
		double price=sc.nextDouble();					//输入新价格
		System.out.println("书籍更改后类别");
		String category=sc.next();						//输入新类别
		System.out.println("书籍更改后描述");
		String description=sc.next();					//输入新描述
		ps.updateBook(bookId, productName,price,category,description);  //调用更改书籍属性方法
		
	}
	private static void getAll() {						//输出所有书籍
		Book[] allBook=ps.getAllBooks();
		for(int i = 0;i<allBook.length;i++){
			System.out.println(allBook[i]);
		}
	}

	
	private static int getPid(){						//给新添加的书籍一个编号
		int pid = -1;
		for(Book b:LibraryDB.books){
			if(pid<b.getBookId()){
				pid=b.getBookId();
			}
		}	
		return ++pid;
	}
	
	public static void searchByPriceRange() {			//根据输入的最低和最高价格查找相对应该的书籍，并将它们输出
		System.out.print("请输入你需要书籍的最低价格：");
		Double x=sc.nextDouble();						//输入最低价格
		System.out.print("请输入你需要书籍的最高价格：");
		Double y=sc.nextDouble();						//输入最好价格
		ps.getBooksByPriceRange(x,y);					//调用查找方法进行查找并输出
		
	}
	
	public static void searchByCategory() {				//根据输入的书籍类别进行查找，并输出相应的书籍
		System.out.print("请输入你需要书籍的类别：");
		String z=sc.next();								//输入要查找的类别
		ps.getBooksByCategory(z);						//调用查找方法进行查找并输出
	}
	
	
}

