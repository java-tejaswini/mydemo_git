package com;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class MyTest {

@Test
public void myTest()
{
	String name="hello";
	assertEquals(5, name.length());
	assertEquals('h', name.charAt(0));
	
}

@Test
public void myTest1()
{
	String name="hello";
	assertNotEquals(4, name.length());
	System.out.println("data");;
	
}



}
