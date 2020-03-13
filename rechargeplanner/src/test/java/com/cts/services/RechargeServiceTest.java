package com.cts.services;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.cts.exceptions.InvalidRechargeDateException;
import com.cts.model.CustomerDetails;
import com.cts.service.RechargeService;

class RechargeServiceTest {
	
	RechargeService rechargeService;
	

	public RechargeServiceTest() {
		super();
		this.rechargeService = new RechargeService();
	}
	@Test
	public void testWhetherTheRechargeStatusIsActive() {
		System.out.println("hello");
		System.out.println(rechargeService);
		CustomerDetails customerDetails=new CustomerDetails("ksrao", "9505962345", "Airtel", new Date("2020-03-10"),"Airtel ABC Plan");
		boolean status=rechargeService.checkStatus(customerDetails);
		System.out.println(status);
		assertTrue(status);
	}
	@Test
	public void testWhetherTheRechargeStatusIsNotActive() {
		CustomerDetails customerDetails=new CustomerDetails();
		boolean status=rechargeService.checkStatus(customerDetails);
		assertFalse(status);
	}
	@Test
	public void testWhetherCheckStatusMethodThrowsException() throws InvalidRechargeDateException {
		CustomerDetails customerDetails=new CustomerDetails();
		boolean status=rechargeService.checkStatus(customerDetails);
		assertFalse(status);
		
	}
	@Test
	void testGetAllPackagesByPlanName() {

	}

	@Test
	void testGetAllPackages() {

	}

	@Test
	void testGetPackageNames() {
	}

	@Test
	void testGetPackage() {

	}

}
