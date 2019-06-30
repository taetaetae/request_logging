package com.taetaetae.request_logging.sample;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class SampleController {

	@GetMapping("/test1")
	public String test1(@RequestParam String id) {
		log.info("id : {}", id);
		return "length : " + id.length();
	}

	@PostMapping("/test2")
	public String test2(@RequestBody List<String> list) {
		return "length : " + list.stream().map(String::length);
	}

}
