/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package areaoftriangle;
import javax.swing.*;
import java.math.*;
/**
*David Lutelmowski
 * 2/18/19
 * Area Of Triangle Program
 */
public class AreaOfTriangle {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double a, b, C, number; 
    
    String hype= JOptionPane.showInputDialog("Enter the length of the hypotenuse");
    a = Double.parseDouble(hype);
    
    String base = JOptionPane.showInputDialog("Enter the other length");
    b = Double.parseDouble(base);
     
    String angle = JOptionPane.showInputDialog("Enter the Angle");
    C = Double.parseDouble(angle);
    C = Math.toRadians(C);
    
    number = ((a * b) * Math.sin(C))/2;
    
    System.out.println("The Area Of the Triangle is " + number);
    
    }
    
}
