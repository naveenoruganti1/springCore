package com.bpp.beans;

import java.util.concurrent.atomic.AtomicInteger;

public class ObjectTracker {
	public static AtomicInteger counter=new AtomicInteger(0);
	
	public static void increment() {
		counter.getAndIncrement();
	}
	public static int getCounter() {
		return counter.get();
	}
}
