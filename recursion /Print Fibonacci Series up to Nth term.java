import java.util.*;

public class Main {
    public static void main(String[] args) {
      recursion(5);
      
  
    }
    static void recursion(int n){
       for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    static int fibonacci(int n){
      if(n==0){
        return 0;
      }
      if(n==1){
        return 1;
      }
      return fibonacci(n-1)+ fibonacci(n-2);
    }
}
