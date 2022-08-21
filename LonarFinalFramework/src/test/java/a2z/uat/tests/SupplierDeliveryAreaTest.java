package a2z.uat.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.lang.reflect.Method;


import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a2z.uat.base.BaseClass;
import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.SupplierCity;
import a2z.uat.pages.SupplierDashboard;
import a2z.uat.pages.SupplierDeliveryArea;
import a2z.uat.pages.SupplierUser;


public class SupplierDeliveryAreaTest extends BaseClass {
	AmazonLogin applicationLogin;
	SupplierDashboard supplierDashboard;
	SupplierDeliveryArea supplierDeliveryArea;
  
  @BeforeMethod
  public void beforeMethod(Method me) {
	  applicationLogin = new AmazonLogin();
	  supplierDashboard = new SupplierDashboard();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }

  @AfterMethod
  public void afterMethod() {
  }
  
   @Test(priority=0)
  public void Add_DeliveryArea() throws InterruptedException, IOException {
	   supplierDeliveryArea = supplierDashboard.clickDeliveryArea();
	   supplierDeliveryArea.Add_Delivery_Area();
  }
 @Test(priority=1)
  public void Edit_DeliveryArea() throws InterruptedException, IOException {
	 supplierDeliveryArea = supplierDashboard.clickDeliveryArea();
	 supplierDeliveryArea.Edit_Delivery_Area();
  }


}
