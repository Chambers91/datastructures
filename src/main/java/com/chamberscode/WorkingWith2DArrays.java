package com.chamberscode;

import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args){

    //        //grid data structure , whenever you have a grid, use 2 dimesional data structures
  char[][] board = new char[3][3];
  for(int i = 0; i<3; i++){
      for (int j = 0; j<3; j++){
          board[i][j] = '-';


      }}

  char [][] boardTwo = new char [][]{
          new char[]{'O','-','-'},
          new char[]{'O','-','-'},
          new char[]{'O','-','-'},
        };

        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] =  '0';
        System.out.println(Arrays.deepToString(board));

        System.out.println(Arrays.deepToString(boardTwo));
  }

}
