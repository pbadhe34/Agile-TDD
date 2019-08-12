package org.data;

import org.data.log.ScrollAccount;
import org.data.service.AccountDao;

public class Banking {
	
	  public void userLogin(int pin,String name,double cardNumber)
	  {
		  AccountDao dao = new AccountDao();
		  dao.login(pin,name);
		  dao.log("The user logged in  "+name);
	  }
	
	  public boolean withDrawAmount(int num,String name,int pin, double amount)
	  {
		  System.out.println("withDrawAmount for "+amount);
		  AccountDao dao = new AccountDao();
		  dao.update(num,"Amount WithDrawn");
		  dao.log("The amount withdraw by user "+name);
		  return true;
	  }
	  
	  public double depositAmountIntoUsersAccountAfterScrollingAtCounter(String name,int num, double amount)
	  {
		  System.out.println("Banking.depositAmountIntoUsersAccountAfterScrollingAtCounter()");
		  AccountDao dao = new AccountDao();
		  ScrollAccount obj = new ScrollAccount();
		  obj.scroll(name,num,"deposit");
		  dao.update(num,"Amount Depoisteed");
		  dao.log("The amount deposit by user "+name);
		  return amount;
	  }
	  
	  public boolean updateUserPin(int num,String name,int newPin,int otp)
	  {
		  AccountDao dao = new AccountDao();
		  boolean result = dao.updatePin(num,newPin,otp);
		  return result;
	  }

	  

}
