
/**
 * This class reads a shape file.  For the format of this shape file, see the assignment description.
 * Also, please see the shape files ExampleShapes.txt, ExampleShapesStill.txt, and TwoRedCircles.txt
 *
 * @author you
 *
 */

import javafx.scene.paint.Color;
import java.io.*;
import java.util.Scanner;

public class ReadShapeFile {
	
	
	

	
	
	// TODO: You will likely need to write four methods here. One method to
	// construct each shape
	// given the Scanner passed as a parameter. I would suggest static
	// methods in this case.
	
		
	
	/**
	 * Reads the data file used by the program and returns the constructed queue
	 * 
	 * @param in
	 *            the scanner of the file
	 * @return the queue represented by the data file
	 */
	private static Queue<ClosedShape> readDataFile(Scanner in) {
		Queue<ClosedShape> shapeQueue = new Queue<ClosedShape>();
		//Reading and parsing the data
		in.useDelimiter(" ");
		while (in.hasNext()){
		String curLine=in.nextLine();
		Scanner line=new Scanner(curLine);
		String nameOfShape=line.next();
		int X=line.nextInt();
		int Y=line.nextInt();
		int VX=line.nextInt();
		int VY=line.nextInt();
		boolean isFilled=line.nextBoolean();
		int diameter=line.nextInt();
		int r=line.nextInt();
		int g=line.nextInt();
		int g2=line.nextInt();
		int insertionTime=line.nextInt();
		
		
	line.close();

		//read in the shape files and place them on the Queue
		}
		//Right now, returning an empty Queue.  You need to change this.
		return shapeQueue;
	
	}
	





	/**
	 * Method to read the file and return a queue of shapes from this file. The
	 * program should handle the file not found exception here and shut down the
	 * program gracefully.
	 * 
	 * @param filename
	 *            the name of the file
	 * @return the queue of shapes from the file
	 */
	public static Queue<ClosedShape> readDataFile(String filename) {
	    // HINT: You might want to open a file here.
	  
		File inputFile = new File (filename);
		Scanner in=new Scanner(System.in);
		
		
		try {
			in=new Scanner(inputFile);
		
			
		}catch (FileNotFoundException e) {
			System.out.println("no such file found" + filename);
			System.exit(0);
		}
		
	
	    return ReadShapeFile.readDataFile(in);
	    
	
	
}
}
