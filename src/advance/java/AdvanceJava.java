/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advance.java;

import java.util.Scanner;

/**
 *
 * @author Aryan Soft
 */
public class AdvanceJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  The driver class
        System.out.println("welcome to Pharmacy agency");
        System.out.println("Enter 1 for staffs information");
        System.out.println("Enter 2 for medecine information");
        System.out.println("Enter 3 for customer information");
        System.out.println("Enter 4 for stock information");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        
        System.out.println("number entered is "+choice);
        
        switch(choice){
            case 1:
                System.out.println("case 1 entered");
                break;
            case 2:
                System.out.println("case 2 entered");
                break;
            case 3:
                System.out.println("case 3 entered");
                break; 
            case 4:
                System.out.println("case 4 entered");
                break;
            default:
                System.out.println("not match");
    }
    
}
}
