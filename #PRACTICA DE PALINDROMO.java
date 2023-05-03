#PRACTICA DE PALINDROMO
#Autor - Cielo Raymundo Zarate
#Autor - cielitorayzarti@gmail.com

import java.util.Scanner;

public class PalindromeExample {
   public static void main(String args[]) {
      String original, reverse = "";
      Scanner in = new Scanner(System.in);

      System.out.println("Ingresa una palabra o frase para verificar si es un palíndromo: ");
      original = in.nextLine();

      int length = original.length();

      for (int i = length - 1; i >= 0; i--)
         reverse = reverse + original.charAt(i);

      if (original.equals(reverse))
         System.out.println("La cadena ingresada es un palíndromo.");
      else
         System.out.println("La cadena ingresada no es un palíndromo.");
   }
}