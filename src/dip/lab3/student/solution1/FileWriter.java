
package dip.lab3.student.solution1;

import java.io.*;

public class FileWriter implements Writer {

	
	public void writeln(String line) {
		boolean append = false;
		File data = new File(File.separatorChar + "Temp" + 
			  File.separatorChar + "datacopy.txt");
		PrintWriter out = null;
			  
		
		try {
			
			out = new PrintWriter(
						new BufferedWriter(
						new java.io.FileWriter(data, append) ) );
			out.println(line);
			out.close();
			
		} catch (IOException ioe) {
			if(out != null) out.close();
			System.out.println( ioe.getMessage() );
			System.exit(1); 
		}

	}

}
