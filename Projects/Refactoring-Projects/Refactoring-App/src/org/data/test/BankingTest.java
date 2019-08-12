package org.data.test;

import static org.junit.Assert.*;

import org.data.Banking;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankingTest {
	
	public Banking bank;

	@Before
	public void setUp() throws Exception {
		bank = new Banking();
	}

	@After
	public void tearDown() throws Exception {
		bank = null;
	}

	@Test
	public final void testUserLogin() {
		bank.userLogin(1234, "baba", 46578098766D);
	}

	@Test
	public final void testWithDrawAmount() {
		bank.withDrawAmount(1239, "DON", 8976, 1000.00);
	}

	@Test
	public final void testDepositAmountIntoUsersAccountAfterScrollingAtCounter() {
		bank.depositAmountIntoUsersAccountAfterScrollingAtCounter("Baba", 1234, 3456.98);
	}

	@Test
	public final void testUpdateUserPin() {
		bank.updateUserPin(123, "Baba", 657, 987654);
	}

}
