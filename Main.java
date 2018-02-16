
import java.util.Scanner;

public class Main{


        public static void main (String[] args){

                Scanner digito = new Scanner (System.in);
                
                int numero;
                int dos= 2;

                    
                  System.out.println("Ejercicio # 3");
                  System.out.println("");

                     System.out.println("Este ejercicio le va a permitir determinar si un numero ingresado es primo o no");
                     System.out.println("Digite un numero");
                     numero = digito.nextInt();
                     if(numero % dos == 0){
                          
                            System.out.println("El numero no es primo");
                                  

                         }else{
                            
                             System.out.println("El numero que digito es primo");

                        }

                         

        }



}