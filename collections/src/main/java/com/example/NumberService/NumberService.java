package com.example.NumberService;

import java.util.HashSet;
import java.util.Set;

public class NumberService {
	int input = 0;
	private Set<Integer> somenumbers;
	
	public   NumberService() {
		somenumbers = new HashSet<>();
	}
	
	public  void addnum(int num ) {
		somenumbers.add(num);
	}
	
	public void removenum(int num) {
	
		somenumbers.remove(this.input);
	}
	
	public Integer inputnum(int num) {
		this.input = num;
		 return input;
	}
	
	public Set<Integer> viewnum() {
		return somenumbers;
	}
	

}
