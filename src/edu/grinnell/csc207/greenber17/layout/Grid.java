package edu.grinnell.csc207.greenber17.layout;

public class Grid
    implements TextBlock
{
  // Fields
  int width;
  int height;
  char ch;

  // Constructor
  public Grid(int width, int height, char ch)
  {
    this.width = width;
    this.height = height;
    this.ch = ch;
  } // Grid (int, int, char)

  /**
   * Gets the width of the Grid
   */
  public int width()
  {
    return this.width;
  } // width ()

  /**
   * Gets the height of the Grid
   */
  public int height()
  {
    return this.height;
  } // height()

  /**
   * returns a string of width copies of ch
   * for all non-negative i less than height.
   */
  public String row(int i)
    throws Exception
  {
    StringBuffer resultCh = new StringBuffer();
    if (i > this.height || i < 0)
      {
        throw new Exception("Invalid i entered");
      } // if
    else
      {
        for (int j = 0; j < this.width; j++)
          {
            resultCh.append(this.ch);
          } //for
      } //else
    return resultCh.toString();
  } // row(int)

} // Grid
