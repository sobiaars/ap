/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author sarshad.bese12seecs
 */
public class JavaApplication3 {
 

  public static int[][] randomize(int[][] A,int size){
       Random randomGenerator = new Random();
        int i,j;
      for(i=0;i<size;i++){
      
      for(j=0;j<size;j++){
      
       int randomInt = randomGenerator.nextInt(10);      //random function between 0 and 99
       
       A[i][j] =randomInt;
      }
      }
      
      return A;
}
    public static int[][] multiply(int[][] A, int[][] B)
    {        
    }
    
    public int[][] sub(int[][] A, int[][] B)
    {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] - B[i][j];
        return C;
    }

    public int[][] add(int[][] A, int[][] B)
    {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }
    /** Funtion to split parent matrix into child matrices **/
   
  
   public void split(int[][] A,int[][] B,int iB, int jB) 
    {
        for(int i1 = 0, i2 = iB; i1 < B.length; i1++, i2++)
            for(int j1 = 0, j2 = jB; j1 < B.length; j1++, j2++)
                B[i1][j1] = A[i2][j2];
    }
    
    public void join(int[][]A,int[][] B,int iB, int jB) 
    {
        for(int i1 = 0, i2 = iB; i1 < A.length; i1++, i2++)
            for(int j1 = 0, j2 = jB; j1 < A.length; j1++, j2++)
                B[i2][j2] = A[i1][j1];
    }    
  
  
  
    public static void main(String[] args) {
        
          Scanner scan = new Scanner(System.in);
          System.out.println("Press 1 for iterative matrix multiplication and press 2 for Strassen’s algorithm matrix multiplication  ");
        int enter1 = scan.nextInt();
        System.out.println("enter size of 1st matrix");
        int s1= scan.nextInt();
         System.out.println("enter size of 2nd matrix");
        int s2= scan.nextInt();
        int[][] first=new int[s1][s1];
        int[][] second=new int[s2][s2];
      int[][] result=new int[s1][s2];
      randomize(first,s1);
       randomize(second,s2);
        
        if (enter1==1){
            if(s1==s2){
         
            for(int m=0;m<s1;m++ ){
                   int sum=0;
            for(int n=0;n<s1;n++){
            for(int o=0;o<s2;o++){
             sum = sum + first[m][o]*second[o][m];
            
            }
              result[m][n] = sum;
            }
            
            }
           for(int m=0;m<s1;m++ ){
                 
            for(int n=0;n<s1;n++){
            System.out.println( result[m][n]);
           
            }}
            }
            else
                System.out.println("cant be multiplied : size of first and second matrix is not equal. "); 
        
        }
        
        
        else if (enter1==2){
          multiply(first,second);
        }
        
         else{
           System.out.println("wrong input  ");
        }
    }
    
}
