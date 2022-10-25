import java.util.Scanner;
class StockItem
{
    //attributes
    String name;
    String description;
    static int count;
    int id;
    float price;
    int quantity;

    // constructors

    StockItem()
    {
        name = "";
        description = "";
        id = count;
	count++
        price = 0.00f;
        quantity = 0;
    }

    StockItem(String n, String d, float p, int q)
    {
        name = n;
        description = d;
        id = count;
	count++;
        price = p;
        quantity = q;
    }

    // getters and setters
    public String getDescription()
    {
        return description;
    }
    public int getID()
    {
        return id;
    }
    public float getPrice()
    {
        return price;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setPrice()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the new price for " + name + "?");
        float tempPrice = scan.nextFloat();
        if (tempPrice < 0)
        {
            System.out.println("ERROR: Price must be non-negative");
        }
        else
        {
            price = tempPrice;
        }
    }
    public void setQuantity(int r)
    {
        if (quantity - r < 0)
        {
            System.out.println("ERROR: Quantity must be non-negative");
        }
        else
        {
            quantity = quantity - r;
        }
    }
    public void raiseQuantity(int t)
    {
        quantity = quantity + t;
    }

    // extras
    public String toString()
    {
        return String.format("%s: Item number: %d. %s has price %.2f. We currently have %d in stock.", name, id, description, price, quantity);
                // name + ": Item number: " + id + ". " + description + " has price " + String.format("%.2f", price) + " we currently have " + quantity + " in stock";
    }
}