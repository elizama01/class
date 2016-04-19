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
 int num1 ,num2 ;
   
 Calculadora (int n1 ,int n2){
 this.num1= n1 ;  
 this.num2= n2 ;  
 }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
  public int  suma (){
    return  num1+num2 ;
                }
   int  resta( ){
   return num1-num2; }
   
   int  multiplicar( ){
   return num1*num2; }
   
   int  dividir( ){
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
  Scanner entrada=  new Scanner (System.in);
  
       
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
 }
}
