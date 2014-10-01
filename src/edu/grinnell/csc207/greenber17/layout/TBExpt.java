package edu.grinnell.csc207.greenber17.layout;

import java.io.PrintWriter;

/**
 * A series of experiments with the text block layout classes.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.2 of September 2014
 */
public class TBExpt
{
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args)
    throws Exception
  {
    // Prepare for input and output
    PrintWriter pen = new PrintWriter(System.out, true);

    TextBlock star = new BoxedBlock(new Grid(7, 3, '*'));
    TBUtils.print(pen, star);

    TextBlock block3 =
        new VComposition(new TextLine("Hello"), new TextLine("Goodbye"));
    TextBlock block4 = new TruncatedBlock(block3, 3);
    TBUtils.print(pen, block3);
    TBUtils.print(pen, block4);

    TextBlock top = new CenteredBlock(new TextLine("Hello"), 11);
    TextBlock bottom = new CenteredBlock(new TextLine("Goodbye"), 11);
    TextBlock block5 = new BoxedBlock(new VComposition(top, bottom));
    TBUtils.print(pen, block5);

    TextBlock above = new RightJustified(new TextLine("Hello"), 11);
    TextBlock below = new RightJustified(new TextLine("Goodbye"), 11);
    TextBlock block6 = new BoxedBlock(new VComposition(above, below));
    TBUtils.print(pen, block6);

    TextBlock hello = new BlockPair(new TextLine("Hello"));
    TextBlock goodbye = new BlockPair(new TextLine("Goodbye"));
    TextBlock block7 = new BoxedBlock(new VComposition(hello, goodbye));
    TBUtils.print(pen, block7);

    TextLine tb4 = new TextLine("Hello");
    TextLine tb5 = new TextLine("World");
    TextBlock compound =
        new BoxedBlock(
                       new CenteredBlock(
                                         new BoxedBlock(
                                                        new CenteredBlock(
                                                                          new VComposition(
                                                                                           tb4,
                                                                                           tb5),
                                                                          7)),
                                         15));
    pen.println("ORIGINAL");
    TBUtils.print(pen, compound);
    tb5.setContents("Someone");
    pen.println("UPDATED");
    TBUtils.print(pen, compound);
    tb4.setContents("Nice to meet you,");
    pen.println("RE-UPDATED");
    TBUtils.print(pen, compound);

    // Clean up after ourselves.
    pen.close();
  } // main(String[])

} // class TBExpt
