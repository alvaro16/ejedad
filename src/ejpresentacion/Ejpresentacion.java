/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpresentacion;

/**
 *
 * @author TOSHIBA
 */
import java.util.Scanner;

public class Ejpresentacion {

    /**
     * @param args the command line arguments
     */
      
static public void main(String[] args)
{
int anio;
System.out.print("Ingrese su edad ");

Scanner SuEdad = new Scanner(System.in);
anio=SuEdad.nextInt();

if(anio<=11)
{
System.out.println("Eres un niño");
}
else
{
if(anio>=12 && anio<18)
{
System.out.println("Eres un adolescente");
}
else
{
System.out.println("Eres un adulto");
}
}
}
}  
    
   
      



        // TODO code application logic here
    
    

