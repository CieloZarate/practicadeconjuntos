##PRACTICA DE  CONJUNTOS DE números divisibles entre 3 y 5
#Autor - Cielo Raymundo Zarate 
#Autor - cielitorayzarti@gmail.com	
import java.util.HashSet;
import java.util.Set;

public class DivisibleNumbers {
    public static void main(String[] args) {
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> C = new HashSet<>();

        // Agregar números al conjunto A
        for (int i = 1; i <= 1000; i++) {
            A.add(i);
        }

        // Encontrar números divisibles entre 3 y 5 en el conjunto A
        for (int num : A) {
            if (num % 3 == 0 && num % 5 == 0) {
                B.add(num);
            }
        }

        // Encontrar números divisibles entre 5 en el conjunto B
        for (int num : B) {
            if (num % 5 == 0) {
                C.add(num);
            }
        }

        // Calcular B + C = (B ? C) - (B n C)
        Set<Integer> unionSet = new HashSet<>(B);
        unionSet.addAll(C);

        Set<Integer> intersectionSet = new HashSet<>(B);
        intersectionSet.retainAll(C);

        Set<Integer> bPlusC = new HashSet<>(unionSet);
        bPlusC.removeAll(intersectionSet);

        System.out.println("Cantidad de números en A divisibles entre 3 y 5: " + B.size());
        System.out.println("Conjunto B: " + B);
        System.out.println("Conjunto C: " + C);
        System.out.println("B + C = " + bPlusC);
    }
}