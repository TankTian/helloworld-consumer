package com.helloworld.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.helloworld.consumer.remote.HelloWorldRemote;

@RestController
public class HelloWorldConsumer {
	@Autowired
	HelloWorldRemote helloWorldRemote;

	@GetMapping("/hello/{name}")
	public String index(@PathVariable("name") String name) {
		return helloWorldRemote.hello(name);
	}
}
