

import java.util.Scanner;

class Pond
{
    //Declaring variable for getting input
    static int fishValue;
    static int crabValue; 
    static int snakeValue;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Getting catch count as the input from user
        fishValue=sc.nextInt();
        crabValue=sc.nextInt();
        snakeValue=sc.nextInt(); 
        //Create Objects for all three classes
        CatchFish catchFish= new CatchFish(); 
        CatchCrab catchCrab= new CatchCrab();
        CatchSnake catchSnake= new CatchSnake(); 
        //printing the initial catchFish value
        catchFish.inputFish(); 
        //doing operation on the fish count
        catchFish.pondFish(fishValue);
        //printing the initial catch snake value
        //printing the initial catch crab value
        catchCrab.inputCrab();
        //doing operation on the crab count
        catchCrab.pondCrab(crabValue);
        catchSnake.inputSnake();
        //doing operation on the snake count
        catchSnake.pondSnake(snakeValue);
        //printing the final count
        System.out.println("Remaining number of fishes in pond : "+CatchFish.fishCount);
        System.out.println("Remaining number of crabs in pond : "+CatchCrab.crabCount);
        System.out.println("Remaining number of snakes in pond : "+CatchSnake.snakeCount);
        System.out.println("Organisms of fisherman catches : "+NetOperation.net);
    }
}