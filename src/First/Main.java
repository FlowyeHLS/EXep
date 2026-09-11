package First;

class Animal
{
    private String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void makeSound()
    {
        System.out.println("MakeSoundAnimal");
    }
}

class Dog extends Animal
{

    public Dog(String name)
    {
        super(name);
    }

    @Override
    public void makeSound()
    {
        System.out.println("Гав!");
    }
}

public class Main
{
    public static void main()
    {
        Dog dog = new Dog("Barbos");

        System.out.println(dog.getName());
        dog.makeSound();
    }
}