import java.util.*;

public class Main {
    public static void main(String[] args) {
      patern(6);
  
    }
      static void patern(int n){
        int l=1;
        for (int row=0;row<=n;row++){
          if(row%2==0){
           l=1;}
          for (int col=0;col<=row;col++){
          System.out.print(l+" ");
          if (l==0){
            l=1;
          }
          else{
            l=0;
          }
          }
          System.out.println();
        }
      }
  }
