package a2z.uat.tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a2z.uat.base.BaseClass;
import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.SupplierDashboard;
import a2z.uat.pages.SupplierDeliveryArea;
import a2z.uat.pages.SupplierSubscription;

public class SupplierSubscriptionTest extends BaseClass {
	AmazonLogin applicationLogin;
	SupplierDashboard supplierDashboard;
	SupplierSubscription supplierSubscription;
  
  @BeforeMethod
  public void beforeMethod(Method me) {
	  applicationLogin = new AmazonLogin();
	  supplierDashboard = new SupplierDashboard();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }

  @AfterMethod
  public void afterMethod() {
  }
  
 @Test(enabled=false)
  public void Add_Delivery_Once() throws InterruptedException, IOException { 
	 supplierSubscription = supplierDashboard.clickSubscription();
	 supplierSubscription.Add_Subscription_DeliveryOnce();
  }
 @Test(enabled=false)
  public void Add_Subscription() throws InterruptedException, IOException {
	 supplierSubscription = supplierDashboard.clickSubscription();
	 supplierSubscription.Add_Subscription_Subscription();
  }
   
 @Test(enabled=false)
  public void PlaceOrder_ExistingSubscription() throws InterruptedException, IOException {
	 supplierSubscription = supplierDashboard.clickSubscription();
	 supplierSubscription.Place_Order_FromExistingProduct();
	}
  @Test(enabled=false)
  public void CancelOrder_ExistingSubscription() throws InterruptedException, IOException {
	  supplierSubscription = supplierDashboard.clickSubscription();
	  supplierSubscription.Cancel_Order_FromExistingProduct();
	}
  @Test(enabled=false)
  public void Vacation_DateChange() throws InterruptedException, IOException {
	  supplierSubscription = supplierDashboard.clickSubscription();
	  supplierSubscription.Change_Vacation_Dates();
	}
  @Test(enabled=false)
  public void Customer_End_Vacation() throws InterruptedException, IOException {
	  supplierSubscription = supplierDashboard.clickSubscription();
	  supplierSubscription.End_Vacation();
	}
  @Test(enabled=false)
  public void Customer_Set_Vacation() throws InterruptedException, IOException {
	  supplierSubscription = supplierDashboard.clickSubscription();
	  supplierSubscription.Set_Vacation();
	}
@Test(priority=1)
  public void Approve_PendingApprovals() throws InterruptedException {
	supplierSubscription =supplierDashboard.scrollNavigationBar();
	supplierSubscription.ApprovePendingApproval();
	}
  @Test(enabled=false)
  public void Reject_PendingApprovals() throws InterruptedException {
	  supplierSubscription =supplierDashboard.scrollNavigationBar();
	  supplierSubscription.RejectPendingApproval();
	}
 
  @Test(enabled=false)
  public void Edit_ApprovePendingApprovals() throws InterruptedException, IOException {
	  supplierSubscription =supplierDashboard.scrollNavigationBar();
	  supplierSubscription.Edit_ApprovePendingApprovals();
	}
  @Test(enabled=false)
  public void Edit_RejectPendingApprovals() throws InterruptedException, IOException {
	  supplierSubscription =supplierDashboard.scrollNavigationBar();
	  supplierSubscription.Edit_RejectPendingApprovals();
	}
  

}
