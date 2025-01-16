import java.util.*;

public class Main {
    public static void main(String[] args) {
      patern(6);
  
    }
      static void patern(int n){
        char l = 'A';
        for (int row=0;row<n;row++){
          
          for (int s=0;s<n-row-1;s++){
            System.out.print("  ");
          }
          for (int col=0;col<row*2+1;col++){
          System.out.print(l+" ");
          l++;
          }
          if(l=='Z'){
            l='A';
          }
          
          System.out.println();
        }
      }
  }
