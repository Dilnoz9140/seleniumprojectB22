package com.cybertek.tests.day12_actions_upload_jsecxecuter;

import org.testng.annotations.*;

public class Annotations {
    @BeforeClass
    public void beforeMethod(){
        System.out.println("BeforeMethod");
    }
    @AfterClass
    public void AfterMethod(){
        System.out.println("AfterClass");
    }
    @Test
    public void test1(){
        System.out.println("Test 1");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @Test
    public void test2(){
        System.out.println("Test 2");
    }
}
class Annotations2 extends Annotations{
  /*  @BeforeClass
    public void beforeMethod(){
        System.out.println("BeforeMethod");
    }
    @AfterClass
    public void AfterMethod(){
        System.out.println("AfterClass");
    }*/
    @Test
    public void Test(){
        System.out.println("Test in second class");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("After Test");
    }

}
