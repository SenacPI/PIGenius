
import java.io.IOException;
import java.util.*;
import static java.lang.System.exit;


public class Main {		
	
		public static final String VERMELHO = "\u001B[31m";
		
		public static final String VERDE = "\u001B[32m";
		
		public static final String AMARELO = "\u001B[33m";
		
		public static final String AZUL = "\u001B[34m";
		
		public static final String BRANCO = "\u001B[37m";
        
		public static final String GameOver = "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
             "███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀\n" +
              "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼\n" +
              "██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀\n" +
              "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼\n" +
              "███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄\n" +
            "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
            "███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼\n" +
            "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼\n" +
            "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼\n" +
             "███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄\n" +
             "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
              "┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼\n" +
              "┼┼┼┼┼┼████▄┼┼┼▄▄▄▄▄▄▄┼┼┼▄████┼┼┼┼┼┼┼\n" +
              "┼┼┼┼┼┼┼┼┼▀▀█▄█████████▄█▀▀┼┼┼┼┼┼┼┼┼┼\n" +
              "┼┼┼┼┼┼┼┼┼┼┼█████████████┼┼┼┼┼┼┼┼┼┼┼┼\n" +
              "┼┼┼┼┼┼┼┼┼┼┼██▀▀▀███▀▀▀██┼┼┼┼┼┼┼┼┼┼┼┼\n" +
              "┼┼┼┼┼┼┼┼┼┼┼██┼┼┼███┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼\n" +
              "┼┼┼┼┼┼┼┼┼┼┼█████▀▄▀█████┼┼┼┼┼┼┼┼┼┼┼┼\n" +
              "┼┼┼┼┼┼┼┼┼┼┼┼███████████┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
              "┼┼┼┼┼┼┼┼▄▄▄██┼┼█▀█▀█┼┼██▄▄▄┼┼┼┼┼┼┼┼┼\n" +
              "┼┼┼┼┼┼┼┼▀▀██┼┼┼┼┼┼┼┼┼┼┼██▀▀┼┼┼┼┼┼┼┼┼\n" +
              "┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼\n" +
              "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼ \n"+
              "GAME OVER";
	

    public static void main(String[] args) throws IOException, InterruptedException {     

        System.out.println(VERMELHO + "WELCOME" + VERDE + " TO" + AMARELO + " GEN" + AZUL + "IUS" + BRANCO);

        System.out.println("\n Escolha uma opcao: \n");

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

            
            
            int rodada = 0;
            boolean cont = true;

            ArrayList<String> dataNumbers = new ArrayList<String>();
            do {

                rodada++;

                System.out.println("\n Rodada " + rodada);

                int numeroAleatorio = generateNumber();
                
                
                dataNumbers.add(Integer.toString(numeroAleatorio));
                
                System.out.println("\nMemorize a sequencia de numeros: ");
                
                dataNumbers.forEach(i ->{                	
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    int randomNumber = Integer.parseInt(i);

                    System.out.printf(randomNumber == 1 ? VERMELHO + "|1|" : BRANCO + "|1|");
                    System.out.printf(" ");
                    System.out.printf(randomNumber == 2 ? VERDE + "|2|" : BRANCO + "|2|");
                    System.out.printf(" ");
                    System.out.printf(randomNumber == 3 ? AMARELO + "|3|" : BRANCO + "|3|");
                    System.out.printf(" ");
                    System.out.printf(randomNumber == 4 ? AZUL + "|4|" : BRANCO + "|4|");
                    
                    
                    System.out.printf("\n");
                    try {
						Thread.sleep(700);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.printf(BRANCO + "|1| |2| |3| |4|");
                    try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                    // cleans the screen
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                });


                System.out.println("\nDigite a sequencia: ");
                
                String seq = sc.next();
                
                
                String arrayToString = "";
                
                for(String number: dataNumbers) {
                	arrayToString+=number;
                }
                if(!seq.equals(arrayToString)) {
                	cont =false;
                	System.out.println("\n" +GameOver);
                	System.out.println("\nA sequencia era: " + dataNumbers);
                	System.out.println("\nVoce chegou a " + rodada + "ª rodada!");
                }


            }
            while (cont);
        }
    }

    public static int generateNumber()
    {
        Random random = new Random();
        int number = random.nextInt(4) + 1;
        return number;
    }

}