package Selenium;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
HashMap<Integer,String> hs=new HashMap<Integer,String>();
hs.put(101,"Anand");
hs.put(102,"Babloo");
hs.put(103,"Vidya");
hs.put(104,"Dhanush");
System.out.println(hs);
hs.remove(102);
System.out.println(hs);
	}

}
