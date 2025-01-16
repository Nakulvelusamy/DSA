import java.util.*;

public class Main {
    public static void main(String[] args) {
      recursion(1,5);
      
  
    }
      static void recursion(int n1,int n2){
        if(n1>n2){
          return;
        }
        System.out.println(n1);
        recursion(n1+1,n2);
      }
  }
