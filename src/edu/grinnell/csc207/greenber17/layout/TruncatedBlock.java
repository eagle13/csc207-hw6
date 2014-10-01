package edu.grinnell.csc207.greenber17.layout;

public class TruncatedBlock
    implements TextBlock
{
  // fields:
  TextBlock tb;
  int widthNew;

  /**
   * Create a new truncated block of the specified width.
   */
  public TruncatedBlock(TextBlock tb, int width)
  {
    this.tb = tb;
    this.widthNew = width;
  } // TruncatedBlock(TextBlock, int)

  /**
   * Get the ith row of the block.
   * Shortening the word to go until this.widthNew
   */
  public String row(int i)
    throws Exception
  {
    return tb.row(i).substring(0, this.widthNew);
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
    return this.widthNew;
  } // width()
} // class TruncatedBlock

