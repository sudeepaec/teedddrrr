package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap=new HashMap<Integer,String>();
		hashMap.put(1, "computer");
		hashMap.put(2, "pen");
		hashMap.put(3, "notebook");
		Set set=hashMap.entrySet();
		Iterator itr=set.iterator();
		   while(itr.hasNext()) {
			  Map.Entry m=(Entry) itr.next();
			   System.out.println("key="+m.getKey()+"value="+m.getValue());
		   }
	}
}
