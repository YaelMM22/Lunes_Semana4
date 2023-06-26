package Viernes;

import java.util.Scanner;

public class pareimpar {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int numero = input.nextInt();
        
        if (numero % 2 == 0) {
            System.out.print(+numero +" es un numero par ");
        } else {
            System.out.print(+numero +" es un numero impar ");
        }
}
}