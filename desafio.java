import java.util.Scanner;

public class desafio {
    static int reverse(int numero) {
        int contrario = 0;
        int resto;

        while (numero > 0) {
            resto = numero % 10;
            contrario = (contrario * 10) + resto;
            numero = numero / 10;
        }
        return contrario;
    }

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha um dos seguintes números, 123, 435 ou 786.");
        int numero = entrada.nextInt();
        System.out.printf("O numero " + numero + " ao contrário fica "  + reverse(numero));
    }
}
