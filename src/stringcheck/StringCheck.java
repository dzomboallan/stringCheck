/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringcheck;

/**
 *
 * @author hunnytaggy
 */
import java.util.Scanner;

public class StringCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        String symbol;
        
        System.out.println("Enter the symbol(square/cuircle/triangle)");
        symbol = keyboard.next();
        
        switch(symbol){
            case "square": System.out.println("ATTACK");
                            break;
            case "circle": System.out.println("BLOCK");
                            break;
            case "triangle": System.out.println("JUMP");
                            break;
            default: System.out.println("Invalid choice");
        }
    }
    
}
