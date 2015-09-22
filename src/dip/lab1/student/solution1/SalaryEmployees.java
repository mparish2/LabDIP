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
public class SalaryEmployees implements Employee {
    private double yearlySalary; // final? 
    private double yearlyBonus; 

    public double getYearlySalary() {
        return yearlySalary;
    }

    public final void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public double getYearlyBonus() {
        return yearlyBonus;
    }

    public final void setYearlyBonus(double yearlyBonus) {
        /// do validation

        this.yearlyBonus = yearlyBonus;
    }

    
    // by using setter methods you can validate incoming arguments
    public SalaryEmployees(double yearlySalary, double yearlyBonus) {
        setYearlySalary(yearlySalary);
        setYearlyBonus(yearlyBonus);
    }
    
    @Override
    public final double getYearlyEarnings() {
       return yearlySalary + yearlyBonus;
    }
    
    
    
    
    
    
    
    
}
