package Searching;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors 
{
    public static void main(String[] args)
    {
    String[] rps={"r","p","s"};  
    String computermove=rps[new Random().nextInt(rps.length)];
    Scanner sc=new Scanner(System.in);
    String playermove;
    while(true)
    {
    System.out.println("Enter Your Move (r,p,s)");
    playermove=sc.nextLine();
    if(playermove.equals("r") || playermove.equals("p") || playermove.equals("s")  )
    {
        break;
    }
    else
    {
        System.out.println(playermove+ "Enter a valid Move");
    }
    }

    System.out.println("Computer Played : "+computermove);

    if(playermove.equals(computermove))
    {
        System.out.println("Match is Tied");
    }

    else if(playermove.equals("r"))
    {
        if(computermove=="p")
        {
            System.out.println("You Win");
        }
        else if(computermove=="s")
        {
            System.out.println("You Lose");
        }
    }

    else if(playermove.equals("p"))
    {
        if(computermove=="r")
        {
            System.out.println("You Win");
        }
        else if(computermove=="s")
        {
            System.out.println("You Lose");
        }
    }

    else if(playermove.equals("s"))
    {
        if(computermove=="p")
        {
            System.out.println("You Win");
        }
        else if(computermove=="r")
        {
            System.out.println("You Lose");
        }
    }

    } 
}
