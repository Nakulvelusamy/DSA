import java.util.*;

public class Main {
    public static void main(String[] args) {
      patern(6);
  
    }
      static void patern(int n){
        int l;
        for (int row=-n;row<n;row++){
          if(row<0){
            l=-row;
          }
          else{
            l=row;
          }
          for (int space=0;space<n-l;space++) {
             System.out.print("  ");
          }
          for (int col=0;col<l+1;col++){
              System.out.print("* ");
          }
          System.out.println();
        }
      }
  }
