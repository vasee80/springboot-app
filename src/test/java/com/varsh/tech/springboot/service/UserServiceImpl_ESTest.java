/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 09 05:51:19 GMT 2017
 */

package com.varsh.tech.springboot.service;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.varsh.tech.springboot.model.User;
import com.varsh.tech.springboot.service.UserServiceImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UserServiceImpl_ESTest extends UserServiceImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UserServiceImpl userServiceImpl0 = new UserServiceImpl();
      User user0 = userServiceImpl0.findByName("Sam");
      //  // Unstable assertion: assertNull(user0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UserServiceImpl userServiceImpl0 = new UserServiceImpl();
      User user0 = userServiceImpl0.findByName("8UC_'TN");
      assertNull(user0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UserServiceImpl userServiceImpl0 = new UserServiceImpl();
      User user0 = userServiceImpl0.findById(1672L);
      assertNull(user0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UserServiceImpl userServiceImpl0 = new UserServiceImpl();
      // Undeclared exception!
      try { 
        userServiceImpl0.saveUser((User) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.varsh.tech.springboot.service.UserServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UserServiceImpl userServiceImpl0 = new UserServiceImpl();
      // Undeclared exception!
      try { 
        userServiceImpl0.isUserExist((User) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.varsh.tech.springboot.service.UserServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UserServiceImpl userServiceImpl0 = new UserServiceImpl();
      User user0 = userServiceImpl0.findByName("&45]W,");
      assertNull(user0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UserServiceImpl userServiceImpl0 = new UserServiceImpl();
      User user0 = new User();
      boolean boolean0 = userServiceImpl0.isUserExist(user0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UserServiceImpl userServiceImpl0 = new UserServiceImpl();
      User user0 = new User(35L, "Sam", 1908, 35L);
      userServiceImpl0.saveUser(user0);
      userServiceImpl0.isUserExist(user0);
      user0.setSalary((-599.09904425));
      userServiceImpl0.deleteUserById(1672L);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UserServiceImpl userServiceImpl0 = new UserServiceImpl();
      User user0 = userServiceImpl0.findById(0);
      assertNull(user0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UserServiceImpl userServiceImpl0 = new UserServiceImpl();
      User user0 = new User(35L, "Sam", 0, 35L);
      // Undeclared exception!
      try { 
        userServiceImpl0.updateUser(user0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UserServiceImpl userServiceImpl0 = new UserServiceImpl();
      userServiceImpl0.deleteAllUsers();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UserServiceImpl userServiceImpl0 = new UserServiceImpl();
      User user0 = new User(35L, "Sam", 0, 35L);
      userServiceImpl0.saveUser(user0);
      userServiceImpl0.updateUser(user0);
      //  // Unstable assertion: assertEquals(15L, user0.getId());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UserServiceImpl userServiceImpl0 = new UserServiceImpl();
      userServiceImpl0.findAllUsers();
      User user0 = new User();
      user0.setName("JfFB&O0U IHAdM|2Ek");
      user0.setSalary(0.0);
      user0.setName("Sam");
      userServiceImpl0.deleteUserById((-808L));
      user0.setName(", age=");
      userServiceImpl0.deleteUserById(1L);
      userServiceImpl0.saveUser(user0);
      assertEquals(6L, user0.getId());
      
      user0.setId((-808L));
      User user1 = userServiceImpl0.findByName(", age=");
      assertSame(user1, user0);
  }
}
