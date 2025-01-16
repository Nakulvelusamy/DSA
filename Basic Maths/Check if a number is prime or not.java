import java.util.*;

public class Main {
    public static void main(String[] args) {
      math(13);
  
    }
      static void math(int n){
        int nn=0;
        for(int i=1;i<=n;i++){
          if((n%i==0)&&(i!=1)&&(i!=n)){
            nn=nn+1;
          }
        }
        if(nn==0){
          System.out.print("prime");
        }
        else{
          System.out.print("not prime");
        }
      }
  }
