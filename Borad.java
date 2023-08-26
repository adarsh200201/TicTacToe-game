public class Borad{
     private char board[][];
     private int boradsize=3;
    private char p1Symbol,p2Symbol;
   private int count;

     public final static int PlAYER_1_WINS=1;
     public final static int PlAYER_2_WINS=2;
     public final static int DRAW=3;
     public final static int INCOMPLETE=4;
     public final static int INVALID=5;


     public Borad(char p1Symbol,char p2Symbol){
          board=new char[boradsize][boradsize];
          for (int i=0;i<boradsize;i++) {
               for (int j =0; j < boradsize; j++) {
                    board[i][j] = ' ';



               }

          }
          this.p1Symbol=p1Symbol;
          this.p2Symbol=p2Symbol;
     }

     public int move(char symbol, int x, int y) {


          if (x < 0 || x >= boradsize && y < 0 || y <= boradsize || board[x][y] != ' ') {
               return INVALID;
          }
          board[x][y] = symbol;
          count++;


          //Check Row
          if (board[x][0] == board[x][1] && board[x][0] == board[x][2]) {
               return symbol == p1Symbol ? PlAYER_2_WINS : PlAYER_1_WINS;
          }
          // Check Colum
          if (board[0][y] == board[1][y] && board[0][y] == board[2][y]) {
               return symbol == p1Symbol ? PlAYER_2_WINS : PlAYER_1_WINS;
          }
          // Check diogonal
          //first side
          if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
               return symbol == p1Symbol ? PlAYER_2_WINS : PlAYER_1_WINS;
          }
          //second side
          if (board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
               return symbol == p1Symbol ? PlAYER_2_WINS : PlAYER_1_WINS;
          }
          if(count==boradsize*boradsize){
               return  DRAW;
          }
          return INCOMPLETE;





     }

     public void print() {
          System.out.println("-----------------");
          for (int i=0;i<boradsize;i++) {
               for (int j = 0; j < boradsize; j++) {
                    System.out.println("|" + board[i][j] + " |");
               }
               System.out.println();
          }
          System.out.println();
          System.out.println("-----------------");





     }
}
