package com.rakchou.ioc2;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import lombok.Setter;

@Setter
@Service
public class OrderManager {
//	@Qualifier("km")
//	@Resource	
//	@Inject
	@Autowired
	private CarMaker maker;
	@Autowired
	private Money money;
	
//	public OrderManager(){
//		this.maker = new KiaMaker();
//	}
	
	public void order() {
		Car car = maker.sell(money);
		System.out.println("차량 이름 : " + car.getName());
	}
}
