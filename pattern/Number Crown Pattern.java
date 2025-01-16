import java.util.*;

public class Main {
    public static void main(String[] args) {
      patern(6);
  
    }
      static void patern(int n){
        int l;
        for (int row=0;row<=n;row++){
          if(row<0){
            l=-row;
          }
          else{
            l=row;
          }
          for (int col=-n;col<=n;col++){
             if((-(n-row)<col)&&((n-row)>col)){
               System.out.print("  ");
             }
             else{
               System.out.print("* ");
             }
          }
          System.out.println();
        }
      }
  }
