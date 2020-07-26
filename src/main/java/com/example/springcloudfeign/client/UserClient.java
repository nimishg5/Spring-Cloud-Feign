package com.example.springcloudfeign.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springcloudfeign.dto.UsersResponse;

@FeignClient(url="https://jsonplaceholder.typicode.com/", name="USER-CLIENT")
public interface UserClient {

	@GetMapping("/users")
	public List<UsersResponse> getUsers();
}
