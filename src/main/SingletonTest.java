package main;

import java.util.List;

public class SingletonTest implements Runnable
{

    @Override
    public void run()
    {
	int i = 0;
	while (i < 100)
	{

	    List<Integer> list = Singleton.getInstance();
	    list.add(i++);
	    System.out.println("list.size(): " + list.size());
	}

    }

}
