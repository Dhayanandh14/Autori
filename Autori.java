import java.util.*;

class Autori {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    String store="";
    String b = kbd.nextLine();
    store = b.charAt(0)+store;
    for (int i = 0; i < b.length(); ++i){
      if(b.charAt(i)=='-'){
         store =store+ b.charAt(i+1);
      }
    }
    System.out.print(store);
    kbd.close();
  }
}