package com.farevee.shopping;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;

import com.farevee.groceries.*;

public class Cart
{

  public int itemCounter;
  public int entriesCounter;
  public int totalPrice;

  public Cart()
  {
    this.itemCounter = 0;
    this.entriesCounter = 0;
    this.totalPrice = 0;
  } // Cart()

  /**
   * Adds an item to the cart
   * entriesCounter is incremented by one
   * itemCounter is incremented by one, or
   *   if item is of type ManyPackages, then
   *   it adds the amount that is in that package
   * @param item
   */
  public void addItem(Item item)
  {
    if (item instanceof ManyPackages)
      {
        this.itemCounter += ((ManyPackages)item).getCount();
        this.entriesCounter++;
      } // if
    else
      {
        this.itemCounter++;
        this.entriesCounter++;
      } // else
  } // addItem(item)

  /**
   * returns the number of items in the cart
   */
  public int numThings()
  {
    return this.itemCounter;
  } // numThings()

  /**
   * returns the number of entries in the cart
   */
  public int numEntries()
  {
    return this.entriesCounter;
  } // numEntries()
  

} // class Cart
