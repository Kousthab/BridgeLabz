package com.addressbook.services;

import java.util.Comparator;
import com.addressbook.model.*;

public class Name implements Comparator<Person> {
	@Override
	public int compare(Person n1, Person n2) {
		if (n1.getName().hashCode()< n2.getName().hashCode()) return -1; 
        if (n1.getName().hashCode() > n2.getName().hashCode()) return 1; 
        else return 0;
	}
	

}
