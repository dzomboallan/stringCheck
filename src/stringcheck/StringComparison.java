/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringcheck;

/**
 *
 * @author hunnytaggy
 */
import java.util.Scanner;

public class StringComparison {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        String string1, string2;
        int comparison;
        
        System.out.println("Enter a string: ");
        string1 = keyboard.next();
        System.out.println("Enter another String: ");
        string2 = keyboard.next();
        
        comparison = string1.compareTo(string2);
        if(comparison < 0)
            System.out.println(string1 +" comes before "+ string2 +" in the alphabet.");
        else if(comparison > 0)
            System.out.println(string2 +" comes before "+ string1+ " in the alphabet");
        else
            System.out.println("The strings are identical");
    }
    
}
