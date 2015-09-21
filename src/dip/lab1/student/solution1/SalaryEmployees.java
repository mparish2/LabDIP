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
    private double yearlySalary; // making these final would be bad here?
    private double yearlyBonus; // because you might have more that 1 sal emps?

    
    
    public SalaryEmployees(double yearlySalary, double yearlyBonus) {
        this.yearlySalary = yearlySalary;
        this.yearlyBonus = yearlyBonus;
    }
    
    @Override
    public double getYearlyEarnings() {
       return yearlySalary + yearlyBonus;
    }
    
    
    
    
    
    
    
    
}
