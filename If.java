package Viernes;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num1 = input.nextInt();
        
        if (num1 > 0) {
            System.out.print(+num1 +" es un numero positivo :) ");
        }else if (num1 < 0) {
            System.out.print(+num1 +" es un numero negativo :( ");
        }else {
            System.out.print(+num1 +" es cero ");

                }
	}
}