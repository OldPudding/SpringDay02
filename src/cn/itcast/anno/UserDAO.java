package cn.itcast.anno;

import org.springframework.stereotype.Component;

@Component("useDrDado")
public class UserDAO {
	public void add(){
		System.out.println("DAO.........");
	}
}
