package com.farevee.groceries;

public class BulkItem
    implements Item
{

  // Fields
  BulkFood food;
  Units unit;
  int amount;

  // Constructor
  public BulkItem(BulkFood food, Units unit, int amount)
  {
    this.food = food;
    this.unit = unit;
    this.amount = amount;
  } // BulkItem(BulkFood, Units, int)

  /**
   * Produces a string
   */
  public String toString()
  {
    return this.amount + " " + this.unit + "s of " + this.food.name;
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
   * Checks to see if other is equal to the BulkItem
   */
  public boolean equals(Object other)
  {
    if (this == other)
      {
        return true;
      } // if
    else if (other instanceof BulkItem)
      {
        return this.equals((BulkItem) other);
      } // else if
    else
      {
        return false;
      } // else
  } // equals(Object)

  /**
   * Checks to see if the BulkItems are equal to each other
   * @param bulkItem
   * @return true if equal or false if not
   */
  public boolean equals(BulkItem bulkItem)
  {
    return (bulkItem.food.equals(this.food))
           && (bulkItem.unit.equals(this.unit))
           && (bulkItem.amount == this.amount);
  } // equals (BulkItem)

} // class BulkItem
