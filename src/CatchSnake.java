
public class CatchSnake implements snake
{
    
    @Override
    public void inputSnake()
    {
        
        System.out.println("Input Snake Value : "+Pond.snakeValue);
    }
    
    @Override
    public void pondSnake(int snakeValue)
    {
        Pond.net+=0;                                  //snake will be throw again into the pond so net added value be 0
        Pond.snakeCount-=snakeValue; 
        Pond.snakeCount+=Pond.snakeCount;             //this Operation add double the snake count in the pond
        //thrown snake will eat one crab and fish and then dies
        Pond.snakeCount+=snakeValue;
        Pond.fishCount-=snakeValue; 
        Pond.crabCount-=snakeValue;
        Pond.snakeCount-=snakeValue;
        
    }
}
