import java.util.*;

public class Main {
    public static void main(String[] args) {
      math(10);
  
    }
      static void math(int n){
        for(int i=1;i<=n;i++){
          if(n%i==0){
            System.out.println(i);
          }
        }
      }
  }
