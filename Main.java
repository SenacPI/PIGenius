
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        String VERMELHO = "\u001B[31m";
        String VERDE = "\u001B[32m";
        String AMARELO = "\u001B[33m";
        String AZUL = "\u001B[34m";
        String BRANCO = "\u001B[37m";

        String numeroVermelho = VERMELHO + "1" + BRANCO;
        String numeroVerde = VERDE + "2" + BRANCO;
        String numeroAmarelo = AMARELO + "3" + BRANCO;
        String numeroAzul = AZUL + "4" + BRANCO;

        System.out.println(VERMELHO + "WELCOME" + VERDE + " TO" + AMARELO + " GEN" + AZUL + "IUS");

        System.out.println("\n Escolha uma opção: \n");

        System.out.println("1 - Jogar");
        System.out.println("2 - Sair");
        System.out.println(BRANCO);

        Scanner sc = new Scanner(System.in);

        int opcao = sc.nextInt();

        if(opcao == 2) {

            System.out.println("\n Obrigado por jogar!");
            exit(0);
        }


        else {

            // start game

            // cleans the screen
            System.out.print("\033[H\033[2J");
            System.out.flush();


            int rodada = 0;

            // create an array of numbers
            int[] numbers = new int[300];


            do {

                rodada++;

                System.out.println("\n Rodada " + rodada);

                int numeroAleatorio = generateNumber();



                // store randomNumber in the array
                numbers[rodada -1] = numeroAleatorio;

                // foreach number in the array where the number is different of 0
                System.out.println("Memorize a sequência de números: ");
                for (int i = 0; i < rodada; i++) {

                    Thread.sleep(1000);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    int randomNumber = numbers[i];

                    System.out.printf(randomNumber == 1 ? VERMELHO + "|1|" : BRANCO + "|1|");
                    System.out.printf(" ");
                    System.out.printf(randomNumber == 2 ? VERDE + "|2|" : BRANCO + "|2|");
                    System.out.printf(" ");
                    System.out.printf(randomNumber == 3 ? AMARELO + "|3|" : BRANCO + "|3|");
                    System.out.printf(" ");
                    System.out.printf(randomNumber == 4 ? AZUL + "|4|" : BRANCO + "|4|");
                    System.out.printf(BRANCO);

                    Thread.sleep(1000);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.out.println(BRANCO + "|1| |2| |3| |4|");

                }


                System.out.println("Digite a sequência, separada por espaços: ");
                String sla = sc.nextLine();

                // split the line by spaces
                String[] numbersString = sla.split(" ");

                // foreach item in numbersString array, compare with the numbers array
                // if the current number is different of the number in the array, the game is over
                for (int i = 0; i < numbersString.length; i++) {

                    // if the current number is different of the number in the array, the game is over
                    if(!numbersString[i].equals(String.valueOf(numbers[i])) && rodada > 1) {

                        System.out.println("Game Over");
                        exit(0);
                    }
                }


            }
            while (true);
        }
    }

    public static int generateNumber()
    {
        Random random = new Random();
        int number = random.nextInt(4) + 1;
        return number;
    }

}