package p1;

import java.util.Scanner;

//import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class LibraryView {

	private static Scanner sc = new Scanner(System.in);
	private static LibrarySystem ps = new LibrarySystemImpl();
	public static void main(String[] args) {
		System.out.println("****************************��ӭʹ��ͼ�����ϵͳ****************************");
		while(true){
		System.out.println("����Ա��½");
		System.out.print("�û�����");
		@SuppressWarnings("unused")
		String username = sc.next();			//�������Ա�˺�
		System.out.print("���룺");
		@SuppressWarnings("unused")
		String password = sc.next();			//�������Ա����
		if(!ps.login(username, password)){		//�ж��˺������Ƿ���ȷ
			System.out.println("�û������������~");	
			continue;							//�˺��������ʱ��������
		}
		System.out.println("��½�ɹ�");			//�˺�������ȷʱ��¼ϵͳ���������½�ɹ���
		
		//��¼��֤
		while (true) {
			// ����Ա��½
			System.out.println("\t\t" + "��1��������ͼ��  "+"\t ��2����ɾ��ͼ��");
			System.out.println("\t\t" + "��3�����޸�ͼ����Ϣ"+"��4�����鿴����ͼ��");
			System.out.println("\t\t" + "��5�������ݼ۸��������ͼ��"+"��6����������ƣ�����ͼ��");
			System.out.print("���������ѡ��:");
			int choice = sc.nextInt();
			switch (choice) {					//ѡ�����Ա����
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
				System.out.println("ѡ���������������");
			}
		}
	}	
}

	
	public static void add(){							//������鼮
		System.out.println("���������ͼ�����Ϣ");
		System.out.println("��Ʒ������");
		String name=sc.next();							//�������鼮����
		System.out.println("��Ʒ�ļ۸�");
		double price=sc.nextDouble();					//�������鼮�۸�
		System.out.println("��Ʒ�����");
		String category=sc.next();						//�������鼮���
		System.out.println("��Ʒ������");
		String description=sc.next();					//�������鼮����
		Book book=new Book(getPid(), name,price,category,description);  	//�������鼮���󣬲�����������
		ps.addBook(book);								//�����鼮��ӵ�ͼ�����ݿ���
	}		
	
	private static void remove() {						//ɾ���鼮
		System.out.println("��������Ҫɾ���鼮��bookID:");
		int bookId = sc.nextInt();						//����Ҫɾ�����鼮���
		ps.removeBook(bookId);							//����ɾ���鼮�ķ���
	}

	private static void update() {						//�����鼮����
		System.out.println("����������鼮����Ϣ");
		System.out.println("��������Ҫ�����鼮��bookId:");
		int bookId = sc.nextInt();						//����Ҫ���ĵ��鼮���
		System.out.println("�鼮���ĺ�����");
		String productName=sc.next();					//����������
		System.out.println("�鼮���ĺ�۸�");
		double price=sc.nextDouble();					//�����¼۸�
		System.out.println("�鼮���ĺ����");
		String category=sc.next();						//���������
		System.out.println("�鼮���ĺ�����");
		String description=sc.next();					//����������
		ps.updateBook(bookId, productName,price,category,description);  //���ø����鼮���Է���
		
	}
	private static void getAll() {						//��������鼮
		Book[] allBook=ps.getAllBooks();
		for(int i = 0;i<allBook.length;i++){
			System.out.println(allBook[i]);
		}
	}

	
	private static int getPid(){						//������ӵ��鼮һ�����
		int pid = -1;
		for(Book b:LibraryDB.books){
			if(pid<b.getBookId()){
				pid=b.getBookId();
			}
		}	
		return ++pid;
	}
	
	public static void searchByPriceRange() {			//�����������ͺ���߼۸�������Ӧ�õ��鼮�������������
		System.out.print("����������Ҫ�鼮����ͼ۸�");
		Double x=sc.nextDouble();						//������ͼ۸�
		System.out.print("����������Ҫ�鼮����߼۸�");
		Double y=sc.nextDouble();						//������ü۸�
		ps.getBooksByPriceRange(x,y);					//���ò��ҷ������в��Ҳ����
		
	}
	
	public static void searchByCategory() {				//����������鼮�����в��ң��������Ӧ���鼮
		System.out.print("����������Ҫ�鼮�����");
		String z=sc.next();								//����Ҫ���ҵ����
		ps.getBooksByCategory(z);						//���ò��ҷ������в��Ҳ����
	}
	
	
}

