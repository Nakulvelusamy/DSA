import java.util.*;

public class Main {
    public static void main(String[] args) {
      math(153);
  
    }
      static void math(int n){
        int nn=n;
        int lastdigit;
        int count=0;
        int a=0;
        
        while(n>0){
          lastdigit=n%10;
          n=n/10;
          count++;
        }
        n=nn;
        while(n>0){
          lastdigit=n%10;
          n=n/10;
          int power=1;
          for(int i=1;i<=count;i++){
          power=power*lastdigit;
         }
          a=a+power;
        }
        
        System.out.print(nn==a);
      }
  }
