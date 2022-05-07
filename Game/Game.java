package Game;

import com.sun.tools.javac.Main;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Game extends Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        String VERMELHO = "\u001B[31m";
        String VERDE = "\u001B[32m";
        String AMARELO = "\u001B[33m";
        String AZUL = "\u001B[34m";
        String BRANCO = "\u001B[37m";

        Scanner sc = new Scanner(System.in);

        // clear the screen
        System.out.print("\n \n \n \n \n \n \n");


        /**
        System.out.println(VERDE + "   |2|");
        System.out.println(BRANCO + "|1|" + BRANCO + "   |3|");
        System.out.println("   |4|");
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        **/

        // create a new game

        int rodada = 0;

        do {
            rodada++;

            int randomNumber = generateNumbers();

            System.out.println(randomNumber == 2 ? VERDE + "   |2|" : BRANCO + "   |2|");
            System.out.println(randomNumber == 1 ? VERMELHO + "|1|" : BRANCO + "|1|");
            System.out.print(randomNumber == 3 ? AMARELO + "   |3|" : BRANCO + "   |3|");
            System.out.println(randomNumber == 4 ? AZUL + "   |4|" : BRANCO + "   |4|");
            System.out.println(BRANCO);
            // ternary operator template
            // condition ? true : false;

            System.out.println("Digite o número da sequência: ");
            System.out.println(randomNumber);
            int sla = sc.nextInt();

            if (sla == randomNumber) {
                System.out.println("Acertou!");
            }


        }
        while(true);





    }




    public static int generateNumbers() {

        // generate a random number between 1 and 4
        Random random = new Random();
        int randomNumber = random.nextInt(4) + 1;
        return randomNumber;

    }


}
