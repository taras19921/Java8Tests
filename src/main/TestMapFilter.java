package main;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMapFilter
{

    public static void main(String[] args)
    {

	Map<Integer, String> siteMap = new HashMap<>();
	for (int i = 0; i < 1000; i++)
	{
	    if (i % 10 == 0)
	    {
		siteMap.put(i, "linode.com");
	    } else if (i % 50 == 0)
	    {
		siteMap.put(i, "aws.amazon.com");
	    }
	}

	String result = "";
	long startJava7Time = new Date().getTime();
	for (Map.Entry<Integer, String> entry : siteMap.entrySet())
	{
	    if ("aws.amazon.com".equals(entry.getValue()))
	    {
		result = entry.getValue();
	    }
	}
	long java7Time = new Date().getTime() - startJava7Time;
	System.out.println("Before Java 8 : " + result + "java7Time: " + java7Time);

	// Map -> Stream -> Filter -> String
	long startJava8Time = new Date().getTime();
	result = siteMap.entrySet().stream().filter(map -> "aws.amazon.com".equals(map.getValue())).filter(map -> map.getKey().toString().length() == 10).map(map -> map.getValue())
		.collect(Collectors.joining());
	long java8Time = new Date().getTime() - startJava8Time;

	System.out.println("With Java 8 : " + result + "java8Time: " + java8Time);

    }
}