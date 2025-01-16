import java.util.*;

public class Main {
    public static void main(String[] args) {
      patern(4);
    }
      static void patern(int n){
        for (int row=0;row<n;row++){
          for (int space=0;space<n-row-1;space++){
           System.out.print("  ");
          }
          for (int col=0;col<row*2+1;col++ ) {
            System.out.print("* ");
          }
          System.out.println();
        }
      }
  }
