public class LinearQueue{
    private int [] array;
    private int topOfQueue;
    private int beginningOfQueue;

    public LinearQueue(int size){
        array = new int[size];
        topOfQueue = -1;
        beginningOfQueue = -1;
        System.out.println("Created Linear Queue");
    }
}