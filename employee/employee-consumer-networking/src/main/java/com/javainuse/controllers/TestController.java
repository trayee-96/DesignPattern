package com.javainuse.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

@RestController
@RequestMapping("/employees")
public class TestController {
@Autowired
 ConsumerControllerClient client;
@GetMapping
public String getEmpl() throws RestClientException, IOException {
	return client.getEmployee();
}
}
