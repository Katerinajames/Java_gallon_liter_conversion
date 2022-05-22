/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package page47_galon_liter_conversion;

import javax.swing.JOptionPane;

/**
 *
 * @author katherine
 */
public class Page47_galon_liter_conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        
       String g=JOptionPane.showInputDialog("Enter the amount of gallons you wish to "
               + "convert to liters ");
       double gallons=Double.parseDouble(g);
        double liters=gallons * 3.7854;
        
        String message=String.format("The amount of liters is %.2f",liters);
         JOptionPane.showMessageDialog(null, message);
        
    }
    
}
