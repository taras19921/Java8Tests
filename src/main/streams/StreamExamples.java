package main.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamExamples
{

    public static List<String> list;

    public static void main(String[] args)
    {

	list = fillList(1000);

	long startConvertStreamTime = System.currentTimeMillis();
	String[] strings = list.stream().toArray(String[]::new);
	System.out.println("converting to Array with Steram: " + (System.currentTimeMillis() - startConvertStreamTime));
	startConvertStreamTime = System.currentTimeMillis();
	strings = new String[list.size()];
	strings = list.toArray(strings);
	System.out.println("converting to Array without Steram: " + (System.currentTimeMillis() - startConvertStreamTime));

    }

    private static List<String> fillList(int count)
    {
	list = new ArrayList<>();
	for (int i = 0; i < count; i++)
	{
	    list.add("sddsdsf");
	}
	return list;
    }

}
