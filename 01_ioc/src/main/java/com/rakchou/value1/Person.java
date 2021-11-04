package com.rakchou.value1;

import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
public class Person {
	private String name = "홍길동";
	private int age = 20;
}
