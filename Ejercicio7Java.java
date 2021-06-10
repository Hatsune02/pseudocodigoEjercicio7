import java.util.Random;

public class Ejercicio7Java{
    public static void main (String[] args){
        Random aleatorio = new Random();
        int random;
        int pares = 0;
        int impares = 0;
        int ceros = 0;
        
        for(int i=0;i<15;i++){
            random = aleatorio.nextInt(36 - 0);
            System.out.println(random);
            while(random>2){
                random = random - 2;
            }
            if(random == 2){
                pares++;
            }
            else if(random == 1){
                impares++;
            }
            else{
                ceros++;
            }
        }

        double porcentajePares = (double) pares*100/15;
	    double porcentajeImpares = (double) impares*100/15;
	    double porcentajeCeros = (double)ceros*100/15;
        
        System.out.println("El porcentaje de números pares es de " + porcentajePares + "%, el porcentade de números impares es de " + porcentajeImpares + "% y el porcentaje de ceros es de " + porcentajeCeros + "%");
    }

}