package com.tnsif.acessmodifierdemo;

public class Accessdemo {
	
		// public - same package and same class
		public int a=9;
		public String s="Bibi";
		
		public void display() {
			System.out.println("welcome to java");
		}
		
		public static void main(String[] args) {
			Accessdemo obj=new Accessdemo();
			System.out.println(obj.a);
			System.out.println(obj.s);
			
			obj.display();
		}

	}



