package com.example.NumberService;

import java.util.Scanner;

public class TestNumberService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberService number = new NumberService();
		System.out.println("The NumberService Set is empty: "  + number.viewnum());
		Scanner sc = new Scanner(System.in);
		Boolean active = true;
		while(active) {
			System.out.println("select input: add|remove|view|exit");
			String input = sc.nextLine();
			if(input.equals("add")) { 
				System.out.println("What number do you wish to add?");
				number.addnum(Integer.parseInt(sc.nextLine()));
				System.out.println("Adding number...");
			}else if(input.equals("remove")) { 
				System.out.println("What number do you wish to remove?");
				number.removenum(Integer.parseInt(sc.nextLine()));
				System.out.println("removing number ...");
			}else if(input.equals("view")) { 
				System.out.println("Getting Set....");
				System.out.println(number.viewnum());
			}else if(input.equals("exit")) { 
				System.out.println("Good By....");
				active = false;
				sc.close();
			}
			
		}
		}
	}