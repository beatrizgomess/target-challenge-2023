import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
public class LogicaElementos {
    public static void main(String[] args) {


        // Letra A)
        System.out.println("LETRA A");
        int numero01 = 1;
        int ultimoNumero = 0;
        int sequencia = 2;
        for (int i = 0; i < 5; i++) {
            ultimoNumero = numero01;
            numero01 += sequencia;
            System.out.println(ultimoNumero);
        }
        System.out.println("=======================");

        // Letra B)
        System.out.println("LETRA B");
        int numero01LetraB = 2;
        int dobro = 2;
        int ultimoNumeroLetraB = 0;
        for (int i = 0; i < 7; i++) {
            ultimoNumeroLetraB = numero01LetraB;
            numero01LetraB *= dobro;
            System.out.println(ultimoNumeroLetraB);
        }
        System.out.println("=======================");

        // Letra C)
        System.out.println("Letra C");
        int numeroSequencia = 0;
        int[] numeroImpar = {1, 3, 5, 7, 9, 11, 13};
      for(int i = 0; i < numeroImpar.length; i++){
          numeroSequencia += numeroImpar[i];
          System.out.println(numeroSequencia);
      }

        System.out.println("=======================");


        // Letra D)
        System.out.println("LETRA D");
        int[] numeroAoQuadrado = {4, 6, 8, 10};
        for (int n : numeroAoQuadrado) {
            System.out.println(Math.pow(n, 2));
        }
        System.out.println("=======================");


        //Letra E)
        System.out.println("Letra E");
        int primeiroNumero = 1;
        int segundoNumero = 1;


        int somaDosOutros = 0;
        int cont = 5;

        System.out.println(primeiroNumero);
        System.out.println(segundoNumero);
        for(int i = 0; i < cont; i++){
            somaDosOutros = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = somaDosOutros;
            System.out.println(somaDosOutros);
        }

        System.out.println("=======================");

        System.out.println("Letra F");

        String Numeros[] =
                {"Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez",
                        "Onze", "Doze", "Treze", "Quatorze", "Quinze", "Desesseis", "Desessete", "Dezoito", "Desenove",
                        "Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta", "Noventa",
                        "Cem", "Cento", "Duzentos", "Trezentos", "Quatrocentos", "Quinhentos", "Seiscentos",
                        "Setecentos", "Oitocentos", "Novecentos"};

        for(int i = 0; i < Numeros.length; i++){
            if(Numeros[i].contains("D")){
                System.out.println(Numeros[i]);
            }
        }
        System.out.println("=======================");
    }
}
