/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author Matthew_2
 */
public class HourEmpPlusTip implements Employee {
        private double hourRate;
        private double totHoursPerYr;

    public HourEmpPlusTip(double hourRate, double totHoursPerYr) {
        this.hourRate = hourRate;
        this.totHoursPerYr = totHoursPerYr;
    }
        
        @Override
         public final double getYearlyEarnings() {
        return hourRate * totHoursPerYr;
    }
    // final concrete methods. also don't want them to change

    public final double getHourRate() {
        return hourRate + 20; // to show that you can add more lower Modules
                                          // w/o breaking the program
    }

    //validateing because you don't want negative number
    //of $'s per hours or  to much of asurplus
    public final void setHourRate(double hourRate) {
        if (hourRate < 0 || hourRate > 400) {
            System.out.println("Illegal $'s per hour");
        }
        this.hourRate = hourRate;
    }

    public final double getTotHoursPerYr() {
        return totHoursPerYr;
    }

    public final void setTotHoursPerYr(double totHoursPerYr) {
        if (totHoursPerYr <0 || totHoursPerYr > 4500){
            System.out.println("Illegal Hour limit");
        }
        this.totHoursPerYr = totHoursPerYr;
    }
        
        
        
        
        
        
}
