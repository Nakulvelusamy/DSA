import java.util.*;

public class Main {
    public static void main(String[] args) {
      math(10,20);
  
    }
      static void math(int n,int n1){
        int nn=n;
        int min;
        int gcd=1;
        if(n<n1){
          min=n;
        }
        else{
          min=n1;
        }
        for(int i=1;i<=n;i++){
          if((n%i==0)&&(n1%1==0)){
            gcd=i;
          }
        }
        
        System.out.print(gcd);
      }
  }
