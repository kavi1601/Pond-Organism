
public class CatchCrab implements crab
{
    
    @Override
    public void inputCrab()
    {
        System.out.println("Input Crab Value : "+Pond.crabValue);
    } 
    
    @Override
    public void pondCrab(int crabValue)
    {
            Pond.ct+=crabValue;
            Pond.net+=crabValue;                              //this operation add the net count in 1
            Pond.crabCount-=crabValue; 
            Pond.crabCount+=Pond.crabCount;           //this Operation add double the crab count in the pond    
    }
}
