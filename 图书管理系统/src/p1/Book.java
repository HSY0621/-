package p1;

import java.util.Date;

@SuppressWarnings("unused")
public class Book {
	private int bookId;// 图书编号
	private String name;// 图书名称
	private double price;// 图书价格
	private String category;// 图书类别
	private String description;// 图书简介
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	
	
	public  Book(int  bookId,String name,double price,String category,String description){
		super();
		this.bookId = bookId;
		this.name = name;
		this.price = price;
		this.category = category;
		this.description = description;
	}
	
	public Book() {
		super();
	}

	
	public String toString() {
		return "Product [bookId=" + bookId + ", name=" + name+ ", price="+
				price + ", category=" + category +  ", description=" + description + "]";
	}
}
