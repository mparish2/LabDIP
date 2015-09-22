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
public class HourEmp implements Employee {
    //lower level / worker class, does the work.

    private double hourRate;
    private double totHoursPerYr;

    public HourEmp(double hourRate, double totHoursPerYr) {
        this.hourRate = hourRate;
        this.totHoursPerYr = totHoursPerYr;
    }

//    
    @Override
    public final double getYearlyEarnings() {
        return hourRate * totHoursPerYr;
    }
// final concrete methods. also don't want them to change

    public final double getHourRate() {
        return hourRate;
    }

    
    public final void setHourRate(double hourRate) {
        if (hourRate < 0 || hourRate > 450) {
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
