package com.niit.ecommersprojectbackend.testcases;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecommersprojectbackend.dao.UserDAO;
import com.niit.ecommersprojectbackend.model.User;

public class UserTestCase 
{
	
	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static UserDAO userDAO;

	@Autowired
	static User user;

	@BeforeClass
	public static void initialize() 
	{
		
		System.out.println("Initializing the Testcase for User ");
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		userDAO = (UserDAO) context.getBean("userDAO");

		 user = (User) context.getBean("user");

	}
	
	/*
	@Test
	public void createUserTestCase() {

		
		
		user.setUserId("user003");
		user.setUserEmail("vasui@gmail.com");
		user.setUserName("vasu");
		user.setUserPassword("vasu");
		user.setContact("9876765400");
		user.setCountry("INDIA");
		user.setUserRole("ROLE_USER");
		
		user.setAddress("6-10-24/1 Vinayka Nagar, Balanagar, Hyderabad");
		
		
		boolean flag = userDAO.register(user);

		assertEquals("createUserTestCase", true, flag);

	}


	
	
	@Test
	public void updateUserTestCase() {
		user.setUserEmail("charan@gmail.com");
		user.setUserId("user003");
		user.setUserName("charanteja");
		user.setUserPassword("charanteja");
		user.setCountry("India");
		user.setAddress("Hyderabad");
		user.setUserRole("ROLE_USER");
		user.setContact("9490167876");
		boolean flag = userDAO.update(user);

		assertEquals("updateUserTestCase", true, flag);

	}
/*
	@Test
	public void validateUserTestCase() {

		boolean flag = userDAO.validate("IsaacDV", "isaac");
		assertEquals(true, flag);

	}

	@Test
	public void listAllUserTestCase() 
	{
		int actualSize = userDAO.list().size();
	
		assertEquals(5, actualSize);
	}
*/
}
