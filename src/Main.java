import java.text.DecimalFormat;
import java.util.Scanner;

// Armazenar o resultado do imc e comparar na tabela
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo a Calculadora IMC");
        System.out.print("Digite o seu nome: ");
        String name = sc.next();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("me Informe Qual o seu sexo:");
        System.out.println("[1] Masculino");
        System.out.println("[2] Feminino");
        int sexo = sc.nextInt();

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

            System.out.println(name + " seu IMC é: " + calculoS);
            tabelaIMC(calculoImc);
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

            System.out.println(name + " seu IMC é: " + calculoS);
            tabelaIMC(calculoImc);
        } else {
            System.out.println("Numero digitado inválido");
        }
    }

    static void tabelaIMC(double resultadoIMC){
        if (resultadoIMC <= 18.5) {
            System.out.println("Abaixo do Peso Normal");
        } else if (resultadoIMC <= 24.9) {
            System.out.println("Peso Normal");
        } else if (resultadoIMC <= 29.9) {
            System.out.println("Exesso de Peso");
        } else if (resultadoIMC <= 34.9) {
            System.out.println("Obesidade Classe I");
        }else if (resultadoIMC <= 39.9) {
            System.out.println("Obesidade Classe II");
        }else if (resultadoIMC >= 40) {
            System.out.println("Obesidade Classe III");
        }
    }
}
