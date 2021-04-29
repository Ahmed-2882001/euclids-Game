/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euclid.game;


import static java.time.Clock.system;

import java.util.Scanner;


public class EuclidGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner ni= new Scanner(System.in);   
       int number1 = 16;
       int number2 = 10;
       System.out.print("start player1:");
       int num1 = ni.nextInt();
        int num2 = 0;
     for(;;){   
       if(num1 != number1 && num1 != number2 && num1 < number1){
          
            System.out.println("Enter player2");
            num2 = ni.nextInt(); 
           
       }else{
           System.out.println("player1 is lose");
           System.out.println("player2 is win");
           break;
       }
          int num3 = 0;
        if(num2 != number1 && num2 != number2 && num2 != num1 && num2 < number1){
          
            System.out.println("Enter player1");
            num3 = ni.nextInt();
           
       }else{
           System.out.println("player1 is win");
           System.out.println("player2 is lose");
           break;
       }
        int num4 =0;
         if(num3 != number1 && num3 != number2 && num3 != num2 && num3 != num1 && num3 < number1){
          
            System.out.println("Enter player2");
            num4 = ni.nextInt();
           
       }else{
           System.out.println("player1 is lose");
           System.out.println("player2 is win");
           break;
       }
         int num5 =0;
        if(num4 != number1 && num4 != number2 && num4 != num2 && num4 != num1 && num4 < number1){
            if(num4 != num3){
         
            System.out.println("Enter player1");
            num5 = ni.nextInt();
            }
       }else{
           System.out.println("player1 is win");
           System.out.println("player2 is lose");
           break;
       }
       int num6 =0;
        if(num5 != number1 && num5 != number2 && num5 != num2 && num5 != num1 && num5 < number1){
            if(num5 != num3 && num5 != num4){
         
            System.out.println("Enter player2");
            num6 = ni.nextInt();
            }
       }else{
           System.out.println("player1 is lose");
           System.out.println("player2 is win");
           break;
       }
        
        if(num6 != number1 && num6 != number2 && num6 != num2 && num6 != num1 && num6 < number1){
            if(num6 != num3 && num6 != num4 && num6 != num5){
          
              System.out.println("Game is completely");
               System.out.println("player1 is lost");
              System.out.println("player2 is win");
               System.out.println("number1 :"+number1);
               System.out.println("number2 :"+number2);
               System.out.println("number3 :"+num1);
                System.out.println("number4 :"+num2);
                 System.out.println("number5 :"+num3);
                  System.out.println("number4:"+num4);
                   System.out.println("number5"+num5);
                    System.out.println("number6"+num6);
            }
       }else{
           System.out.println("player1 is win");
           System.out.println("player2 is lose");
           break;
       }
     }  
       
    }
  
}
