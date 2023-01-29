package Selenium;

import java.util.ArrayList;

public class Arrayliiist {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("Meha");
		al.add('G');
		al.add(null);
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		al.add(2,500);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		
	}

}
