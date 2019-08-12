package org.data.service;

public class AccountDao {

	public void update(int num, String message) {
		System.out.println("AccountDao.update() with "+message);
		
	}

	public void log(String message) {
		System.out.println("AccountDao.log() with "+message);
		
	}

	public void login(int pin, String name) {
		System.out.println("AccountDao.login() for "+name);
		
	}

	public boolean updatePin(int num, int newPin, int otp) {
		System.out.println("AccountDao.updatePin() with "+otp);
		return true;
	}

}
