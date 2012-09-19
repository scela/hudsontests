package com.examples.ci.glassfishejb;

import javax.ejb.Stateless;
import javax.jws.WebService;

import com.examples.ci.interfaces.IMyBean;
@WebService
@Stateless
public class MyBean implements IMyBean {
	
	public MyBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int sum(int i, int j) {

		return i + j;
	}

	@Override
	public int dif(int i, int j) {

		return i - j;
	}

	@Override
	public int prod(int i, int j) {

		return i * j;
	}
	
	

}
