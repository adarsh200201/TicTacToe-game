import jdk.jshell.Snippet;

import java.util.Scanner;

public class TicTacToe {
     private Player player1, player2;
     private Borad borad;

     public static void main(String[] args) {
          TicTacToe t =new TicTacToe();
          t.startGame();
     }


     public void startGame() {
          //playerv input
          Scanner s = new Scanner(System.in);
          player1 = takeInput(1);
          player2 = takeInput(2);
       while (player1.getSymbol() == player2.getSymbol())
          {
               System.out.println("Symbol Already Taken!!pick another symbol");
               char Symbol = s.next().charAt(0);
               player2.setSymbol(Symbol);
          }
          //create borad
          borad = new Borad(player1.getSymbol(), player2.getSymbol());
          //conduct the Game


          boolean player1turn = true;
          int status = Borad.INCOMPLETE;
          while (status == Borad.INCOMPLETE || status == Borad.INVALID) {
               if (player1turn) {
                    System.out.println("Player 1-" + player1.getName() + "s turn");
                    System.out.println("Enter x: ");
                    int x = s.nextInt();
                    System.out.println("Enter y: ");
                    int y = s.nextInt();
                    status = borad.move(player1.getSymbol(), x, y);
                    if (status != Borad.INVALID) {
                         player1turn = false;
                         borad.print();

                    } else {

                         System.out.println("Invalid Move !!Try Again!! ");
                    }


               } else {
                    System.out.println("Player 2-" + player2.getName() + "s turn");
                    System.out.println("Enter x: ");
                    int x = s.nextInt();
                    System.out.println("Enter y: ");
                    int y = s.nextInt();
                    status = borad.move(player2.getSymbol(), x, y);
                    if (status != Borad.INVALID) {
                         player1turn = true;
                         borad.print();
                    } else {

                         System.out.println("Invalid Move !!Try Again!! ");
                    }


               }


          }
          if (status==Borad.PlAYER_1_WINS){
               System.out.println("player 1- "+player1.getName()+"Win !!");
          }
          else if (status==Borad.PlAYER_2_WINS){
               System.out.println("player 2- "+player2.getName()+"Win !!");
          }
          else{
               System.out.println("Draw !!");
          }
     }





     private  Player takeInput(int num){
          Scanner s=new Scanner(System.in);
          System.out.println("Enter Player" +num+" name");
          String name=s.nextLine();
          System.out.println("Enter Player" +num+" Symbol");
          char  Symbol=s.next().charAt(0);
          Player p=new Player(name,Symbol);
          return p;

     }
}
