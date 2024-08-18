package com.sssvt.general.javaprogram;

import java.util.Comparator;

/**
 * 
 * @author smamilla
 *
 */
public abstract class AgeSorter implements Comparator<Employee>{
	 
	@Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }

}
