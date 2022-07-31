package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {
 
	public static void main(String[] args) {
		Employee e=new Employee(1,"sudeep");
		Employee e1=new Employee(2,"Mukesh");
		
		
		Set<Employee> list=new HashSet<Employee>();
		list.add(e);
		list.add(e1);
		
		
		Iterator<Employee> itr=list.iterator();
		
		while(itr.hasNext()) {
			Employee emp=itr.next();
			System.out.println("id="+emp.eid+"name="+emp.name);
		}

	}

}
