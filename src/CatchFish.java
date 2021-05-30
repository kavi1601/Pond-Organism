
public class CatchFish implements fish
{
    @Override
    public void inputFish()
    {
        System.out.println("Input Fish Value : "+Pond.fishValue);
    } 
    
    @Override
    public void pondFish(int fishValue)
    {
        Pond.net+=fishValue;                             //this Operation add one fish in the net
        Pond.fishCount-=fishValue;                      //this Operation reduces one fish in the pond
        Pond.fishCount+=Pond.fishCount;          //this Operation add double the fish in the pond
    }
}
