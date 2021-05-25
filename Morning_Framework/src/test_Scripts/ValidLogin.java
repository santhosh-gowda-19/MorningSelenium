package test_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Generic_read_excel;
import pom_scripts.Facebook_login;

public class ValidLogin extends Base_Test
{
	@Test
	public void loginApp()
	{
		String uname = Generic_read_excel.getData("TestCase1",0,0);
		String pwd = Generic_read_excel.getData("TestCase1",0,1);
		Facebook_login fb=new Facebook_login(driver);
		fb.setEmail(uname);
		fb.setPass(pwd);
		fb.passBtn();
		Assert.fail();
		System.out.println("hello");
		System.out.println("hello world");
	}
}
