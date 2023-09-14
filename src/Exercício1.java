import java.util.Scanner;
public class Exercício1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a idade em anos: ");
        int idadeEmAnos = scanner.nextInt();


        int meses = idadeEmAnos * 12;
        int dias = idadeEmAnos * 365;


        System.out.println("Idade em anos: " + idadeEmAnos + " anos");
        System.out.println("Idade em meses: " + meses + " meses");
        System.out.println("Idade em dias: " + dias + " dias");

        scanner.close();
    }


        }


