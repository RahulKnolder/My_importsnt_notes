package ThreadCuncurrency.ThreadLocals.Example_2;

public class ThreadLocals implements Runnable {
    int counter;
    ThreadLocal<Integer> threadLocalCounter = new ThreadLocal<Integer>() {
        protected Integer initialValue() {
            return 9;
        }

    };

    @Override
    public void run() {
        counter++;

        if (threadLocalCounter.get() != null) {
            threadLocalCounter.set(threadLocalCounter.get().intValue() + 10);
        } else {
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