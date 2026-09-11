package Second;

class Vehicle
{
    private int speed;

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        if (speed < 0)
        {
            System.out.println("Speed can't be otricalovo");
        }
        else
        {
            this.speed = speed;
        }
    }
}

class Car extends Vehicle
{
    private String brand;

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }
}

public class Main
{
    public static void main()
    {
        Car car = new Car();
        car.setSpeed(120);
        car.setBrand("Toyota");

        System.out.println("Marka avto: " + car.getBrand());
        System.out.println("Speed of avto: " + car.getSpeed());

        car.setSpeed(-50);

        System.out.println("Speed after try -50: "+ car.getSpeed());

    }
}