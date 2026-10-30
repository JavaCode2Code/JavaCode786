package com.scjp.weakandSof.ref;

import java.lang.ref.WeakReference;

/*

In Java, WeakReference and SoftReference are
 part of the java.lang.ref package and are used 
 to manage memory more effectively by influencing
 how objects are garbage collected. Both references
 allow objects to be garbage collected under certain
 conditions, but they differ in their behavior and 
 use cases.

Weak Reference

A WeakReference allows the garbage collector to reclaim
the referenced object as soon as it is no longer strongly
reachable. If an object is only weakly referenced, 
it becomes eligible for garbage collection during
 the next GC cycle. Weak references are commonly
 used in scenarios where you want to avoid memory
 leaks by allowing objects to be automatically 
 removed when they are no longer in use.

Use Case:

Weak references are ideal for caches or canonical mappings,
 such as WeakHashMap, where you want to allow keys or values
 to be garbage collected when they are no longer strongly
 referenced.

*/
public class WeakReferenceDemo {
	public static void main(String[] args) {
		String strongRef = new String("WeakReference Demo");
		WeakReference<String> weakRef = new WeakReference<>(strongRef);
		// Remove strong reference
		strongRef = null;
		// Check if the object is still accessible
		if (weakRef.get() != null) {
			System.out.println("Object is still accessible: " + weakRef.get());
		} else {
			System.out.println("Object has been garbage collected.");
		}
	}
}
