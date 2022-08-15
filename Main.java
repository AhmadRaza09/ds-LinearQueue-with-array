public class Main {
    public static void main(String[] args) throws Exception {
        LinearQueue linearQueue = new LinearQueue(5);
        linearQueue.enqueue(1);
        linearQueue.enqueue(2);
        linearQueue.enqueue(3);
        linearQueue.enqueue(4);
        linearQueue.enqueue(5);

        //get element from the queue
        System.out.println("--------------------------------------------Dequeue");
        int result = linearQueue.front();
        System.out.println(result);

        result = linearQueue.front();
        System.out.println(result);

        result = linearQueue.dequeue();
        System.out.println(result);

        result = linearQueue.dequeue();
        System.out.println(result);

        result = linearQueue.front();
        System.out.println(result);

        result = linearQueue.front();
        System.out.println(result);

        linearQueue.enqueue(1);

    }
}