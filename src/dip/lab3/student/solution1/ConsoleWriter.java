
package dip.lab3.student.solution1;

public class ConsoleWriter implements Writer {
	
	
	public void writeln( String line ) {
            System.out.println("This is the text that you enter.");
            System.out.println( line );
	}
}
