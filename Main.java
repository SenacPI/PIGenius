import Game.Game;

import java.io.IOException;
import java.util.*;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        String VERMELHO = "\u001B[31m";
        String VERDE = "\u001B[32m";
        String AMARELO = "\u001B[33m";
        String AZUL = "\u001B[34m";


        System.out.println(VERMELHO + "WELCOME" + VERDE + " TO" + AMARELO + " GEN" + AZUL + "IUS");

        System.out.println("\n Escolha uma opcao: \n");

        System.out.println("1 - Jogar");
        System.out.println("2 - Sair");

        Scanner sc = new Scanner(System.in);

        int opcao = sc.nextInt();

        if(opcao == 2) {

            System.out.println("\n Obrigado por jogar!");
            exit(0);
        }


        else {

            // create the game
            Game.main(args);
        }
    }


}