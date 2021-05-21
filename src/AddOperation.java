
//this class contains the logic adding the organism count in pond
public class AddOperation {
    
    //it adding a amount of fish in the pond
    static void addFishPond(int addCount)
    {
        CatchFish.fishCount+=addCount;
    }
    //it adding a amount of fish in the pond
    static void addCrabPond(int addCount)
    {
        CatchCrab.crabCount+=addCount;
    }
    //it adding a amount of fish in the pond
    static void addSnakePond(int addCount)
    {
        CatchSnake.snakeCount+=addCount;
    }
}
