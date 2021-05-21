
//this class contains the logic reducing the organism count in pond
public class SubOperation {

    //it reduces a amount of fish in the pond
    static void subFishPond(int subCount)
    {
        CatchFish.fishCount-=subCount;
    }
    //it reduces a amount of crab in the pond
    static void subCrabPond(int subCount)
    {
        CatchCrab.crabCount-=subCount;
    }
    //it reduces a amount of snake in the pond
    static void subSnakePond(int subCount)
    {
        CatchSnake.snakeCount-=subCount;
    }
}
