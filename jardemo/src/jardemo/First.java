package jardemo;

import java.math.BigDecimal;
import java.util.*;
class First{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=5;
        String []s={"5","-1","0.9","19.3","2"};
//        for(int i=0;i<n;i++){
//            s[i]=sc.next();
//        }
        sc.close();

        Arrays.sort(s,(a,b)->{
           if(a!=null && b!=null){
               return new BigDecimal(b).compareTo(new BigDecimal(a));
           } 
           return 0;
        });

        //Write your code here

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}