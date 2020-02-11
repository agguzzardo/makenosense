public class b{
    protected int data;
    public b(int data){
        this.data = data;
    }
    @Override
    public String toString(){
        return new String("Value of data in B is: "+Integer.toString(data));
    }
}