#PRACTICA DE CONJUNTOS; NÚMEROS CAPICÚAS DE 2,3 Y 4 CIFRAS
#Autor - Cielo Raymundo Zarate
#Autor - cielitorayzarti@gmail.com
import java.util.HashSet;
import java.util.Set;

public class CapicuaNumbers {

    public static void main(String[] args) {
        
        Set<Integer> capicuas2 = new HashSet<Integer>();
        Set<Integer> capicuas3 = new HashSet<Integer>();
        Set<Integer> capicuas4 = new HashSet<Integer>();
        
        for(int i = 1; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                int num2 = i*10 + j;
                capicuas2.add(num2);
                
                for(int k = 0; k < 10; k++) {
                    int num3 = i*100 + j*10 + k;
                    if(num3 == i*101) continue; // Evitar duplicados
                    capicuas3.add(num3);
                    
                    for(int l = 0; l < 10; l++) {
                        int num4 = i*1000 + j*100 + k*10 + l;
                        if(num4 == i*1001) continue; // Evitar duplicados
                        capicuas4.add(num4);
                    }
                }
            }
        }
        
        System.out.println("Capicuas de 2 cifras: " + capicuas2);
        System.out.println("Capicuas de 3 cifras: " + capicuas3);
        System.out.println("Capicuas de 4 cifras: " + capicuas4);
    }
}