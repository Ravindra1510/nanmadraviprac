package com.flipkart.script;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public static void testA()
	{
		Reporter.log("hi",true);
	}

}
