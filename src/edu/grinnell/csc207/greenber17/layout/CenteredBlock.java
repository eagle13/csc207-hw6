package edu.grinnell.csc207.greenber17.layout;

public class CenteredBlock
    implements TextBlock
{
  // Fields
  TextBlock tb;
  int width;

  // Constructor
  public CenteredBlock(TextBlock tb, int width) throws Exception
  {
    this.width = width;
    this.tb = tb;
  } // CenteredBlock(TextBlock, int)

  /*
   * Centers the text within a TextBlock
   * spacesBefore finds how many spaces should be added before
   *    the word
   * spacesAfter finds how many spaces after the word
   * returns a TextBlock that is centered within a BoxedBlock
   * @pre length of the TextBlock has to be less than the 
   *      width entered
   */
  public String row(int i)
    throws Exception
  {
    // Spaces before the word
    int spacesBefore = (this.width - this.tb.width()) / 2;
    // Spaces after the word
    int spacesAfter = this.width - this.tb.width() - spacesBefore;

    return TBUtils.spaces(spacesBefore) + this.tb.row(i)
           + TBUtils.spaces(spacesAfter);
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
    return this.width;
  } // width()

} // class CenteredBlock
