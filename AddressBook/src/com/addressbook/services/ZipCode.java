package com.addressbook.services;

import java.util.Comparator;
import com.addressbook.model.*;

public class ZipCode implements Comparator<Address> {
	@Override
	public int compare(Address zip1, Address zip2) {
		if (zip1.getZipCode().hashCode() < zip2.getZipCode().hashCode()) return -1; 
        if (zip1.getZipCode().hashCode() > zip2.getZipCode().hashCode()) return 1; 
        else return 0;
	}

}
