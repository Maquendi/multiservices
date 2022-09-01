package com.frontdesk.appplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.commerce.facade.CommerceProductServiceFacade;
import com.commerce.facade.CommerceUserServiceFacade;

@RestController
@RequestMapping("ping")
public class TestController {
	
	
	private CommerceProductServiceFacade commerceProductServiceFacade;
	
	private CommerceUserServiceFacade commerceUserServiceFacade;
	
	@Autowired
	public TestController(CommerceProductServiceFacade facade, CommerceUserServiceFacade userfacade) {
		this.commerceProductServiceFacade = facade;
		this.commerceUserServiceFacade = userfacade;
	}
	
	@GetMapping
	public ResponseEntity<String> ping() {
		return ResponseEntity.ok("pong");
	}
	
	@GetMapping("/salute")
	public ResponseEntity<?> salute() {
		return ResponseEntity.ok(
				this.commerceUserServiceFacade.getUser("wow")
				); 
	}
	
	@GetMapping("/prod/{id}")
	public ResponseEntity<?> testIt(@PathVariable("id") String proId) {
		return ResponseEntity.ok(
				commerceProductServiceFacade.findById(proId)
				); 
	}
}
