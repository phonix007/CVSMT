/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Comparable
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Arrays
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 */
package io.grpc;

import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class Deadline
implements Comparable<Deadline> {
    private static final long MAX_OFFSET;
    private static final long MIN_OFFSET;
    private static final long NANOS_PER_SECOND;
    private static final SystemTicker SYSTEM_TICKER;
    private final long deadlineNanos;
    private volatile boolean expired;
    private final Ticker ticker;

    static {
        long l;
        SYSTEM_TICKER = new Ticker(){

            @Override
            public long nanoTime() {
                return System.nanoTime();
            }
        };
        MAX_OFFSET = l = TimeUnit.DAYS.toNanos(36500L);
        MIN_OFFSET = -l;
        NANOS_PER_SECOND = TimeUnit.SECONDS.toNanos(1L);
    }

    private Deadline(Ticker ticker, long l, long l2, boolean bl) {
        this.ticker = ticker;
        long l3 = Math.min((long)MAX_OFFSET, (long)Math.max((long)MIN_OFFSET, (long)l2));
        this.deadlineNanos = l + l3;
        boolean bl2 = bl && l3 <= 0L;
        this.expired = bl2;
    }

    private Deadline(Ticker ticker, long l, boolean bl) {
        this(ticker, ticker.nanoTime(), l, bl);
    }

    public static Deadline after(long l, TimeUnit timeUnit) {
        return Deadline.after(l, timeUnit, SYSTEM_TICKER);
    }

    public static Deadline after(long l, TimeUnit timeUnit, Ticker ticker) {
        Deadline.checkNotNull(timeUnit, "units");
        return new Deadline(ticker, timeUnit.toNanos(l), true);
    }

    private static <T> T checkNotNull(T t, Object object) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf((Object)object));
    }

    private void checkTicker(Deadline deadline) {
        if (this.ticker == deadline.ticker) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tickers (");
        stringBuilder.append((Object)this.ticker);
        stringBuilder.append(" and ");
        stringBuilder.append((Object)deadline.ticker);
        stringBuilder.append(") don't match. Custom Ticker should only be used in tests!");
        throw new AssertionError((Object)stringBuilder.toString());
    }

    public static Ticker getSystemTicker() {
        return SYSTEM_TICKER;
    }

    public int compareTo(Deadline deadline) {
        this.checkTicker(deadline);
        long l = this.deadlineNanos - deadline.deadlineNanos LCMP 0L;
        if (l < 0) {
            return -1;
        }
        return l > 0;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Deadline)) {
            return false;
        }
        Deadline deadline = (Deadline)object;
        Ticker ticker = this.ticker;
        if (ticker == null ? deadline.ticker != null : ticker != deadline.ticker) {
            return false;
        }
        return this.deadlineNanos == deadline.deadlineNanos;
    }

    public int hashCode() {
        Object[] arrobject = new Object[]{this.ticker, this.deadlineNanos};
        return Arrays.asList((Object[])arrobject).hashCode();
    }

    public boolean isBefore(Deadline deadline) {
        this.checkTicker(deadline);
        return this.deadlineNanos - deadline.deadlineNanos < 0L;
    }

    public boolean isExpired() {
        if (!this.expired) {
            if (this.deadlineNanos - this.ticker.nanoTime() <= 0L) {
                this.expired = true;
                return true;
            }
            return false;
        }
        return true;
    }

    public Deadline minimum(Deadline deadline) {
        this.checkTicker(deadline);
        if (this.isBefore(deadline)) {
            deadline = this;
        }
        return deadline;
    }

    public Deadline offset(long l, TimeUnit timeUnit) {
        if (l == 0L) {
            return this;
        }
        Deadline deadline = new Deadline(this.ticker, this.deadlineNanos, timeUnit.toNanos(l), this.isExpired());
        return deadline;
    }

    public ScheduledFuture<?> runOnExpiration(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        Deadline.checkNotNull(runnable, "task");
        Deadline.checkNotNull(scheduledExecutorService, "scheduler");
        return scheduledExecutorService.schedule(runnable, this.deadlineNanos - this.ticker.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public long timeRemaining(TimeUnit timeUnit) {
        long l = this.ticker.nanoTime();
        if (!this.expired && this.deadlineNanos - l <= 0L) {
            this.expired = true;
        }
        return timeUnit.convert(this.deadlineNanos - l, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long l = this.timeRemaining(TimeUnit.NANOSECONDS);
        long l2 = Math.abs((long)l);
        long l3 = NANOS_PER_SECOND;
        long l4 = l2 / l3;
        long l5 = Math.abs((long)l) % l3;
        StringBuilder stringBuilder = new StringBuilder();
        if (l < 0L) {
            stringBuilder.append('-');
        }
        stringBuilder.append(l4);
        if (l5 > 0L) {
            Object[] arrobject = new Object[]{l5};
            stringBuilder.append(String.format((String)".%09d", (Object[])arrobject));
        }
        stringBuilder.append("s from now");
        if (this.ticker != SYSTEM_TICKER) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(" (ticker=");
            stringBuilder2.append((Object)this.ticker);
            stringBuilder2.append(")");
            stringBuilder.append(stringBuilder2.toString());
        }
        return stringBuilder.toString();
    }

    public static abstract class Ticker {
        public abstract long nanoTime();
    }

}

