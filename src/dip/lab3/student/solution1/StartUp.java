
package dip.lab3.student.solution1;
public class StartUp {

	public static void main(String[] args) {
	
		Reader reader = new FileReader();
		Writer writer = new GuiWriter();
		
		
		Copier copier = new Copier( reader, writer );
		copier.copy();
		
		
		System.out.println("Program worked. Successfully copied");
	}
}
