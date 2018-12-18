package com.cg.sports.test;

import java.sql.Connection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.sports.dao.ISportsDAOImpl;
import com.cg.sports.exception.SportsException;
import com.cg.sports.util.DBConnection;

public class DBConnectionTest {
	static ISportsDAOImpl daotest;
	static Connection dbCon;

	@BeforeClass
	public static void initialise() {
		daotest = new ISportsDAOImpl();
		dbCon = null;
	}

	@Before
	public void beforeEachTest() {
		System.out.println("----Starting DBConnection Test Case----\n");
	}

	
	@Test
	public void test() throws Exception {
		Connection dbCon = DBConnection.getConnection();
		Assert.assertNotNull(dbCon);
	}

	@After
	public void afterEachTest() {
		System.out.println("----End of DBConnection Test Case----\n");
	}

	@AfterClass
	public static void destroy() {
		System.out.println("\t----End of Tests----");
		daotest = null;
		dbCon = null;
	}

}
