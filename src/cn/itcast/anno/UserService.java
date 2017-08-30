package cn.itcast.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
	//创建dao类型属性,在dao的属性上写个注解，完成注入
	
	//@Autowired // 自动装载
	@Resource(name="useDrDado") // 直接指定
	private UserDAO userDAO;
	
	public void add(){
		System.out.println("Service......");
		userDAO.add();
	}
}
