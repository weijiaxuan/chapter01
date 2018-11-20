package com.itheima.ioc;
import org.springframework.context.ApplicationContext;
import 
    org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestIoC {
	public static void main(String[] args) {
		//1.��ʼ��spring���������������ļ�
		ApplicationContext applicationContext = 
		    new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.ͨ��������ȡuserDaoʵ��
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		//3.����ʵ���е�say()����
		userDao.say();
	}
}
