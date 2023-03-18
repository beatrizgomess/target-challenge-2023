import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero01 = 0;
        int numero02 = 1;


        int somaDosOutros = 0;
        System.out.println("Informe um numero: ");
        int valorVerificavel = scan.nextInt();


        while(valorVerificavel > somaDosOutros){
            somaDosOutros = numero01 + numero02;
            numero01 = numero02;
            numero02 = somaDosOutros;
        }

        if(valorVerificavel == 0 || valorVerificavel == 1){
            System.out.println("Faz parte da sequência de fibonnaci");
        }else {
            if (valorVerificavel == somaDosOutros) {
                System.out.println("Faz parte da sequencia de fibonnaci");
            } else {
                System.out.println("Não faz parte da sequencia de fibonnaci");
            }
        }
    }
}
