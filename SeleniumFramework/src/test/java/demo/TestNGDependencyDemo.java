package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	@Test(dependsOnGroups= {"sanity.*"})
	public void test1() {
		System.out.println("I am inside Test 1");
	}
	
	@Ignore
	@Test(groups= {"sanity1"})
	public void test2() {
		System.out.println("I am inside Test 2");
	}
	
	@Test(groups= {"sanity2"})
	public void test3() {
		System.out.println("I am inside Test 3");
	}
}
