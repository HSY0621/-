package p1;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 */

public class LibraryDB {
	/**
	 * ��Ź���Աmanager����
	 */
	public static List<Manager> managers=new ArrayList<Manager>();
	
	/**
	 * ���ͼ��book����
	 */
	public static List<Book> books=new ArrayList<Book>();
	
	static {
		Manager manager=new Manager("admin","123456");
		managers.add(manager);//��ʼ��һ����������
		//��ʼ��һ��ͼ������
		/*
		 * ��ʼ��һЩ��Ʒ ����ɽ���� ��¥�� ˮ䰴� �ߵ���ѧ ��ѧӢ�� ����
		 */
	
		Book book1=new Book(1,"����ɽ����",10.0,"С˵","����������ܳ���Ʒ");
		Book book2=new Book(2,"��¥��",20.0,"С˵","������Ҳ�ѩ�ٳ�ƪС˵");
		Book book3=new Book(3,"ˮ䰴�",30.0,"С˵","�����������ν�Ϊ�׵���ɽ����");
		Book book4=new Book(4,"�ߵ���ѧ",40.0,"��ѧ","��ѧ��ѧ�ر��α�");
		Book book5=new Book(5,"����",50.0,"��ѧ","���Ѷ���ѧ��������");
		books.add( book1);
		books.add( book2);
		books.add( book3);
		books.add( book4);
		books.add( book5);
		}
}
