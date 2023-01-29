package Selenium;

import java.util.Hashtable;

public class HashTable {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht= new Hashtable<Integer,String>();
		ht.put(101,"Java");
		ht.put(108,"Ruby");
		ht.put(110, "Python");
		System.out.println(ht);
		ht.remove(108,"Ruby");
		System.out.println(ht);
		
		
		
	}

}
