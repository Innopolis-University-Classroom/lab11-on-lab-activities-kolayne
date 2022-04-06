package Problem4;

public class Product implements Sneakable {
  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }
  
  public final String name;
  public final int price;

  public void sneak_in() {
    System.out.println("  -This is a Product: " + name + " With Price: " + price + "$");
  }
}