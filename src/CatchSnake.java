
public class CatchSnake implements snake
{
    //declaring initial snake count in the pond
    static int snakeCount=100;
    
    @Override
    public void inputSnake()
    {
        System.out.println("Input Snake Count : "+Pond.snakeValue);
    }
    
    @Override
    public void pondSnake(int snakeValue)
    {
        while(snakeValue>0)
        {
            NetOperation.addNet(0);          //snake will be throw again into the pond so net added value be 0
            SubOperation.subSnakePond(1);
            AddOperation.addSnakePond(2);     //this Operation add double the snake count in the pond
            SubOperation.subCrabPond(1);      //thrown snake will eat one crab and fish and then dies
            SubOperation.subFishPond(1);                
            snakeValue-=1;
        }
        
    }
}
