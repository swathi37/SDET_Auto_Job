package com.crm.contactTest;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest()
	{
		System.out.println("execute createContactTest");
	}
	
	@Test
	public void editContactTest()
	{
		System.out.println("execute editContactTest");
		String username = System.getProperty("user");
		 System.out.println("======="+username+"========");
	}
	
	

}
