package com.ihangjing.waimai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.ihangjing.waimai.dao")
public class WaimaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaimaiApplication.class, args);
	}

}

