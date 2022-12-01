package com.RaiseTech.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloWorld {
	@GetMapping ("/hello")
	public String greeting(@RequestParam (value = "country", defaultValue = "World!") String country) {
		return String.format("Hello %s!", country);
	}
	@GetMapping ("/time")
	private String getTime() {
		DateTimeFormatter dateTimeFormatterOfTokyo = DateTimeFormatter.ofPattern("yyyy/MM/dd HH時mm分ss秒");
		String todayDate = LocalDateTime.now().format(dateTimeFormatterOfTokyo);
		return String.format("現在の東京の日時は %s です。", todayDate);
	}
}
