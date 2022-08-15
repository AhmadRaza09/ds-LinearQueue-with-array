public class Main {
    public static void main(String[] args) {
        LinearQueue linearQueue = new LinearQueue(5);
        boolean isFull = linearQueue.isFull();

        System.out.println(isFull);
    }
}