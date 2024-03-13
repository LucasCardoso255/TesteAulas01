import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int tipo;

        do{
            System.out.print("Qual o tipo de cálculo?");
            System.out.println("\nAdição=1 \nSubtração=2 \nMultiplicação=3 \nDivisão=4 \nSair=0");

            tipo = ler.nextInt();

            double num1, num2, resultado;

            switch (tipo) {
                case 1:


                    System.out.println("Digite o primeiro número: ");
                    num1 = ler.nextDouble();

                    System.out.println("Digite o segundo número: ");
                    num2 = ler.nextDouble();

                    resultado = (num1 + num2);
                    System.out.println("Resultado: " + resultado);
                    System.out.println("    ");
                    break;


                case 2: {
                    System.out.println("Digite o primeiro número: ");
                    num1 = ler.nextDouble();

                    System.out.println("Digite o segundo número: ");
                    num2 = ler.nextDouble();

                    resultado = (num1 - num2);
                    System.out.println("Resultado: " + resultado);
                    System.out.println("    ");
                    break;
                }

                case 3: {
                    System.out.println("Digite o primeiro número: ");
                    num1 = ler.nextDouble();

                    System.out.println("Digite o segundo número: ");
                    num2 = ler.nextDouble();

                    resultado = (num1 * num2);
                    System.out.println("Resultado: " + resultado);
                    System.out.println("    ");
                    break;
                }

                case 4: {
                    System.out.println("Digite o primeiro número: ");
                    num1 = ler.nextDouble();

                    System.out.println("Digite o segundo número: ");
                    num2 = ler.nextDouble();

                    resultado = (num1 / num2);
                    System.out.println("Resultado: " + resultado);
                    System.out.println("    ");
                    break;
                }

                case 0: {
                    System.out.println("Encerrando calculadora.");
                    break;
                }

            }

        }while (tipo > 0);
        ler.close();
    }
}