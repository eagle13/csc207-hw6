package edu.grinnell.csc207.greenber17.layout;

public class BlockPair
    implements TextBlock
{
  // Field
  TextBlock tb;

  // Constructor
  public BlockPair(TextBlock tb)
  {
    this.tb = tb;
  } // BlockPair(TextBlock)

  /**
   * Doubles the word and returns it next to each other
   */
  public String row(int i)
    throws Exception
  {
    return this.tb.row(i) + this.tb.row(i);
  } // row(int)

  /**
   * Determine how many rows are in the block.
   */
  public int height()
  {
    return this.tb.height();
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width()
  {
    return this.tb.width() * 2;
  } // width()
} // class BlockPair
