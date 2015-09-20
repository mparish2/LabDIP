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
public class StartUp {
    
    public static void main(String[] args) {
     
        Employee EmpArray [] =  new Employee[]  {
                                                new HourEmp(11.75,750),
                                                new HourEmpPlusTip(11.00,800),
                                                new SalaryEmployees(55000,500)}; 
        HRService hrs = new HRService();
        
        for (Employee emp : EmpArray) {
            System.out.println("Employees yearly compensation: $" + hrs.getYearlyEmpComp(emp));
        }
        
        
        
    }
    
}
