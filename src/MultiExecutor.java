import java.util.List;

public class MultiExecutor {
    // Add any necessary member variables here

    /*
     * @param tasks to executed concurrently
     */
    List<Runnable> tasks ;
    public MultiExecutor(List<Runnable> tasks) {
        // Complete your code here
        this.tasks = tasks;
    }

    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {
        // complete your code here
        tasks.forEach(Runnable::run);
    }
}
