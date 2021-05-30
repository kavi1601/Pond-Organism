

import java.util.Scanner;

class Pond
{
    //Declaring variables
    static int fishValue,crabValue,snakeValue;
    static int ct=0;
    static int net=0;
    static int snakeCount=100;
    static int crabCount=100;
    static int fishCount=100;
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Create Objects for all three classes
        CatchFish catchFish= new CatchFish(); 
        CatchCrab catchCrab= new CatchCrab();
        CatchSnake catchSnake= new CatchSnake();   
        int iteration=1;
        int fv=0,cv=0;
        //breaking the progam crabCatchCunt Exceeds 20 or total organisms in the pond exceeds 1000000
        while(ct<=20 && fishCount+crabCount+snakeCount<=10000 && fishCount>0 && crabCount>0 && snakeCount>0)
        {
            
            //Getting catch count as the input from user
            fishValue=sc.nextInt();
            crabValue=sc.nextInt();
            snakeValue=sc.nextInt();
            
            if(fishValue>fishCount)
                fishValue=fishCount;
            if(crabValue>crabCount)
                crabValue=crabCount;
            if(snakeValue>snakeCount)
                snakeValue=snakeCount;
            
            //printing the input values
            catchFish.inputFish();        
            catchCrab.inputCrab();
            catchSnake.inputSnake();

            catchFish.pondFish(fishValue);
            catchCrab.pondCrab(crabValue);
            catchSnake.pondSnake(snakeValue);
            
            fv+=fishValue;
            cv+=crabValue;
             
            if(ct>20)
            {
                net=0;
                fishCount+=fv;
               
                crabCount+=cv;
            }
            
            if(fishCount+crabCount+snakeCount<=10000 && ct<=20 && fishCount>0 && crabCount>0 && snakeCount>0)
                System.out.printf("FisherMan Catches Count in %d time\nFishCount in pond :%d CrabCount :%d SnakeCount :%d NetOrganisms :%d\n",iteration++,fishCount,crabCount,snakeCount,net);
            else if(ct>20)
                System.out.println("NetBreaks");
            else if(fishCount<=0)
            {
                fishCount=0;
                System.out.println("No Fishes in Pond");
            }
            else if(crabCount<=0) 
            {
                crabCount=0;
                System.out.println("No Crabs in  Pond");
            }
            else if(snakeCount<=0) 
            {
                snakeCount=0;
                System.out.println("No Snakes in Pond");
            }
            else 
                System.out.println("Pond Overflow");
        }
        //printing the final count
        System.out.println("\nFinal Counts in Pond and Net");
        System.out.println("Remaining number of Fishes in pond : "+fishCount);
        System.out.println("Remaining number of Crabs in pond : "+crabCount);
        System.out.println("Remaining number of Snakes in pond : "+snakeCount);
        System.out.println("Number of Organisms Fisherman Catches : "+net);
    }
}