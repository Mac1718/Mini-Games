package Searching;

import java.util.Scanner;
class TicTacToe

{
    public static void main(String[] args)
    {
        char[][] board =new char[3][3];
        for(int row=0;row<board.length;row++)
        {
            for(int col=0;col<board[row].length;col++)
            {
                board[row][col]=' ';
            }
        }
        char player='X';
        boolean gameOver=false;
        
        Scanner sc = new Scanner(System.in);
        
        while(!gameOver)
        {
            printboard(board);
            System.out.println("Player" + player + " Enter:");
            int row=sc.nextInt();
            int col=sc.nextInt();
            
            if(board[row][col]==' ')
            {
                board[row][col]=player;
                gameOver=havewon(board,player);
                if(gameOver)
                {
                    System.out.println("Player " +player+ " Has Won");
                }
                else
                {
                    if(player=='X')
                    {
                        player='O';
                    }
                    else
                    {
                        player='X';
                    }
                }
            }
            else
            {
            System.out.println("Space is Already Occupied");
            }
        }
        printboard(board);
    }
    
        public static boolean havewon(char[][] board,char player)
    {
        for(int row=0;row<board.length;row++)
        {
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player)
            {
                return true;
            }
        }
        for(int col=0;col<board.length;col++)
        {
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player)
            {
                return true;
            }
        }
        
        if(board[0][2]==player && board[1][1] ==player && board[2][0]==player)
        {
            return true;
        }
        if(board[0][0]==player && board[1][1] ==player && board[2][2]==player)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
     public static void printboard(char[][] board)
    {
        for(int row=0;row<board.length;row++)
        {
            for(int col=0;col<board[row].length;col++)
            {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
}