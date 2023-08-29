package com.example.NumberService;

import java.util.HashSet;
import java.util.Set;

public class NumberService {
	String input = "";
	private Set<Integer> somenumbers;
	
	public   NumberService() {
		somenumbers = new HashSet<>();
	}
	
	public  void addnum(int num ) {
		somenumbers.add(num);
	}
	
	public void removenum(int num) {
		somenumbers.remove(num);
	}
	
	public String input(String input) {
		return this.input =input;
	}
	
	public Set<Integer> viewnum() {
		return somenumbers;
	}
	

}
