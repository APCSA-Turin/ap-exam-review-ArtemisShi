
public class CombinedTable{
    private int capacity;
    private int h1;
    private int h2;
    private SingleTable st1;
    private SingleTable st2;
    
    
    public CombinedTable(SingleTable t1, SingleTable t2){
    capacity= t1.getNumSeats()+t2.getNumSeats()-2;
    h1=t1.getHeight();
    h2=t2.getHeight();
    st1=t1;
    st2=t2;
    }
    
    public boolean canSeat(int p){
    if(p<=capacity){
    return true;
    }
    else{
    return false;
    }
    }
    
    public double getDesirability(){
    if(h1==h2){
    return (st1.getViewQuality()+st2.getViewQuality())/2;
    }
    else{
    return ((st1.getViewQuality()+st2.getViewQuality())/2)-10;
    }
    }
    
    }
    