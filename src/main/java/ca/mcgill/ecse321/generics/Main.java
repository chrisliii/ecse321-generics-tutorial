package ca.mcgill.ecse321.generics;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main( String[] args )
    {
        // TODO
    	List l = new ArrayList();
    	l.add("Hello");
    	l.add("World");
    	for (Object object : l) {
    		System.out.println(object);
    	}
    	SwapUtil.swap(l, 0, 1);
    	for (Object object : l) {
    		System.out.println(object);
    	} 
    }
}
