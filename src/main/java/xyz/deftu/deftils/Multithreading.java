package xyz.deftu.deftils;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Multithreading {

    private static final AtomicInteger threadCount = new AtomicInteger(0);
    private static final ThreadPoolExecutor executor = new ThreadPoolExecutor(50, 50, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(), (r) -> new Thread(r, String.format("Deftils Thread %s", threadCount.incrementAndGet())));
    private static final ScheduledExecutorService runnableExecutor = new ScheduledThreadPoolExecutor(6);

    /**
     * @param runnable The runnable to run asynchronously.
     */
    public static void runAsync(Runnable runnable) {
        executor.execute(runnable);
    }

    /**
     * @param runnable The runnable code to be ran.
     * @param delay    The delay before running.
     * @param timeUnit The time unit of the delay.
     */
    public static ScheduledFuture<?> schedule(Runnable runnable, long delay, TimeUnit timeUnit) {
        return runnableExecutor.schedule(runnable, delay, timeUnit);
    }

    /**
     * @param runnable   The runnable code to be ran.
     * @param startDelay The initial delay before running the first time.
     * @param delay      The delay before running.
     * @param timeUnit   The time unit of the delay.
     */
    public static ScheduledFuture<?> schedule(Runnable runnable, long startDelay, long delay, TimeUnit timeUnit) {
        return runnableExecutor.scheduleAtFixedRate(runnable, startDelay, delay, timeUnit);
    }

    /**
     * @param runnable The code to submit.
     */
    public static Future<?> submit(Runnable runnable) {
        return executor.submit(runnable);
    }

}
