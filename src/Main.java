import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual unidade de medida você deseja para Altura?");
        System.out.println("[1] Metros");
        System.out.println("[2] Centimetros");
        int optionAltura = sc.nextInt();

        if (optionAltura == 1) {
            System.out.println("Digite a sua altura em metros: ");
            String alturaS = sc.next();
            alturaS = alturaS.replace(",", ".");
            double alturaD = Double.parseDouble(alturaS);

            System.out.println("Digite o sua peso em kilograma: ");
            String pesoS = sc.next();
            pesoS = pesoS.replace(",", ".");
            double pesoD = Double.parseDouble(pesoS);

            double calculoImc = pesoD / Math.pow(alturaD, 2);
            String calculoS = new DecimalFormat("#.0#").format(calculoImc);

            System.out.println("seu IMC é: " + calculoS);
        } else if (optionAltura == 2) {

            System.out.println("Digite a sua altura em centimetros: ");
            double altura = sc.nextDouble();
            altura = altura / 100;

            System.out.println("Digite o sua peso em kilograma: ");
            String pesoS = sc.next();
            pesoS = pesoS.replace(",", ".");
            double pesoD = Double.parseDouble(pesoS);

            double calculoImc = pesoD / (Math.pow(altura, 2));
            String calculoS = new DecimalFormat("#.0#").format(calculoImc);

            System.out.println("seu IMC é: " + calculoS);
        } else {
            System.out.println("Numero digitado inválido");
        }


    }

}
