
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

public class GuiWriter implements Writer {
	
	public void writeln( String line ) {
            JOptionPane.showMessageDialog(null, line);
	}
}
