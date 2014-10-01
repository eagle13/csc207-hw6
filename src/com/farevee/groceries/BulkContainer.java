package com.farevee.groceries;

public class BulkContainer
    extends BulkItem
{
  // Fields
  String container;

  // Constructor
  public BulkContainer(String container, BulkFood food, Units unit, int amount)
  {
    super(food, unit, amount);
    this.container = container;

  } // BulkContainer(String, BulkFood, Units, int)

  /**
   * Produces a string that gives number of units, the
   * units, and the type of bulk food
   */
  public String toString()
  {
    return this.container + " of " + this.amount + " " + this.unit + "s of " + this.food.name;
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
   * Checks to see if other is equal to the BulkContainer
   */
  public boolean equals(Object other)
  {
    if (this == other)
      {
        return true;
      } // if
    else if (other instanceof BulkContainer)
      {
        return this.equals((BulkContainer) other);
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
  public boolean equals(BulkContainer bulkContainer)
  {
    return (bulkContainer.food.equals(this.food))
           && (bulkContainer.unit.equals(this.unit))
           && (bulkContainer.amount == this.amount)
           && (bulkContainer.container == this.container);
  } // equals (BulkItem)

} // class BulkContainer
