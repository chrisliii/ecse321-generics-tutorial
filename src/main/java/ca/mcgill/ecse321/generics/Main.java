package ca.mcgill.ecse321.generics;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main( String[] args )
    {
        // TODO
    	List<String> l = new ArrayList<String>();
    	l.add("Hello");
    	l.add("World");
    	for (Object object : l) {
    		System.out.println(object);
    	}
    	SwapUtil.<String>swap(l, 0, 1);
    	for (Object object : l) {
    		System.out.println(object);
    	} 
    	
    	List<Integer> l2 = new ArrayList<Integer>();
    	l2.add(0);
    	l2.add(1);
    	for (Object object : l2) {
    		System.out.println(object);
    	}
    	SwapUtil.<Integer>swap(l2, 0, 1);
    	for (Object object : l2) {
    		System.out.println(object);
    	}
    }
}
