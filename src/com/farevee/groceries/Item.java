package com.farevee.groceries;

public interface Item
{

  // Determines weight of item
  public Weight getWeight();
  
  // Determines price of item
  public int getPrice();
  
  // Turns item into a string
  public String toString();
  
} // interface Item
