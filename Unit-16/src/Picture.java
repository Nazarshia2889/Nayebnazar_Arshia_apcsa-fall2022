import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyBlue() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
        pixelObj.setRed(0);
      }
    }
  }
  
  public void keepOnlyRed() {
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setGreen(0);
	        pixelObj.setBlue(0);
	      }
   }
  }
  
  public void keepOnlyGreen() {
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setBlue(0);
	        pixelObj.setRed(0);
	      }
    }
  }
  
  
  public void negate() {
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setGreen(255 - pixelObj.getGreen());
	        pixelObj.setBlue(255 - pixelObj.getBlue());
	        pixelObj.setRed(255 - pixelObj.getRed());
	      }
	    }
	  }
  
  public void grayscale() {
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	    	int avg = (pixelObj.getGreen() + pixelObj.getBlue() + pixelObj.getRed())/3;
	        pixelObj.setGreen(avg);
	        pixelObj.setBlue(avg);
	        pixelObj.setRed(avg);
	      }
	    }
	  }
  
  public void fixUnderwater() {
	Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        if(pixelObj.getBlue() > pixelObj.getGreen() && pixelObj.getBlue() > pixelObj.getRed()) {
        	pixelObj.setBlue(255);
        }
      }
    }
  }
  
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = width - 1; col >= 0; col--)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length/2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[pixels.length - row -1][col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = pixels.length - 1; row >= pixels.length/2; row--)
    {
      for (int col = 0; col < width; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[pixels.length - row -1][col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorDiagonal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    int colCount = 1;
    for (int row = 1; row < pixels.length; row++)
    {
      for (int col = 0; col < colCount; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[col][row];
        rightPixel.setColor(leftPixel.getColor());
      }
      colCount++;
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        
        count++;
      }
    }
    System.out.println("Count: " + count);
  }
  
  public void mirrorArms()
  {
    int mirrorPoint = 170;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 157; row < 197; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 104; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row + 70]                       
                         [mirrorPoint - col + mirrorPoint + 73];
        rightPixel.setColor(leftPixel.getColor());

      }
    }
    for (int row = 157; row < 197; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 291; col > 237; col--)
      {
        
        rightPixel = pixels[row][col];      
        leftPixel = pixels[row + 70]                       
                         [mirrorPoint - col + mirrorPoint + 60];
        leftPixel.setColor(rightPixel.getColor());

      }
    }
  }
  
  public void mirrorGulls()
  {
    int mirrorPoint = 344;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 232; row < 327; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 223; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());

      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  public void copy2(Picture fromPic, int startRow, int startCol, int startFromRow, int startFromCol, int endAtRow, int endAtCol) {	
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = startFromRow, toRow = startRow; 
		  fromRow < endAtRow &&
		  toRow < toPixels.length; 
		  fromRow++, toRow++)
		{
		for (int fromCol = startFromRow, toCol = startCol; 
		    fromCol < endAtCol&&
		    toCol < toPixels[0].length;  
		    fromCol++, toCol++)
		{
		 fromPixel = fromPixels[fromRow][fromCol];
		 toPixel = toPixels[toRow][toCol];
		 toPixel.setColor(fromPixel.getColor());
		}
	}   
	}	

  

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  public void createCollage2()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy2(flower1,0,0, 0, 0, 50, 50);
    this.copy2(flower2,100,0, 0, 0, 50, 50);
    this.copy2(flower1,200,0, 0, 0, 50, 50);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy2(flowerNoBlue,300, 0, 0, 0, 50, 50);
    this.copy2(flower1,400, 0, 0, 0, 50, 50);
    this.copy2(flower2,500, 0, 0, 0,  50, 50);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  public void myCollage()
  {
    Picture butterfly1 = new Picture("flower1.jpg");
    Picture butterfly2 = new Picture("flower1.jpg");
    Picture butterfly3 = new Picture("flower2.jpg");
    this.copy(butterfly1,100,50);
    this.copy(butterfly2,200,50);
    this.copy(butterfly2,300,75);
    
    this.mirrorHorizontalBotToTop();
    this.mirrorVertical();
    
    this.copy(butterfly1,100,250);
    this.copy(butterfly1,200,250);
    this.copy(butterfly1,300,250);
    
    this.mirrorDiagonal();
    
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
    
    for (int row = 0; row < pixels.length - 1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row + 1][col];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void edgeDetection2(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    
    
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length - 1; col++)
      {
        leftPixel = pixels[row][col];
        int[] prev = new int[]{leftPixel.getRed(), leftPixel.getGreen(), leftPixel.getBlue()};
        boolean prevAvg = ((prev[0] + prev[1] + prev[2]) / 3) > 127;
        
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        
        int[] colors = new int[]{rightPixel.getRed(), rightPixel.getGreen(), rightPixel.getBlue()};
        boolean colorsAvg = ((colors[0] + colors[1] + colors[2]) / 3) > 127;
        if (prevAvg != colorsAvg)
          rightPixel.setColor(Color.BLACK);
        else {
          rightPixel.setColor(Color.WHITE);
        }
        
      }
    }
    
    for (int row = 0; row < pixels.length - 1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length; col++)
      {
        leftPixel = pixels[row][col];
        int[] prev = new int[]{leftPixel.getRed(), leftPixel.getGreen(), leftPixel.getBlue()};
        boolean prevAvg = ((prev[0] + prev[1] + prev[2]) / 3) > 127;
        
        rightPixel = pixels[row+1][col];
        rightColor = rightPixel.getColor();
        
        int[] colors = new int[]{rightPixel.getRed(), rightPixel.getGreen(), rightPixel.getBlue()};
        boolean colorsAvg = ((colors[0] + colors[1] + colors[2]) / 3) > 127;
        if (prevAvg != colorsAvg)
          leftPixel.setColor(Color.BLACK);
        else {
          leftPixel.setColor(Color.WHITE);
        }
      }
    }
  }
  
  /** Hide a black and white message in the current
  * picture by changing the red to even and then
  * setting it to odd if the message pixel is black
  * @param messagePict the picture with a message
  */
  public void encode(Picture messagePict)
  {
	  Pixel[][] messagePixels = messagePict.getPixels2D();
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	  Pixel pix2 = null;
	  Pixel pix3 = null;
	  ArrayList<int[]> rows = new ArrayList<int[]>();
	  ArrayList<int[]> cols = new ArrayList<int[]>();
	  boolean visited = false;
	  int shift = 0;
	  int prevCol = -1;
	  int prevRow = 0;
	  
	  for (int row = 0; row < this.getHeight(); row++) {
		  for (int col = 0; col < this.getWidth(); col++) {
			  
			  currPixel = currPixels[row][col];
			  if(row <= (this.getHeight()/2)) {
				  if(currPixel.getRed() % 10 < 5) {
					  currPixel.setRed(currPixel.getRed() - (currPixel.getRed() % 10));
				  }
				  else {
					  currPixel.setRed(currPixel.getRed() + (10 - (currPixel.getRed() % 10)));
				  }
			  }
			  else {
			  
				  if(currPixel.getGreen() % 10 < 5) {
					  currPixel.setGreen(currPixel.getGreen() - (currPixel.getGreen() % 10));
				  }
				  else {
					  currPixel.setGreen(currPixel.getGreen() + (10 - (currPixel.getGreen() % 10)));
				  }
			  }
			  
			  
			  if(currPixel.getBlue() % 2 != 0) {
//				  check 255
				  if(currPixel.getBlue() == 255) {
					  currPixel.setBlue(currPixel.getBlue() - 1);
				  }
				  else {
					  currPixel.setBlue(currPixel.getBlue() + 1);
				  }
			  }
			  
			  messagePixel = messagePixels[row][col];
			  if(messagePixel.colorDistance(Color.BLACK) < 50) {
				  if(!visited) {
					  shift = row;
					  visited = true;
				  }
				  boolean check = false;
				  if(rows.size() == 0) {
					  prevRow = 0;
				  }
				  else {
					   check = (int) (sigmoid(row) * 10) + (int) (sigmoid(row) * 100 % 10) + (int) (sigmoid(row) * 1000 % 10) == (int) logit((rows.get(rows.size()-1)[0] / 10.0) + (rows.get(rows.size()-1)[1] / 100.0) + (rows.get(rows.size()-1)[2] / 1000.0));
				  }
				  if(row != prevRow && check) {
					  rows.add(new int[] {(int) (sigmoid(row) * 10), (int) (sigmoid(row) * 100 % 10), (int) (sigmoid(row) * 1000 % 10) + 1});
				  }
				  else {
					  rows.add(new int[] {(int) (sigmoid(row) * 10), (int) (sigmoid(row) * 100 % 10), (int) (sigmoid(row) * 1000 % 10)});
				  }
				  
				  if(cols.size() == 0) {
					  prevCol = 0;
				  }
				  else { 
					  prevCol = (int) logit((cols.get(cols.size()-1)[0] / 10.0) + (cols.get(cols.size()-1)[1] / 100.0) + (cols.get(cols.size()-1)[2] / 1000.0));
				  }
				  if((int) (sigmoid(col)*1000) == prevCol) {
					  cols.add(new int[] {(int) (sigmoid(col) * 10), (int) (sigmoid(col) * 100 % 10), (int) (sigmoid(col) * 1000 % 10)});
				  }
				  else {
					  cols.add(new int[] {(int) (sigmoid(col) * 10), (int) (sigmoid(col) * 100 % 10), (int) (sigmoid(col) * 1000 % 10) + 1});
				  }
//				  prevCol = (int) (sigmoid(col) * 1000);
				  
//				  cols.add(col);
//				  System.out.println();
//				  System.out.println("col: " + col);
//				  System.out.println((int) logit((((int) (sigmoid(col) * 10)) % 10 / 10.0) + (((int) (sigmoid(col) * 100 % 10)) % 10 / 100.0) + (((int) (sigmoid(col) * 1000 % 10)) % 10 / 1000.0)));
//				  System.out.println((int) logit((rows.get(rows.size()-1)[0] / 10.0) + (rows.get(rows.size()-1)[1] / 100.0) + (rows.get(rows.size()-1)[2] / 1000.0)));
//				  System.out.println((int) logit((cols.get(cols.size()-1)[0] / 10.0) + (cols.get(cols.size()-1)[1] / 100.0) + (cols.get(cols.size()-1)[2] / 1000.0)));
//				  System.out.println("row: " + row);
				  
			  }
		  }
		  prevRow = row;
	  }
	  
	  
	  
	  int row = 0;
	  int col = 0;

	  for(int i = 0; i < rows.size(); i++) {
		  
		  currPixel = currPixels[row][col];
		  currPixel.setRed(currPixel.getRed() + rows.get(i)[0]);
		  if(currPixel.getBlue() == 0) {
			  currPixel.setBlue(currPixel.getBlue() + 1);
		  }
		  else {
			  currPixel.setBlue(currPixel.getBlue() - 1);
		  }
		  
		  currPixel = currPixels[this.getHeight() - row - 1][this.getWidth() - col - 1];
		  currPixel.setGreen(currPixel.getGreen() + cols.get(i)[0]);
//		  currPixel.setBlue(currPixel.getBlue() - 1);
		  
		  
		  col++;
		  pix2 = currPixels[row][col];
		  pix2.setRed(pix2.getRed() + rows.get(i)[1]);
		  if(pix2.getBlue() == 0) {
			  pix2.setBlue(pix2.getBlue() + 1);
		  }
		  else {
			  pix2.setBlue(pix2.getBlue() - 1);
		  }
		  
		  pix2 = currPixels[this.getHeight() - row - 1][this.getWidth() - col - 1];
		  pix2.setGreen(pix2.getGreen() + cols.get(i)[1]);
//		  pix2.setBlue(pix2.getBlue() - 1);
		  
		  
		  col++;
		  pix3 = currPixels[row][col];
		  pix3.setRed(pix3.getRed() + rows.get(i)[2]);
		  if(pix3.getBlue() == 0) {
			  pix3.setBlue(pix3.getBlue() + 1);
		  }
		  else {
			  pix3.setBlue(pix3.getBlue() - 1);
		  }
		  
		  pix3 = currPixels[this.getHeight() - row - 1][this.getWidth() - col - 1];
		  pix3.setGreen(pix3.getGreen() + cols.get(i)[2]);
//		  pix3.setBlue(pix3.getBlue() - 1);
		  
//		  System.out.println();
//		  System.out.println((int) logit((currPixels[row][col - 2].getRed() % 10 / 10.0) + (currPixels[row][col - 1].getRed() % 10 / 100.0) + (currPixels[row][col].getRed() % 10 / 1000.0)));
//		  System.out.println((int) logit((currPixels[this.getHeight() - row - 1][this.getWidth() - (col-2) - 1].getGreen() % 10 / 10.0) + (currPixels[this.getHeight() - row - 1][this.getWidth() - (col-1) - 1].getGreen() % 10 / 100.0) + (currPixels[this.getHeight() - row - 1][this.getWidth() - col - 1].getGreen() % 10 / 1000.0)));
		  
		  col++;
		  
		  if(col + 3 > this.getWidth()) {
			  col = 0;
			  row++;
		  }
		  
		  
		  
	  }
	  
  }
  
  public double sigmoid(int x) {
	  return (2.0/(1+Math.exp(-(x/1000.0)))) - 1;
  }
  
  public double logit(double x) {
	  return -1000.0*Math.log((2.0/(x+1)) - 1);
  }
  
  /**
  * Method to decode a message hidden in the
  * red value of the current picture
  * @return the picture with the hidden message
  */
  public Picture decode()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  int height = this.getHeight();
	  int width = this.getWidth();
	  Pixel currPixel = null;
	
	  Pixel messagePixel = null;
	  Picture messagePicture = new Picture(height,width);
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  
	  ArrayList<int[]> rows = new ArrayList<int[]>();
	  ArrayList<int[]> cols = new ArrayList<int[]>();
	  
	  int col = 0;
	  int row = 0;
	  boolean flagged = true;
	  while(flagged) {
		  while(col < this.getWidth()) {
			  if (pixels[row][col].getBlue() % 2 == 1) {
				  int rowRetrieved = (int) logit((pixels[row][col].getRed() % 10 / 10.0) + (pixels[row][col + 1].getRed() % 10 / 100.0) + (pixels[row][col + 2].getRed() % 10 / 1000.0));
				  int colRetrieved = (int) logit((pixels[this.getHeight() - row - 1][this.getWidth() - col - 1].getGreen() % 10 / 10.0) + (pixels[this.getHeight() - row - 1][this.getWidth() - (col+1) - 1].getGreen() % 10 / 100.0) + (pixels[this.getHeight() - row - 1][this.getWidth() - (col+2) - 1].getGreen() % 10 / 1000.0));
	//				  System.out.println((int) logit((pixels[row][col].getRed() % 10 / 10.0) + (pixels[row][col + 1].getRed() % 10 / 100.0) + (pixels[row][col + 2].getRed() / 1000.0)));
//					  System.out.println();
//				  System.out.println(rowRetrieved);
//				  System.out.println(colRetrieved);
				  messagePixel = messagePixels[rowRetrieved][colRetrieved];
				  messagePixel.setColor(Color.BLACK);
				  
				  col += 3;
				  if(col + 2 > this.getWidth()) {
					  break;
				  }
			  }
			  else {
				  System.out.println(row);
				  System.out.println(col);
				  System.out.println(pixels[row][col].getBlue());
				  flagged = false;
				  break;
			  }
		  }
		  col=0;
		  row++;
			  
	  }
	  
	  return messagePicture;
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args)
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  
} // this } is the end of class Picture, put all new methods before this
