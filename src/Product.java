public class Product
{
    private String name;
    private double price;

    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public void setPrice(double price)
    {
        if (price < 0)
        {
            System.out.println("Can't be otricalovo");
        } else
        {
            this.price = price;
        }
    }

    public static void main()
    {

        Product product = new Product("Keyboard", 5000.0);

        System.out.println("Nachal price: " + product.getPrice());

        product.setPrice(7500.0);

        System.out.println("After setPrice(7500.0): " + product.getPrice());

        product.setPrice(-1000.0);
        System.out.println("After setPrice(-1000.0): " + product.getPrice());
    }
}