import java.util.Scanner;

class CalculoPedaladas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o diametro da roda: ");
        double diametroRoda = scanner.nextDouble();
        double circunferenciaRoda = Math.PI * diametroRoda;


        System.out.println("Digite distancia em metros: ");
        double distanciaTotalMetros  = scanner.nextDouble();

        double numeroPedaladas = distanciaTotalMetros / circunferenciaRoda;


        int numeroPedaladasInteiro = (int) Math.round(numeroPedaladas);


        System.out.println("Você precisa dar " + numeroPedaladasInteiro + " pedaladas para andar " + distanciaTotalMetros + " metros");
    }
}
