package com.edhy.catalogo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/catalogos/")
public class HelloController {

	@GetMapping("ping")
	public String mensaje() {
		return "Hola Mundo";
	}
}
