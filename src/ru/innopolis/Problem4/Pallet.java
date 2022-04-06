package Problem4;

public class Pallet implements Sneakable {
  public Pallet(String name, Sneakable[] products_to_put) {
    this.name = name;
    this.products = products_to_put;
  }
  
  public final String name;

  // Made public so that it is easy to be accessed from outside, but doesn't break anything (i.e. that's a feature that you can change the set of products in a pallet freely)
  public Sneakable[] products;

  public void sneak_in() {
    System.out.println("this is Pallet: " + name + " Contains the Following:");
    for (Sneakable product : products) {
      product.sneak_in();
    }
  }
}