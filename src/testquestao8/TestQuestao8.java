/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testquestao8;

import java.util.Scanner;

public class TestQuestao8 {

    
    public static void main(String[] args) {
        String juntar="";
        int c=0;
        Scanner sc = new Scanner(System.in);
       
       int num=0;
        System.out.println("Digites os numeros de A");
        int A = sc.nextInt();
        System.out.println("Digites os numeros de B");
        int B = sc.nextInt();
        
        char[] digitosA = String.valueOf( A ).toCharArray();
        char[] digitosB = String.valueOf( B ).toCharArray();
        int tamanho= digitosA.length+digitosB.length;
  
        char[] digitosc = new char[tamanho];

      
        int i=0;
        int lugar=0;
        int p=0;
       
            while (p<digitosc.length)       
                {
                    if(digitosA.length>lugar){
                    digitosc[p] = digitosA[lugar];
                    System.out.println(digitosc[p]);
                  p++;
                    }
                    if(digitosB.length>lugar){
                     digitosc[p] = digitosB[lugar];
                   
                     System.out.println(digitosc[p]);
                      p++;
                    }
                    
                     lugar++;
                     
                      System.out.println("esse é o p"+p);
                      
                     
             }
         for (int cont = 0; cont<digitosc.length; cont++){
               
             juntar+=""+digitosc[cont];
                
           }
            
c=Integer.parseInt(juntar);
if(c<=1000000){
      System.out.println(c);
}else{
c=-1;
    System.out.println(c);
}
    }
    
}
