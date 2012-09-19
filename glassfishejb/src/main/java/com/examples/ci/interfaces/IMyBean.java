package com.examples.ci.interfaces;

import javax.ejb.Local;
import javax.jws.WebService;
@WebService
@Local
public interface IMyBean {
	
	 public int sum(int i, int j);
	 public int dif(int i, int j);
	 public int prod(int i, int j);
}
