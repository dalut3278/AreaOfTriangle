/**
*David Lutelmowski
* 2/18/19
* Area Of Triangle Program
*/

package areaoftriangle;
import javax.swing.*;
import java.math.*;

public class AreaOfTriangle {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, C, area; 

        String hype= JOptionPane.showInputDialog("Enter the length of the hypotenuse");
        a = Double.parseDouble(hype);

        String base = JOptionPane.showInputDialog("Enter the other length");
        b = Double.parseDouble(base);

        String angle = JOptionPane.showInputDialog("Enter the Angle");
        C = Double.parseDouble(angle);
        C = Math.toRadians(C);
        // This is the trigonometric calculation to determine the area of the triangle
        area = ((a * b) * Math.sin(C))/2;

        System.out.println("The Area Of the Triangle is " + area);
    
    }
    
}
