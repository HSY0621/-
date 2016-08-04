package p1;

import java.util.List;

/**
 * ͼ�����ϵͳ���ܱ�׼���ӿڣ� ���ߣ�yangdd@zparkhr.com.cn ʱ�䣺2015-6-5 ����2:10:41 ������TODO
 */
public interface LibrarySystem {
	/**
	 * ����:TODO ͨ���жϲ�����usenrame����password�Ƿ�����ݲֿ����й���Ա��Ϣһ�£������Ƿ��½�ɹ�
	 */
	public boolean login(String username, String password);

	/**
	 * ����:TODO ������book������ӵ����ݲֿ�����
	 */
	public void addBook(Book book);
	/**
	 * ����:TODO ���ݲ���bookId�����ݲֿ����ҵ���Ӧ��ͼ�飬Ȼ��ɾ����
	 * ��ʾ��1.�������ݲֿ��е�books���������е�ͼ�飬�ҵ�ͼ���ź�bookId��ͬ��ͼ���±�
	 * 		2.�ڱ�����ѭ�����棬ͨ��list��remove(index)����ɾ��ͼ��
	 */
	public void removeBook(int bookId);
	/**
	 * ����:TODO ����bookId�ҵ���Ӧ��ͼ�飬��ͼ����������Էֱ��޸�Ϊ�����д��ݹ�����ֵ
	 */
	public void updateBook(int bookId, String newName, double newPrice,
			String newCategory, String newDesc);
	/**
	 * ����:TODO �������ͼ��
	 */
	public Book[] getAllBooks();
	/**
	 * ����:TODO ���ݼ۸������ҵ�   minPrice<=price<=maxPrice������ͼ��
	 */
	public void getBooksByPriceRange(double minPrice, double maxPrice);
	/** 
	 * ����:TODO ���������������е�ͼ��
	 */
	public void getBooksByCategory(String category);
}
