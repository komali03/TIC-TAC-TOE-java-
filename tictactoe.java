//tic-tac-toe

import java.util.*;
import java.util.Scanner;
class tictactoe{
    static char a[][]={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
    static int count=0;
    //static int c=5;
    static String player1;
    static String player2;
    static void display(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
            System.out.println();
            }
        }
    static int f=0;

    static void method(){
        Scanner sc=new Scanner(System.in);
        System.out.println();
        display();
        if (count%2==0){
            System.out.println("Its "+player1+"'s turn.Choose a numbered position to replace with x");
        }
        else{
           System.out.println("Its "+ player2+"'s turn.Choose a numbered position to replace with o");
        }

        int p=sc.nextInt();
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int d=Character. getNumericValue(a[i][j]);
                //System.out.println("hi count "+count);//count represents number of turns of changing elements completed.
                if (d==p){

                    if(count%2==0){
                        if(count<4){
                            //System.out.println("suc count"+count);
                            a[i][j]='x';
                            count++;
                            method();
                        }
                        else if(count>=4){
                            a[i][j]='x';
                            //count++;
                            met();
                        }
                        
                        
                    }
                    else if(count%2!=0){
                        if(count<4){
                            //System.out.println("suc count"+count);
                            a[i][j]='o';
                            count++;
                            method();
                        }
                        else if(count>=4){//beacuse if count is 4 ,then it will be 5th turn and then,it should check if three of those five form tic tac toe.
                            a[i][j]='o';
                            
                            met();
                        }
                    }
                    
                }
                           
            }
        }
       
        
        }
        
        static void met(){
            int i=0,j=0;

        for(int n=0;n<3;n++){
            
        if((a[i][n]==a[i+1][n]) && (a[i+1][n]==a[i+2][n])){
              if(a[i][n]=='x'){
                display();
                System.out.println("Yay...hurray "+player1+" wins vertically");
                System.exit(1);
              }
              else if (a[i][n]=='o'){
                display();
                System.out.println("Yay...hurray "+player2+" wins vertically");
                System.exit(1);
                
              }
            }
        else if(a[n][j]==a[n][j+1]&&a[n][j+1]==a[n][j+2]){
            if(a[n][j]=='x'){
                display();
                System.out.println("Yay...hurray "+player1+" wins horizontally");
                System.exit(1);
            }
            else if(a[n][j]=='o'){
                display();
                System.out.println("Yay...hurray "+player2+" wins horizontally");
                System.exit(1);
                //break;
            }
    
        }
        }
        if(a[0][0]==a[1][1]&&a[1][1]==a[2][2]){
            if(a[1][1]=='x'){
                display();
                System.out.println("Yay...hurray "+player1+" wins diagonally");
                System.exit(1);
            }
            else  if(a[1][1]=='o'){
                display();
                System.out.println("Yay...hurray "+player2+" wins diagonally");
                System.exit(1);
            }
        }
        else if(a[2][0]==a[1][1]&&a[1][1]==a[0][2]){
            if(a[1][1]=='x'){
                display();
                System.out.println("Yay...hurray "+player1+" wins diagonally");
                System.exit(1);
            }
            else if(a[1][1]=='o'){
                display();
                System.out.println("Yay...hurray "+player2+" wins diagonally");
                System.exit(1);
            }   
        }
        else{
            count++;
            //System.out.println("game count "+count);
            if(count==9){
                System.out.print("game draw");
                System.exit(1);
            }
            else{
                method();
            }
            

        }
        }
        static void first(){
            System.out.println("Enter name of player 1");
            Scanner sc=new Scanner(System.in);
            player1=sc.next();
            System.out.println("Enter name of player 2");
            player2=sc.next();
            //System.out.println("Its player 1 turn");
            //System.out.println("player 1 has to choose a position to replace:");  
        }      
    public static void main(String args[]){
        first();
        method();
    }
}