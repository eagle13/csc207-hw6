package edu.grinnell.csc207.greenber17.layout;

public class RightJustified
    implements TextBlock
{

  int width;
  TextBlock tb;

  public RightJustified(TextBlock tb, int width)
  {
    this.tb = tb;
    this.width = width;
  } // RightJustified(TextBlock, int)

  /**
   * @pre the width entered into RightJustified has to be
   * longer than the width of the word in the TextBlock.
   * returns a BoxedBlock with the words right justified.
   */
  public String row(int i)
    throws Exception
  {
    // Spaces before the word so the word can be 
    //  justified on the right
    int spacesStart = this.width - this.tb.width();

    return TBUtils.spaces(spacesStart) + this.tb.row(i);
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
} //class RightJustified
