package dip.lab2.student.solution1;

// An useful import if you need it.
import dip.lab2.student.solution1.TipCalculator;
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
 
    public static void main(String[] args) {
        
        TipCalculator tc1 = new BaggageServiceTipCalculator(ServiceQuality.GOOD,4);
        TipCalculator tc2 = new FoodServiceTipCalculator(ServiceQuality.POOR,150);
         
        TipCalculator[] TipArray = {tc1,tc2};
        
        ServiceTip st = new ServiceTip();
        
        for(TipCalculator tc : TipArray){
                System.out.println(tc.getTip());
        }
        
        
    }

}