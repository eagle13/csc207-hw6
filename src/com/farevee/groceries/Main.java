package com.farevee.groceries;

import java.io.PrintWriter;

public class Main
{

  public static void main(String[] args)
  {
    PrintWriter pen = new PrintWriter(System.out, true);
    // The store has 20 pounds of bananas, priced at 50 cents per pound
    BulkFood bananas = new BulkFood("bananas", Units.POUNDS, 50, 20);
    // The store has 200 grams of saffron, priced at 1000 cents per gram
    BulkFood saffron = new BulkFood("saffron", Units.GRAMS, 1000, 200);
    
    pen.println(bananas.name);
    pen.println(bananas.unit);
    pen.println(bananas.pricePerUnit);
    pen.println(bananas.supply);
    pen.println("\n");
    
    pen.println(saffron.name);
    pen.println(saffron.unit);
    pen.println(saffron.pricePerUnit);
    pen.println(saffron.supply);
    pen.println("\n");
    
    Weight weightRing = new Weight (Units.POUNDS, 3);
    NonFood ring = new NonFood("ring", weightRing, 120);
    NonFood shirt = new NonFood("shirt", weightRing, 240);
    
    pen.println(ring.toString());
    pen.println(ring.getWeight().unit());
    pen.println(ring.getWeight().amount());
    pen.println(ring.getPrice());
    pen.println(ring.equals(ring));
    pen.println(ring.equals(shirt));
    pen.println("\n");
    
    BulkItem banana = new BulkItem(bananas, Units.POUNDS, 3);
    pen.println(banana.toString());
    pen.println(banana.getWeight().unit());
    pen.println(banana.getWeight().amount());
    pen.println(banana.getPrice());
    pen.println(banana.equals(banana));
    pen.println(banana.equals(shirt));
    pen.println("\n");
    
    BulkContainer fruit = new BulkContainer("bag", bananas, Units.POUNDS, 5);
    pen.println(fruit.toString());
    pen.println(fruit.getWeight().unit());
    pen.println(fruit.getWeight().amount());
    pen.println(fruit.getPrice());
    pen.println(fruit.equals(banana));
    pen.println(fruit.equals(fruit));
    pen.println("\n");
    
    Package bag = new Package(saffron, Units.GRAMS, 6);
    pen.println(bag.toString());
    pen.println(bag.getWeight().unit());
    pen.println(bag.getWeight().amount());
    pen.println(bag.getPrice());
    pen.println(bag.equals(bag));
    pen.println(bag.equals(fruit));
    pen.println("\n");
    
    ManyPackages packages1 = new ManyPackages (bag, 6);
    pen.println(packages1.toString());
    pen.println(packages1.getWeight().unit());
    pen.println(packages1.getWeight().amount());
    pen.println(packages1.getPrice());
    pen.println(packages1.equals(packages1));
    pen.println(packages1.equals(fruit));
    pen.println("\n");
    
    pen.close();
  }

}
