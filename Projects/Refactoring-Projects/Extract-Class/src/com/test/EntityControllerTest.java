/**
 * 
 */
package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.server.ControllerClass;
import com.server.EntityController;

/**
 * @author Prakash
 *
 */
public class EntityControllerTest {

	/**
	 * @throws java.lang.Exception
	 */
	ControllerClass controller;
	
	 
	
	@Before
	public void setUp() throws Exception {
		controller = new EntityController();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.server.EntityController#doSearchAction()}.
	 */
	@Test
	public final void testDoSearchAction() {
		fail("Not yet implemented"); // TODO
	}

}
