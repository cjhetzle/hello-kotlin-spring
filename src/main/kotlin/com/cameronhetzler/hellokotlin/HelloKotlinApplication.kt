package com.cameronhetzler.hellokotlin

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class HelloKotlinApplication

fun main(args: Array<String>) {
	runApplication<HelloKotlinApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}

@RestController
 class Message {
	@GetMapping("/")
	fun home(): String {
		return "Hello There"
	}

	@GetMapping("/blog")
	fun blog(model: Model): String {
		model["title"] = "Blog"
		return "blog"
	}
}