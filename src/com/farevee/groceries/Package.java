package com.farevee.groceries;

public class Package
    implements Item
{

  // Fields
  BulkFood food;
  Units unit;
  int amount;

  // Constructor
  public Package(BulkFood food, Units unit, int amount)
  {
    this.food = food;
    this.unit = unit;
    this.amount = amount;
  } // Package(BulkFood, Units, int)

  /**
   * Produces a string that includes the weight, the word
   * "package" and the name
   */
  public String toString()
  {
    return this.amount + " " + unit + " package of " + this.food.name;
  } // toString

  /**
   * returns a new weight
   * if the unit doesn't match the unit of the given 
   *   BulkFood, then an error is given
   */
  public Weight getWeight()
  {
    if (this.unit != food.unit)
      {
        try
          {
            throw new Exception("Units do not match");
          } // try
        catch (Exception e)
          {
            // TODO Auto-generated catch block
            e.printStackTrace();
          } // catch
      } // if
    else
      {
        return new Weight(this.unit, this.amount);
      } // else
    return null;
  } // getWeight()

  /**
   * gets the price of the unit times the amount
   */
  public int getPrice()
  {
    return this.food.pricePerUnit * this.amount;
  } // getPrice()

  /**
   * Checks to see if other is equal to the Package
   */
  public boolean equals(Object other)
  {
    if (this == other)
      {
        return true;
      } // if
    else if (other instanceof Package)
      {
        return this.equals((Package) other);
      } // else if
    else
      {
        return false;
      } // else
  } // equals(Object)

  /**
   * Checks to see if the Packages are equal to each other
   * @param pack
   * @return true if equal or false if not
   */
  public boolean equals(Package pack)
  {
    return (pack.food.equals(this.food)) && (pack.unit.equals(this.unit))
           && (pack.amount == this.amount);
  } // equals (Package)

} // class Package
