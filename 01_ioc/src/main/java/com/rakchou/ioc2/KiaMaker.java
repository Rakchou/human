package com.rakchou.ioc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;
@Service("km")
public class KiaMaker implements CarMaker{
	@Setter
	@Autowired
	private Car car;
	
	@Override
	public Car sell(Money money) {
		System.out.println("금액 : " + money.getAmount());
//		return new Car("K5");
		return car;
	}
	
}
