
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

        System.out.println("\n Escolha uma op��o: \n");

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
            boolean cont = true;

            ArrayList<String> dataNumbers = new ArrayList<String>();
            do {

                rodada++;

                System.out.println("\n Rodada " + rodada);

                int numeroAleatorio = generateNumber();
                
                
                dataNumbers.add(Integer.toString(numeroAleatorio));
                
                System.out.println("Memorize a sequ�ncia de numeros: ");
                
                dataNumbers.forEach(i ->{
                	try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
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
                    System.out.printf(BRANCO);

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                });


                System.out.println("Digite a sequ�ncia: ");
                String seq = sc.next();
                
                String arrayToString = "";
                
                for(String number: dataNumbers) {
                	arrayToString+=number;
                }
                if(!seq.equals(arrayToString)) {
                	cont =false;
                	System.out.println(GameOver);
                	System.out.println("A sequ�ncia era: " + dataNumbers);
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