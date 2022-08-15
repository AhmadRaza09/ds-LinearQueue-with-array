public class LinearQueue {
    private int[] array;
    private int topOfQueue;
    private int beginningOfQueue;

    public LinearQueue(int size) {
        array = new int[size];
        topOfQueue = -1;
        beginningOfQueue = -1;
    }

    /**
     * This method will tell the is queue is empty or not
     *
     * @return boolean
     */
    public boolean isEmpty() {
        if (beginningOfQueue == -1 || beginningOfQueue == array.length) {
            return true;
        }
        return false;
    }

    /**
     * This method will tell the queue is full or not
     *
     * @return
     */
    public boolean isFull() {
        if (topOfQueue == array.length - 1) {
            return true;
        }
        return false;
    }

    /**
     * This method will add the element in queue.
     *
     * @param value
     * @throws if queue full then throws Exception
     */
    public void enqueue(int value) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        } else if (isEmpty()) {

            //point top of queue to the first index of array
            beginningOfQueue = beginningOfQueue + 1;
        }

        //point next index of array
        topOfQueue = topOfQueue + 1;

        array[topOfQueue] = value;
    }

    /**
     * This method will return the beginning element of the queue
     *
     * @return
     * @throws Exception
     */
    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Emppty");
        }

        int value = array[beginningOfQueue];

        //point to the next index of array
        beginningOfQueue = beginningOfQueue + 1;

        return value;
    }
}