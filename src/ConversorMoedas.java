import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String apiKey = "e03814d2468c9d826e9785ee";

        int opcao;
        do {
            System.out.println("Seja bem vindo ao conversor de moeda ;)");

            int linhas = 1;
            int i;
            for (i = 1; i <= linhas; i++) {
                System.out.println(" ");
            }

            System.out.println("1) Dólar ==>> Real");
            System.out.println("2) Real ==>> Dólar");
            System.out.println("3) Real ==>> Peso argentino");
            System.out.println("4) Peso Argentino ==>> Real");
            System.out.println("5) Dólar ==>> Won sul-coreano");
            System.out.println("6) Real ==>> Iene japonês");
            System.out.println("7) Sair!");
            for (int k = 0; k < 40; k++) {
                System.out.print("*");
            }
            System.out.println();

            System.out.println("Escolha a opção de conversão:");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        Converter.ConversorMoedas.converter("USD", "BRL");
                        break;

                    case 2:
                        Converter.ConversorMoedas.converter("BRL", "USD");
                        break;

                    case 3:
                        Converter.ConversorMoedas.converter("BRL", "ARS");
                        break;

                    case 4:
                        Converter.ConversorMoedas.converter("ARS", "BRL");
                        break;

                    case 5:
                        Converter.ConversorMoedas.converter("USD", "KRW");
                        break;

                    case 6:
                        Converter.ConversorMoedas.converter("BRL", "JPY");
                        break;

                    case 7:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
            while (opcao != 7) ;


        }
}

