import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        int valor = 10;
        System.out.println("variavel do tipo int: " + valor);

        byte byteVar = 127;
        System.out.println("byteVar = " + byteVar);

        short shortVar = 32000;
        System.out.println("shortVar = " + shortVar);

        int intVar = 1000;
        System.out.println("intVar = " + intVar);

        long longVar = 1234567890L;
        System.out.println("longVar = " + longVar);

        boolean booleanVar = true;
        System.out.println("booleanVar = " + booleanVar);

        char charVar = 'I';
        System.out.println("charVar = " + charVar);

        float floatVar = 3.14f;
        System.out.println("floatVar = " + floatVar);

        double doubleVar = 2.718;
        System.out.println("doubleVar = " + doubleVar);

        int numero1 = 10;
        int numero2 = 7;

        int soma = numero1 + numero2;


        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + soma);

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        scanner.close();
        System.out.println("Numero: " + numero);



    }
        }



