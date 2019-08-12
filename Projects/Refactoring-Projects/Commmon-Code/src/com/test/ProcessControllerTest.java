/**
 * 
 */
package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.server.ProcessController;

 

/**
 * @author Prakash
 *
 */
public class ProcessControllerTest {
	
	ProcessController controller;
	

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		  controller = new ProcessController();
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		  controller = null;
		
	}

	/**
	 * Test method for {@link com.server.ProcessController#doAddAction()}.
	 */
	@Test
	public final void testDoAddAction() {
		controller.doAddAction();
	}

	/**
	 * Test method for {@link com.server.ProcessController#doEditAction()}.
	 */
	@Test
	public final void testDoEditAction() {
		controller.doEditAction();
	}

	/**
	 * Test method for {@link com.server.ProcessController#doViewAction()}.
	 */
	@Test
	public final void testDoViewAction() {
		controller.doViewAction();
	}

	/**
	 * Test method for {@link com.server.ProcessController#doDeleteAction()}.
	 */
	@Test
	public final void testDoDeleteAction() {
		controller.doDeleteAction();
	}

	/**
	 * Test method for {@link com.server.ProcessController#doSearchAction()}.
	 */
	@Test
	public final void testDoSearchAction() {
		controller.doSearchAction();
	}

}
