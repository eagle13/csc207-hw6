package com.farevee.groceries;

public class NonFood
{
  //fields
  String name;
  Weight weight;
  int price;
  
  // constructor
  public NonFood(String name, Weight weight, int price)
  {
    this.name = name;
    this.weight = weight;
    this.price = price;
  } // NonFood(String, Weight, int)

  /**
   * Produces a string of the name
   */
  public String toString()
  {
    return this.name;
  } // toString

  /**
   * returns the weight of the NonFood
   */
  public Weight getWeight()
  {
    return this.weight;
  } // getWeight()

  /**
   * gets the price of the NonFood
   */
  public int getPrice()
  {
    return this.price;
  } // getPrice()

  /**
   * Checks to see if other is equal to the NonFood
   */
  public boolean equals(Object other)
  {
    if (this == other)
      {
        return true;
      } // if
    else if (other instanceof NonFood)
      {
        return this.equals((NonFood) other);
      } // else if
    else
      {
        return false;
      } // else
  } // equals(NonFood)

  /**
   * Checks to see if the NonFoods are equal to each other
   * @param nonFood
   * @return true if equal or false if not
   */
  public boolean equals(NonFood nonFood)
  {
    return (nonFood.name.equals(this.name))
           && (nonFood.weight.equals(this.weight))
           && (nonFood.price == this.price);
  } // equals (nonFood)

} // class NonFood
