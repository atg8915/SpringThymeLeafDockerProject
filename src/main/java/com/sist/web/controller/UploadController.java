package com.sist.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UploadController {
	@GetMapping("/upload")
	public String uploadPage() {
		return "upload";
	}
	@GetMapping("/upload2")
	public String upload2Page() {
		return "upload2";
	}
	@GetMapping("/upload3")
	public String upload3Page() {
		return "upload3";
	}
}
