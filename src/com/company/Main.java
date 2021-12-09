package com.company;

/*
public class Pattern_Basic1 {
    public static void main(String[] args) {
     int n=3;
     for (int i=1 ; i<=n;i++){               //row-
         for (int j=1;j<=n;j++){             //col!
             System.out.print("*");
         }
         System.out.println();
             }
        }
}
-------------------------------------------------
                 ***
                 ***
                 ***
 *///filled box pattern

/*
class Pattern_basic2{
    public static void main(String[] args) {
        int n=5 ;
        for (int i =1; i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
-------------------------------------------------
                    *
                    **
                    ***
                    ****
                    *****
*/ //right side triangle

/*
class Pattern_basic5{
    public static void main(String[] args) {
        int n = 5;
      for (int i=1;i<=n;i++){
          for (int j=1;j<=n-i;j++)
          {
              System.out.print(" ");
          }
          for (int k=1;k<=i;k++){
              System.out.print("*");
          }
          System.out.println();
      }
    }
}
/*
----------------------------------------------------
                *
               **
              ***
             ****
            *****
*/// left triangle

/*
class Pyramid_Pattern{
        public static void main(String[] args) {
            int n=5;
            for (int i=1;i<=n;i++){
                for (int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for (int k=1;k<=i;k++){
                    System.out.print(" * ");// just a space on both sides will make pyramid
                }
                System.out.println();
            }
        }
    }
----------------------------------------------
         *
       *  *
      *  *  *
    *  *  *  *
  *  *  *  *  *
 *///pyramid pattern

/*
 class  number_pattern{
     public static void main(String[] args) {
         int n=5 ;
         for (int i=1;i<=n;i++){
             for (int j=1;j<=i;j++){
                 System.out.print( i );
             }
             System.out.println();
         }
     }
 }
---------------------------------------------------------
        1
        22
        333
        4444
        55555
 */ //number triangle



/*
class  number_pattern2{
    public static void main(String[] args) {
        int n=5 ;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print( j );
            }
            System.out.println();
        }
    }
}
------------------------------------
                1
                12
                123
                1234
                12345
 *///increasing number triangle

/*
class Pattern_basic4{
    public static void main(String[] args) {
        int n=5;
        int a=0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
------------------------------------------------------
        0
        1 2
        3 4 5
        6 7 8 9
        10 11 12 13 14
 */// j loop digits

//------------------------------------Good Ones-----------------------------//
/*
class DiamondPattern{
    public static void main(String[] args) {
        int n=5;
        int i,j,k;
        for (i=1;i<=n;i++){
            for (j=n;j>i;j--){
                System.out.print(" ");
            }
            for (k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half of triangle
        for (i=n-1;i>=1;i--){
            for (j=n;j>i;j--){
                System.out.print(" ");
            }
            for (k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
---------------------------------------------------------------------------------------------
                 *
                ***
               *****
              *******
             *********
              *******
               *****
                ***
                 *
 */ //full diamond

/*
class HalfDiamond {
    public static void main(String[] args) {
        int n = 5;
        // Loop to print the upper half
        // diamond pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++)
                System.out.print("*");
                System.out.println(" ");
        }
        // Loop to print the lower half
        // diamond pattern
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++)
                System.out.print("*");
            System.out.println(" ");
        }
    }
}
-------------------------------------------------------------------------------------------
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
 *///half diamond

/*
class InvertedPyramid{
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=4;k>=i;k--){
                System.out.print("*");
            }
            for (int l=3;l>=i;l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
--------------------------
        *******
         *****
          ***
           *
 *///inverted triangle

/*
class InvertedPyramid{
    public static void main(String[] args) {
        for (int i=5;i>=1;i--){
            for (int j=5 ; j>i ;j--){
                System.out.print(" ");
            }
            for (int k=1;k<(i*2);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
-----------------------------------
        *********
         *******
          *****
           ***
            *
 */ //inverted triangle

/*
class Pluse{
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==3 || j==3){
                    System.out.print("*");
                }
                else
                 System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
--------------------------------------------
          *
          *
        *****
          *
          *
 *///plus symbol

/*
class Hollow_Reactangle{
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){                 //row
            for (int j=1;j<=n;j++){             //col
              if (i==1 || i==n ||j==1 || j==n){
                  System.out.print("*");
              }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
------------------------------------
        *****
        *   *
        *   *
        *   *
        *****
 *///box pattern

/*
class AlphabetPattern{
    public static void main(String[] args) {
        char ch='A';
        for (int i=1;i<=5;i++){                  //rows
            for (int j=1;j<=i;j++){             //col
                System.out.print(ch+" ");
                ch++;
            }System.out.println(" ");
        }
    }
}
======================
        A
        B C
        D E F
        G H I J
        K L M N O
 *///alpha bet pattern

/*
class CrossPattern{
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==j || i+j==n+1)
                    System.out.print("*");
                else
                    System.out.print(" "); //for space in between
            }
            System.out.println(" "); //for new line
        }
    }
}
-------------------------
                *   *
                 * *
                  *
                 * *
                *   *
*///cross patter

/*
class Binary_Triangle{
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j%2);
            }
            System.out.println();
        }
    }
}
-------------------------------------------
        1
        10
        101
        1010
        10101
 */ //binary

