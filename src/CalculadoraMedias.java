public class CalculadoraMedias {
    public static void main(String[] args) {

        int num1 = 8;
        int num2 = 9;
        int num3 = 7;


        int num4 = 4;
        int num5 = 5;
        int num6 = 6;


        double media1 = (num1 + num2 + num3) / 3.0;
        double media2 = (num4 + num5 + num6) / 3.0;


        double somaDasMedias = media1 + media2;


        double mediaDasMedias = (media1 + media2) / 2.0;


        System.out.println("Média da primeira série: " + media1);
        System.out.println("Média da segunda série: " + media2);
        System.out.println("Soma das duas médias: " + somaDasMedias);
        System.out.println("Média das médias: " + mediaDasMedias);
    }
}


