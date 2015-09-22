
package dip.lab3.student.solution1;

import java.util.Scanner;

public class KeyboardReader implements Reader {
	
	
	public String readln() {
            System.out.println("Enter some text from keyboard");

            Scanner input = new Scanner(System.in);
            return input.nextLine();
	}
}
