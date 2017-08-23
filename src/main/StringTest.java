package main;

public class StringTest
{

    public static void main(String[] args)
    {
	String text = "DdF\nsdsds sdBaaVs\n saddsSe";
	text = text.replaceAll("\\s+","_").toLowerCase();
	System.out.println("text: " + text);

    }

}
