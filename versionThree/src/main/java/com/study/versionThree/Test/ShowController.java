package com.study.versionThree.Test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {
	@GetMapping("show/hello")
	public String Show() {
		return "<h1>Hello Spring boot</h1>";
	}
}
