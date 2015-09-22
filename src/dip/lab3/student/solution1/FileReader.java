
package dip.lab3.student.solution1;

import java.io.*;

public class FileReader implements Reader {
	private boolean lineReadFlag = false;
	
	
	public String readln() {
		
		File data = new File(File.separator + "data.txt");

		BufferedReader in = null;
		String line = null;
			  
		try {
			if ( data.exists() ){
				
				in = new BufferedReader( new java.io.FileReader(data) );
				line = in.readLine();
				in.close();
			} else {
				System.out.println("File not found - data.txt");
				line = null;
			}
		} catch (IOException ioe) {
			try {
				if( in != null ) in.close();
			} catch(IOException ioe2) {
				System.out.println( ioe2.getMessage() );
			}
			System.out.println( ioe.getMessage() );
			System.exit(1);  
		}
			  
		
		if( lineReadFlag ) {
			return null;
		} else {
			lineReadFlag = true;
			return line;
		}
	}

        public void method2() {
            System.out.println("not a polymorphic method");
        }

}
