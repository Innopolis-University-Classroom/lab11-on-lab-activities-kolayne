package Problem4;

class Main {
  public static void main(String[] args) {
    Pallet electronics = new Pallet("Electronics", new Sneakable[] {
      new Product("Charger", 13),
      new Product("Headset", 20)
    });
    
    Pallet women_clothes = new Pallet("Women Clothes", new Sneakable[] {
      new Product("Dress", 500),
      new Product("Skirt", 300)
    });
    Pallet men_clothes = new Pallet("Men Clothes", new Sneakable[] {
      new Product("Trousers", 5),
      new Product("T-shirt", 3)
    });
    Pallet clothes = new Pallet("Clothes", new Sneakable[] {women_clothes, men_clothes});

    Pallet store = new Pallet("Store", new Sneakable[] {electronics, clothes});

    store.sneak_in();
  }
}