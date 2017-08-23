package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest
{

    private static Map<String, String> drivers = new HashMap<>();
	
    public static void main(String[] args)
    {
	
	String neoHelper = getInstanceFromPool("string1", "42");
	workWithHashMap();

    }

    private static void workWithHashMap()
    {
	Map<String, String> graphConnectionsPool = new HashMap<>();
	graphConnectionsPool.put("string1", "42");
	graphConnectionsPool.put("string2", "41");
	String value =
	    graphConnectionsPool.entrySet().stream()
	    .filter(e -> e.getValue().equals("Donkey"))
	    .map(Map.Entry::getKey)
	    .findFirst()
	    .orElse(null);
	
    }
    
    public static String getInstanceFromPool(String host, String url)
    {

	Map<String, String> graphConnectionsPool = new HashMap<>();
	graphConnectionsPool.put("string1", "42");
	graphConnectionsPool.put("string2", "41");
	Optional<String> neoHelperStr =
	    graphConnectionsPool.entrySet().stream()
	    .filter(graphConnection -> !graphConnection.getKey().equals(url) && !graphConnection.getValue().equals(host))
	    .map(graphConnection -> new String(graphConnection.getValue()))
	    .map(graphConnection -> drivers.put("dde", graphConnection))
	    .findAny();
	String neoHelper = neoHelperStr.get();
	return neoHelper;
    }

}
