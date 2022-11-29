/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primos;

import java.util.Scanner;

/**
 *
 * @author PC Gamer
 */
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        
        int num,i,phi,j;
        int tot=0;
        int cant=0;
       
        
        System.out.println("Ingrese el número");
        num=entrada.nextInt();
        
       
            //if(num>=1){
                for(i=1;i<=num;i++){
                    //System.out.println("i: "+i);
                    
                    for(j=1;j<=i;j++){
                        //System.out.println("j: "+j);
                      phi=i%j;
                      //System.out.println("phi: "+phi);
                      if(phi==0){
                         tot++;
                         if(tot==3){
                             break;
                         }
                        }       
                    } 
                    //System.out.println("tot: "+tot);
                    if(tot<=2){
                       System.out.println("El número "+i+" es primo");
                       cant++;
                    }
                    tot=0;
                }
            //}
            System.out.println("Hay "+cant+" primos");
    }
    
}
