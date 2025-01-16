import java.util.*;

public class Main {
    public static void main(String[] args) {
      recursion("Nakul",5);
  
    }
      static void recursion(String S,int n){
        if(n==0){
          return;
        }
        System.out.println(S);
        recursion(S,n-1);
      }
  }
