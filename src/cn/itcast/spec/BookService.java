package cn.itcast.spec;

import javax.annotation.Resource;

public class BookService {
	//得到bookDAO和OrderDAO的对象
	@Resource(name="bookDAO")
	private BookDAO bookDAO;
	@Resource(name="orderDAO")
	private OrderDAO orderDAO;
	
	public void add(){
		System.out.println("BookService.....");
		bookDAO.book();
		orderDAO.buy();
	}
}
