/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classcalculadora;

import java.util.Scanner;



/**
 *
 * @author Esteban
 */
public class ClassCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora c1 = new Calculadora();
        Scanner entrada = new Scanner(System.in) ; 
        try {System.out.println("Ingrese primer numero ");
       double  n1 = entrada.nextInt();
          c1.setNum1(n1);
       System.out.println("Ingrese segundo  numero ");
        
        double  n2 =entrada.nextInt();
        c1.setNum2(n2);
     if (n2==0){
         System.out.println("el segundo numero ingresado no puede ser 0");
                 }else{
     c1.menu();
     }
 
            
        } catch (java.util.InputMismatchException e ) {
            System.out.println("Error!!!! no se ingreso lo solicitado  ");
        }
        
                 
        
       
 
       
    }
    
}
