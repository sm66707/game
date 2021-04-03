
package javaapplication23;

import java.util.Scanner;

class m {
    static int array[][]=new int[9][9];
   static int print(int [][]x){
      
       x=array;
        int row, col, c = 1, r = 1;
       System.out.print("{" + " " + "}");
          System.out.print(" ");
        System.out.print(" ");
         for (int i = 0; i < 9; i++)// arqama al cols
        {
            System.out.print("{" + c++ + "}");//print number of cols
            if (i % 3 == 2) {
                System.out.print(" ");
                System.out.print(" ");}//print al msafa f al (number of cols)
        }
          System.out.println("");
        System.out.println("");
         for (row = 0; row < 9; row++) 
        {
            System.out.print("{" + r++ + "}"); //print mumber of rows
            for (col = 0; col < 9; col++) {
                if (col % 3 == 0)//space al col
                {
                    System.out.print(" ");
                    System.out.print(" ");
                }

                System.out.print("[" + x[row][col] + "]");
            }
            if (row % 3 == 2)
            {System.out.println("");}//space al row
            System.out.println("");//my7ot4 kol al morb3at gmb b3d
        }
       
       
   return 0;
   }
 static int select(int y){

int arr1[][]={{5,3,0,0,7,0,0,0,0},{6,0,0,1,9,5,0,0,0},{0,9,8,0,0,0,0,6,0},{8,0,0,0,6,0,0,0,3},{4,0,0,8,0,3,0,0,1},{7,0,0,0,2,0,0,0,6},{0,6,0,0,0,0,2,8,0},{0,0,0,4,1,9,0,0,5},{0,0,0,0,8,0,0,7,9}};
int arr2[][]={{9,0,3,1,0,4,0,5,0},{1,7,0,0,2,0,0,4,9},{0,5,4,6,8,9,7,3,0},{0,2,1,0,3,0,5,9,0},{4,9,0,8,5,2,0,1,7},{0,3,5,0,6,0,8,2,0},{0,8,9,7,1,3,4,6,0},{3,1,0,0,4,0,0,8,5},{6,0,2,0,9,0,1,0,3}};
int arr3[][]={{4,9,0,0,0,0,2,3,0},{5,0,0,0,4,3,6,0,0},{2,0,0,0,0,0,0,0,0},{9,0,6,7,8,0,0,0,0},{1,0,0,9,3,6,0,0,5},{0,0,0,0,1,2,9,0,3},{0,0,0,0,0,0,0,0,6},{0,0,9,3,5,0,0,0,4},{0,4,5,0,0,0,0,1,7}};
int arr4[][]={{2,4,8,0,0,5,7,0,6},{0,7,0,6,2,8,3,0,9},{0,3,6,0,4,1,0,8,2},{0,8,0,0,0,9,1,0,4},{3,5,9,1,0,4,6,2,0},{0,1,4,0,6,2,0,5,0},{0,6,0,4,0,7,2,0,5},{1,0,5,0,8,0,4,3,0},{0,2,7,9,5,0,8,0,0}};
int arr5[][]={{0,0,5,3,0,0,0,0,0},{8,0,0,0,0,0,0,2,0},{0,7,0,0,1,0,5,0,0},{4,0,0,0,0,5,3,0,0},{0,1,0,0,7,0,0,0,6},{0,0,3,2,0,0,0,8,0},{0,6,0,5,0,0,0,0,9},{0,0,4,0,0,0,0,3,0},{0,0,0,0,0,9,7,0,0}};
int arr6[][]={{8,0,0,0,0,0,0,0,0},{0,0,3,6,0,0,0,0,0},{0,7,0,0,9,0,2,0,0},{0,5,0,0,0,7,0,0,0},{0,0,0,0,4,6,7,0,0},{0,0,0,1,0,0,0,3,0},{0,0,1,0,0,0,0,6,8},{0,0,8,5,0,0,0,1,0},{0,9,0,0,0,0,4,0,0}};

if(y==1){
   array=arr1;
print(arr1);
}
else if(y==2)
{array=arr2;
print(arr2);
}
else if(y==3)
{array=arr3;
print(arr3);
}
else if(y==4)
{array=arr4;
print(arr4);
}
else if(y==5)
{array=arr5;
print(arr5);
}
else if(y==6)
{array=arr6;
print(arr6);
}
return 0;
}
 static int check2(int v,int row,int col,int x[][]){
      for (int i= 0; i < 9; i++) {//ym4i 3la al array y4of al val mawgod wlala abl keda
            if (x[row][i] == v) {
                return 1;
            }
            if (x[i][col] == v) {
                return 2;
            }
            for (int j = row - (row % 3); j < row - (row % 3) + 3; j++) {
                for (int k = col - (col % 3); k < col - (col % 3) + 3; k++) {
                    if (x[j][k] == v) {
                        return 3;
                    }
                }
    
 }
      }
       return 4;
 }
 
static int play(){
 int row,col,v;int value;
 int counter=0;
 int[][] x = array;
 Scanner sc = new Scanner(System.in);
 for(int i=0;i<9;i++){
 for(int j=0;j<9;j++){
    if(x[i][j]==0)
        counter++;
 }
 }
    while (counter != 0) {
  System.out.println("please fill this");
            System.out.print("row=");
            row = sc.nextInt()-1;
            System.out.print("");
            System.out.print("col=");
            col = sc.nextInt()-1;
            System.out.print("value=");
            v = sc.nextInt();
 if (v <1 || v >9 ||col <0 || col >8 ||row <0 || row >8 ) {
                System.out.println("all numbers must be between 1and 9\nTry Again");
               counter++;  
            } 
 else if (check2(v, row, col, x) != 4) {
                value=v;
                if (check2(v, row, col, x) == 1) {
                    System.out.println("the index is exact in the same row write another one\nTry Again");
                } else if (check2(v, row, col, x) == 2) {
                    System.out.println("the index is exact in the same coloum write another one\nTry Again");
                } else if (check2(v, row, col, x) == 3) {
                    System.out.println("the index is exact in the same matrix(3*3) write another one\nTry Again");
                }
                counter++;
                 } else {
                if (x[row][col] != 0)//fe number mawgod
                {
                    System.out.println("error number is exist \nTry Again");
                } else {
                    value=v;
                    x[row][col] = v;
                    print(x);
                }
            }
                counter--;
            } 
 return 0;
}
}

