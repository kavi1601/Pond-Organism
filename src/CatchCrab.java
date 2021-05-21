
public class CatchCrab implements crab
{
    //declaring initial crab count in the pond
    static int crabCount=100;

    int maxCrab=0;
    
    @Override
    public void inputCrab()
    {
        System.out.println("Input Crab Count : "+Pond.crabValue);
    } 
    
    @Override
    public void pondCrab(int crabValue)
    {
        while(crabValue>0)
        {
            //these two operations are compulsory to every catches
            SubOperation.subCrabPond(1);
            AddOperation.addCrabPond(2);
            maxCrab+=1;            
            //when maxCrab less than 21 it will add one to the net and reduce one in pond and ddd double the crab into the pond
            if(maxCrab<21)                                     
            {
                NetOperation.addNet(1);        //this operation add the count in 1
            }
            ////when maxCrab equal to 21 net break and the all the organisms return to the pond again 
            //and organisms count in net value becomes )
            else if(maxCrab==21)
            {
                AddOperation.addCrabPond(21);                   //this operation add the crabs in the pond because net breaks 
                AddOperation.addFishPond(Pond.fishValue);       //this operation add the fishs in return to the pond
                NetOperation.net=0;                            //assign the net value 0 because net breaks
            }
            //for other value add the crab in pond 1 times because net breaks
            else
            {
                AddOperation.addCrabPond(1); 
            }
            crabValue-=1;
        }
    }
}
