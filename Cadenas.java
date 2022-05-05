import java.util.*;
class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String txt="Hola mi nombre es Franks";
    String txt2="Javier";
    System.out.println("La cadena es: " + txt);
    System.out.println("Todo Mayuscula: " + txt.toUpperCase());
    System.out.println("Todo Minuscula: " + txt.toLowerCase());
    System.out.println("La posicion de Franks: " + txt.indexOf("Franks"));
    System.out.println(txt + " " + txt2);
    System.out.println(txt.concat(txt2));
  }
}

