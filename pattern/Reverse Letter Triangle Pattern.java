import java.util.*;

public class Main {
    public static void main(String[] args) {
      patern(6);
  
    }
      static void patern(int n){
        
        for (int row=0;row<=n;row++){
          char l = 'A';
          for (int col=0;col<=n-row;col++){
          System.out.print(l+" ");
          l++;
          }
          
          System.out.println();
        }
      }
  }