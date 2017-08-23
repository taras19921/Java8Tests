package main.inheritance;

public class Main
{

    public static void main(String[] args)
    {
	Animal animal = new Dog();
	animal.changeAge();
	System.out.println("Dog age = " + animal.age);
	animal = new Cat();
	animal.changeAge();
	System.out.println("Cat age = " + animal.age);

    }

}
