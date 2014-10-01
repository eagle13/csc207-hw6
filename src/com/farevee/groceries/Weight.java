package com.farevee.groceries;

public class Weight
{

  // Fields
  Units unit;
  int amount;

  // Constructor
  public Weight(Units unit, int amount)
  {
    this.unit = unit;
    this.amount = amount;
  } // Weight (Units, int)

  /**
   * figures out the unit of the weight
   */
  public Units unit()
  {
    return this.unit;
  } // unit()

  /**
   * figures out the amount of the weight
   */
  public int amount()
  {
    return this.amount;
  } // amount ()
} // class Weight
