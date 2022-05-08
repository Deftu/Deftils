package xyz.deftu.deftils;

import java.util.concurrent.*;

public class Multithreader {
    private static final Multithreader DEFAULT_INSTANCE = new Multithreader(25);

    private final ThreadPoolExecutor executor;
    private final ScheduledExecutorService scheduledExecutor;

    public Multithreader(int poolSize) {
        this.executor = new ThreadPoolExecutor(poolSize, poolSize, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        this.scheduledExecutor = Executors.newScheduledThreadPool(poolSize);
    }

    /**
     * @param runnable The runnable to run asynchronously.
     */
    public void runAsync(Runnable runnable) {
        executor.execute(runnable);
    }

    /**
     * @param runnable The runnable code to be ran.
     * @param delay    The delay before running.
     * @param timeUnit The time unit of the delay.
     */
    public ScheduledFuture<?> schedule(Runnable runnable, long delay, TimeUnit timeUnit) {
        return scheduledExecutor.schedule(runnable, delay, timeUnit);
    }

    /**
     * @param runnable   The runnable code to be ran.
     * @param startDelay The initial delay before running the first time.
     * @param delay      The delay before running.
     * @param timeUnit   The time unit of the delay.
     */
    public ScheduledFuture<?> schedule(Runnable runnable, long startDelay, long delay, TimeUnit timeUnit) {
        return scheduledExecutor.scheduleAtFixedRate(runnable, startDelay, delay, timeUnit);
    }

    /**
     * @param runnable The code to submit.
     */
    public Future<?> submit(Runnable runnable) {
        return executor.submit(runnable);
    }

    /**
     * @return The thread executor created for this {@code Multithreader}.
     */
    public ThreadPoolExecutor getExecutor() {
        return executor;
    }

    /**
     * @return The executor service created for this {@code Multithreader}.
     */
    public ScheduledExecutorService getScheduledExecutor() {
        return scheduledExecutor;
    }

    /**
     * @return The default {@code Multithreader} instance, using a core pool size of 20.
     */
    public static Multithreader getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }
}
