public class LearningThread {
    public static void main(String[] args) {
        System.out.println("Testing");
        //testThread();

    }

    public static void testThread() {
        Thread thread = new Thread(() -> {
            System.out.println("We are now in thread " + Thread.currentThread().getName());
            System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
        });

        thread.setName("New worker Thread");

        thread.setPriority(Thread.MAX_PRIORITY);

        Utils.print("We are in thread " + Thread.currentThread().getName() + " before starting a new thread");
        thread.start();
        Utils.print("We are in thread " + Thread.currentThread().getName() + " after starting a new thread");
    }
}
