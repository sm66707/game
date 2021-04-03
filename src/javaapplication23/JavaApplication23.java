
package javaapplication23;

import java.util.Scanner;

public class JavaApplication23 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  loop =1,select,looop=1 ;
        while(loop==1){
               System.out.print("print 1 to start the game");
        int st=sc.nextInt();
        if(st==1)
        {
           System.out.print("this game is level \nif you want \neasy:print(1) \nmeduim:print(2) \nhard:print(3) \nrandom(4)");
           while(looop==1){
            System.out.print("your selection");
            select=sc.nextInt();
            if(select==1){
            int y=1+(int)(Math.random()*(1));
            m second =new m();
            second.select(y);
            second.play();
            looop=0;
            }
            if(select==2){
                int y=3+(int)(Math.random()*(1));
             m second =new m();
            second.select(y);
            second.play();
            looop=0;
            }
            if(select==3){
                int y=5+(int)(Math.random()*(1));
                         m second =new m();
            second.select(y);
            second.play();
            looop=0;
            }
            if(select==4){
            int y=30+(int)(Math.random()*(20));
            s first=new s();
            first.createArray();
            first.random(y);
            first.playANDwin(y);
            looop=0;
            }
            else 
            {
            System.out.print("error");
            }
           }
            loop=0;
           
        }
        else{
             System.out.print("error");
       
        }
            
        }
        
       
    }
}
       
    
    

