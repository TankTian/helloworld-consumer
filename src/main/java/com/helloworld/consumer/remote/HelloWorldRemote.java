package com.helloworld.consumer.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "helloworld-provider")
public interface HelloWorldRemote {
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name);
}
