




import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class Square extends ClosedShape {
	//The width and height of the Square (major and minor axis)
		private int width, height;
		
	protected Square(int insertionTime, int x, int y, int vx, int vy,int width,int height, Color colour, boolean isFilled) {
		super(insertionTime, x, y, vx, vy, colour, isFilled);
		
	}
	
	
	
	/**
     * Method to convert an Square to a string.
     */
	   public String toString () {
	    	String result = "This is an Square\n";
	    	result += super.toString ();
		result += "Its width is " + this.width + " and its height is " + this.height + "\n";
	    	return result;
	    }
	   
	   /**
		 * @param width Resets the width.
		 */
	 	public void setWidth (int width) {
			this.width = width;
		}

	 	/**
	 	 * @param height Resets the height.
	 	 */
	 	public void setHeight (int height) {
			this.height = height;
		}
		/**
	 	 * @return The width of the oval.
	 	 */
	 	public int getWidth() {
			return width;
		}

	 	/**
	 	 * @return The height of the oval.
	 	 */
	 	public int getHeight() {
			return height;
		}
	 	/*public void draw (GraphicsContext g) {
	    	g.setFill( colour );
	    	g.setStroke( colour );
	    	if (isFilled) {
	    		g.fill( x, y, diameter, diameter );
	    	} 
	    	else {
	    		g.strokeLine( x, y, diameter, diameter );
		    }
	    }*/
	}




