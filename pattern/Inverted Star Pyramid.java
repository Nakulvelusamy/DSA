import java.util.*;

public class Main {
    public static void main(String[] args) {
      patern(4);
    }
      static void patern(int n){
        for (int row=0;row<n;row++){
          for (int space=0;space<row;space++){
           System.out.print("  ");
          }
          for (int col=0;col<n*2-row*2-1;col++ ) {
            System.out.print("* ");
          }
          System.out.println();
        }
      }
  }
