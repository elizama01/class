/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classcalculadora ;


import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Calculadora {
 double  num1 ,num2 ;
   


    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double  getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
  public double  suma (){
    return  num1+num2 ;
                }
   public double   resta( ){
   return num1-num2; }
   
   public double   multiplicar( ){
   return num1*num2; }
   
   public double   dividir( ){
     return num1/num2; }
 public void Mostrar (){
  
     System.out.println("El primer numero ingresado es  =  "+ this.num1  );
     System.out.println("El segundo  numero ingresado es  =  "+ this.num2  );
     System.out.println("El resultado de la suma es = "+ suma ()  );
     System.out.println("El resultado de la resta es = "+ resta()   );
     System.out.println("El resultado de la multiplicacion es = "+ multiplicar()   );
     System.out.println("El resultado de la division es = " +dividir()  );
   
 }
 public void menu (){
     try { Scanner entrada=  new Scanner (System.in);
  
      
        System.out.println("Elija Opcion  ");
        System.out.println(" 1 mostrar numero   ");
        System.out.println(" 2 salir   ");
        int op=entrada.nextInt();
        switch (op){
            case 1:
               Mostrar(); ; 
             
                break;
        
            case 2:
                
                 System.exit(2);
                break;
               default:
                   System.out.println("Numero ingresado no es valido ");
        }
         
     } catch (java.util.InputMismatchException e) {
          System.out.println("Error!!!! no se ingreso  lo solicitado  ");
     }
    
 }
}
