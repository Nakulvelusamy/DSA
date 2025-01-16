import java.util.*;

public class Main {
    public static void main(String[] args) {
      math(12345678);
  
    }
      static void math(int n){
        int lastdigit;
        int count=0;
        while(n>0){
          lastdigit=n%10;
          n=n/10;
          count++;
        }
        System.out.print(count);
      }
  }
