// Program to finnd the graetest among the given four numbers
import java.util.Scanner;

fun main(){
    var num1 : Int;
    var num2 : Int;
    var num3 : Int;
    var num4 : Int;
    
    var sc = Scanner(System.`in`);
    println("Enter the  1st number");
    num1 = sc.nextInt();
    println("Enter the 2nd number")
    num2 = sc.nextInt();
    println("Enter the 3rd number")
    num3 = sc.nextInt();
    println("Enter the 4th number")
    num4 = sc.nextInt();
    
    var great : Int
    great = if (num1 > num2 && num1 > num3 )
                  num1
            else if (num2 > num1 && num2 > num3)
                  num2
            else
                 num3
    
    great = if (num4 > great)
                num4
            else
                great
                 
    println("\nAmong four numbers $great is greater");   
}