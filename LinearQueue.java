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
}