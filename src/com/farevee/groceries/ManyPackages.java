package com.farevee.groceries;

public class ManyPackages
    implements Item
{

  // Fields
  Package type;
  int count;

  // Constructor
  public ManyPackages(Package type, int count)
  {
    this.type = type;
    this.count = count;
  } // ManyPackages(Package, int)

  /**
   * Produces a string
   */
  public String toString()
  {
    return this.count + " x " + this.getWeight().amount + " " + this.getWeight().unit + "s package of " + this.type.food.name;
  } // toString

  /**
   * returns a new weight
   */
  public Weight getWeight()
  {
    return new Weight(this.type.getWeight().unit(), (this.count * this.type.getWeight().amount()));
  } // getWeight()

  /**
   * gets the price of the unit times the amount
   */
  public int getPrice()
  {
    return this.count * this.type.getPrice();
  } // getPrice()

  /**
   * returns the count
   * (helps for the Cart class)
   */
  public int getCount()
  {
    return this.count;
  } // etCount()
  /**
   * Checks to see if other is equal to the ManyPackages
   */
  public boolean equals(Object other)
  {
    if (this == other)
      {
        return true;
      } // if
    else if (other instanceof ManyPackages)
      {
        return this.equals((ManyPackages) other);
      } // else if
    else
      {
        return false;
      } // else
  } // equals(Object)

  /**
   * Checks to see if the manyPackages are equal to each other
   * @param manyPackages
   * @return true if equal or false if not
   */
  public boolean equals(ManyPackages manyPackages)
  {
    return (this.type.equals(manyPackages.type))
        && (this.count == manyPackages.count); 
  } // equals (manyPackages)

} // class ManyPackages
