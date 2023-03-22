package ThreadCuncurrency.ThreadLocals;

public class ThreadLocals implements Runnable {
    int counter;
    ThreadLocal<Integer> threadLocalCounter = new ThreadLocal<Integer>();

    @Override
    public void run() {
        counter++;

        if (threadLocalCounter.get() != null) {
            threadLocalCounter.set(threadLocalCounter.get().intValue() + 1);
        } else {
            threadLocalCounter.set(0);
            threadLocalCounter.set(threadLocalCounter.get().intValue() + 5);
        }
        System.out.println("Counter: " + counter);
        System.out.println("threadLocalCounter: " + threadLocalCounter.get());
    }
}

/*public T get():-Returns the value in the current thread's copy of this thread-local variable.
* protected T initialValue():-Returns the current thread's "initial value" for this thread-local variable.
*public void remove():-Removes the current thread's value for this thread-local variable.
*public void set(T value):-Sets the current thread's copy of this thread-local variable to the specified value.
 */