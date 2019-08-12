/**
 * 
 */
package com.test;

 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

 
import com.server.EntityController;

/**
 * @author Prakash
 *
 */
public class EntityControllerTest {
	
	EntityController controller;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		  controller = new EntityController();
		  
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		controller = null;
	}

	/**
	 * Test method for {@link com.server.EntityController#doAddAction()}.
	 */
	@Test
	public final void testDoAddAction() {
		controller.doAddAction();
	}

	/**
	 * Test method for {@link com.server.EntityController#doEditAction()}.
	 */
	@Test
	public final void testDoEditAction() {
		controller.doEditAction();
	}

	/**
	 * Test method for {@link com.server.EntityController#doViewAction()}.
	 */
	@Test
	public final void testDoViewAction() {
		controller.doViewAction();
	}

	/**
	 * Test method for {@link com.server.EntityController#doDeleteAction()}.
	 */
	@Test
	public final void testDoDeleteAction() {
		controller.doDeleteAction();
	}

	/**
	 * Test method for {@link com.server.EntityController#doSearchAction()}.
	 */
	@Test
	public final void testDoSearchAction() {
		controller.doSearchAction();
	}

}
