import java.util.*;

public class Main {
    public static void main(String[] args) {
      math(12378);
  
    }
      static void math(int n){
        int lastdigit;
        int count=0;
        int rev=0;
        while(n>0){
          lastdigit=n%10;
          n=n/10;
          count++;
         rev=rev*10+lastdigit;
        }
        System.out.print(rev);
      }
  }
