import java.util.Set;

public class Player {
     private String name;
     private char Symbol;

    public Player(String name, char Symbol) {
          SetName(name);
          SetChar(Symbol);
     }

     private void SetChar(char symbol) {
     }

     private void SetName(String name) {
          
     }

     public void setName(String name) {
          if (!name.isEmpty()) {
               this.name = name;
          }
     }


     public String getName() {
          return this.name;
     }
     public void setSymbol(char symbol){
          if(symbol!='\0'){
               this.Symbol=Symbol;
          }
     }

     public char getSymbol() {
          return this.Symbol;
     }
}
