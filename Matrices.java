import java.util.*;
class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[][] myNumbers = { {1, 0, 0, 4}, {5, 6, 7, 8, 9} };
      for (int i = 0; i < myNumbers.length; ++i) {
          for(int j = 0; j < myNumbers[i].length; ++j) {
             System.out.println(myNumbers[i][j]);
          }
      }
  }
}

