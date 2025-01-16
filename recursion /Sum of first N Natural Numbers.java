import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.print(recursion(5));;
      
  
    }
      static int recursion(int n1){
        if(n1==0){
          return 0;
        }
        int sum= n1+recursion(n1-1);
        return sum;
      }
  }
