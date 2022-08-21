package a2z.uat.tests;

import org.testng.annotations.Test;

import a2z.uat.pages.SupplierAddProducts;
import a2z.uat.pages.SupplierDashboard;
import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.SupplierMyProducts;


import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;

public class SupplierMyProductsTest {
	
	AmazonLogin applicationLogin;
	SupplierDashboard supplierDashboard;
	SupplierMyProducts supplierMyProducts;
	SupplierAddProducts supplierAddProducts;
 
  @BeforeMethod
  public void beforeMethod(Method me) {
	  applicationLogin = new AmazonLogin();
	  supplierDashboard = new SupplierDashboard();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }
  
  /*@Test(priority=1)
  public void searchAvailableProduct() throws InterruptedException{
	  productsPage =  dashboardPage.clickMyProducts();
	  System.out.println("User is on products page!");
	  productsPage.searchProduct(); 
  }*/
  
  @Test(priority=1)
  public void createNewProduct() throws InterruptedException, IOException {
	  supplierMyProducts =  supplierDashboard.clickMyProducts();
	  System.out.println("User is on products page!");
	  supplierAddProducts = supplierMyProducts.createProduct();
	  supplierAddProducts.createNewProduct();
  }
  
  @AfterMethod
  public void afterMethod() {
  }

}
