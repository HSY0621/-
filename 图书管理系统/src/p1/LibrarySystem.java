package p1;

import java.util.List;

/**
 * 图书管理系统功能标准（接口） 作者：yangdd@zparkhr.com.cn 时间：2015-6-5 下午2:10:41 描述：TODO
 */
public interface LibrarySystem {
	/**
	 * 描述:TODO 通过判断参数的usenrame，和password是否和数据仓库类中管理员信息一致，决定是否登陆成功
	 */
	public boolean login(String username, String password);

	/**
	 * 描述:TODO 将参数book对象添加到数据仓库类中
	 */
	public void addBook(Book book);
	/**
	 * 描述:TODO 根据参数bookId在数据仓库中找到对应的图书，然后删除。
	 * 提示：1.遍历数据仓库中的books属性中所有的图书，找到图书编号和bookId相同的图书下标
	 * 		2.在遍历的循环外面，通过list的remove(index)方法删除图书
	 */
	public void removeBook(int bookId);
	/**
	 * 描述:TODO 根据bookId找到对应的图书，将图书的其余属性分别修改为参数中传递过来的值
	 */
	public void updateBook(int bookId, String newName, double newPrice,
			String newCategory, String newDesc);
	/**
	 * 描述:TODO 获得所有图书
	 */
	public Book[] getAllBooks();
	/**
	 * 描述:TODO 根据价格区间找到   minPrice<=price<=maxPrice的所有图书
	 */
	public void getBooksByPriceRange(double minPrice, double maxPrice);
	/** 
	 * 描述:TODO 根据类名查找所有的图书
	 */
	public void getBooksByCategory(String category);
}
