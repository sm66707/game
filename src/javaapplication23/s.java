
package javaapplication23;

import java.util.Scanner;

public class s 
{ Scanner sc=new Scanner(System.in);
   static int array[][]=new int[9][9];
   static String arr[][] = new String[9][9];
    public void createArray()// y7ot al arr b spaces for initialization
    {
        String x[][];
        x = arr;
        for (int row = 0; row < 9; row++)
        {
            for (int col = 0; col < 9; col++) {
                x[row][col] = " ";
            }
        }
    }

    public int print(String x[][])// y print al array kolha b form mo3ayn
    {
       
        int row, col, c = 1, r = 1;
        x = arr;
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
    
    public int random(int y)//y kmyt al a3dad al f sodoku randomly 
    {
        String x[][], val, rand[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int row, col;
        
        x = arr;
        for (int i = 0; i < y; i++)//y7t al random number
        {
            row = (int) (Math.random() * (9));
            col = (int) (Math.random() * (9));
            val = rand[(int) (Math.random() * 8)];
            if (x[row][col] != " ") {
                y++;
                continue;//ytl3 mn al for 5ales
            }
            if (check(val, row, col, x) ==1||check(val, row, col, x) ==2||check(val, row, col, x) ==3) {
                y++;
                continue;
            }
            x[row][col] = val;
        }
        return print(x);

    }
    
    public static int check(String val, int row, int col, String x[][]) //y check tkrar al a3dad
    {
        for (int i = 0; i < 9; i++) {//ym4i 3la al array y4of al val mawgod wlala abl keda
            if (x[row][i] == val) {
                return 1;
            }
            if (x[i][col] == val) {
                return 2;
            }
            for (int j = row - (row % 3); j < row - (row % 3) + 3; j++) {
                for (int k = col - (col % 3); k < col - (col % 3) + 3; k++) {
                    if (x[j][k] == val) {
                        return 3;
                    }
                }
            }
        }
        return 4;
    }
    
 public int playANDwin(int y) {
        int row, col,v;
        String val;
        String x[][];
        x = arr;
        int count = 81 - y;//kam space f al array
        Scanner sc = new Scanner(System.in);
        while (count != 0) {
            System.out.println("please fill this");
            System.out.print("row=");
            row = sc.nextInt()-1;
            System.out.print("");
            System.out.print("col=");
            col = sc.nextInt()-1;
            System.out.print("value=");
            v = sc.nextInt();
            String rand[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
            if (v <1 || v >9 ||col <0 || col >8 ||row <0 || row >8 ) {
                System.out.println("all numbers must be between 1and 9\nTry Again");
                count++;
            } else if (check(rand[v-1], row, col, x) != 4) {
                val=rand[v-1];
                if (check(val, row, col, x) == 1) {
                    System.out.println("the index is exact in the same row write another one\nTry Again");
                } else if (check(val, row, col, x) == 2) {
                    System.out.println("the index is exact in the same coloum write another one\nTry Again");
                } else if (check(val, row, col, x) == 3) {
                    System.out.println("the index is exact in the same matrix(3*3) write another one\nTry Again");
                }
                count++;
            } else {
                if (x[row][col] != " ")//fe number mawgod
                {
                    System.out.println("error number is exist \nTry Again");
                   count++;
                } else {
                    val=rand[v-1];
                    x[row][col] = val;
                    print(x);
                }
            }
            count--;
        }
        System.out.println(" you have bass this level Successfully");
        return 1;
    }
 
 

}
