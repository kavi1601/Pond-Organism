
public class CatchFish implements fish
{
    //declaring initial fish count in the pond
    static int fishCount=100; 
    @Override
    public void inputFish()
    {
        System.out.println("Input Fish Count : "+Pond.fishValue);
    } 
    
    @Override
    public void pondFish(int fishValue)
    {
        
        while(fishValue>0)
        {
            NetOperation.addNet(1);            //this Operation add one fish in the net
            SubOperation.subFishPond(1);        //this Operation reduces one fish in the pond
            AddOperation.addFishPond(2);        //this Operation add double the fish in the pond
            fishValue-=1;
        }
    }
}
