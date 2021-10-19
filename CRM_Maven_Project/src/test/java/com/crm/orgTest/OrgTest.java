package com.crm.orgTest;

import org.testng.annotations.Test;

public class OrgTest {
	
	@Test
	public void createOrgTest()
	{
		System.out.println("execute createOrgTest");
		 String username = System.getProperty("user");
		 System.out.println("======="+username+"========");
	}
	@Test
	public void editOrgTest()
	{
		System.out.println("execute editOrgTest");
	}

}
