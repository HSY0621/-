package p1;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 */

public class LibraryDB {
	/**
	 * 存放管理员manager对象
	 */
	public static List<Manager> managers=new ArrayList<Manager>();
	
	/**
	 * 存放图书book对象
	 */
	public static List<Book> books=new ArrayList<Book>();
	
	static {
		Manager manager=new Manager("admin","123456");
		managers.add(manager);//初始化一个管理数据
		//初始化一个图书数据
		/*
		 * 初始化一些产品 基督山伯爵 红楼梦 水浒传 高等数学 大学英语 奥数
		 */
	
		Book book1=new Book(1,"基督山伯爵",10.0,"小说","法国大仲马杰出作品");
		Book book2=new Book(2,"红楼梦",20.0,"小说","清代作家曹雪琴长篇小说");
		Book book3=new Book(3,"水浒传",30.0,"小说","描述北宋以宋江为首的梁山起义");
		Book book4=new Book(4,"高等数学",40.0,"数学","大学数学必备课本");
		Book book5=new Book(5,"奥数",50.0,"数学","高难度数学竞赛试题");
		books.add( book1);
		books.add( book2);
		books.add( book3);
		books.add( book4);
		books.add( book5);
		}
}
