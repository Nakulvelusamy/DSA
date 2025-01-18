import java.util.*;

public class Main {
    public static void main(String[] args) {
      recursion(5);
      
  
    }
      static void recursion(int n1){
        if(n1==0){
          return;
        }
        recursion(n1-1);
        System.out.println(n1);
      }
  }
