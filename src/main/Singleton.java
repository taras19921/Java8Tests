package main;

import java.util.ArrayList;
import java.util.List;

public class Singleton
{
    private static List<Integer> list;

    public Singleton() {
	super();
    }
    
    public static List<Integer> getInstance() {
	
	if (list == null)
	{
	    list = new ArrayList<>();
	}
	return list;
    }
}
