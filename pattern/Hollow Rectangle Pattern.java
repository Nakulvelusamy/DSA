import java.util.*;

public class Main {
    public static void main(String[] args) {
      patern(6);
    }
      static void patern(int n){
        for (int row=0;row<n;row++){
          for (int col=0;col<n;col++){
            if(row==0||row==n-1||col==0||col==n-1){
              System.out.print("* ");}
            else{
              System.out.print("  ");
            }
          }
          System.out.println();
        }
      }
  }
