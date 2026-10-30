package com.scjp.weakandSof.ref;

import java.lang.ref.SoftReference;

/*

Soft Reference

A SoftReference is similar to a weak reference but is 
more resilient to garbage collection. Objects referenced 
by soft references are only cleared when the JVM is
 running low on memory. This makes soft references 
 suitable for memory-sensitive caches, where objects
  should remain in memory as long as there is sufficient space.


Use Case:

Soft references are commonly used for memory-sensitive caches,
 such as image caches, where objects should remain in 
 memory until the JVM needs to reclaim space to avoid 
 an OutOfMemoryError.

Key Differences

Garbage Collection Timing: Weak references are cleared
 as soon as the object is no longer strongly reachable. 
 Soft references are cleared only when the JVM is low on memory.

Use Cases: Weak references are used for short-lived caches
 or mappings (e.g., WeakHashMap). Soft references are used 
 for memory-sensitive caches that should retain objects as
  long as possible.

Behavior: Weak references are more aggressive in allowing 
garbage collection. Soft references provide a balance 
between retaining objects and freeing memory when needed.

Understanding these differences helps in choosing the
 right reference type based on the application's
  memory management requirements.


Example:



*/
public class SoftReferenceDemo {
	public static void main(String[] args) {
		String strongRef = new String("SoftReference Demo");
		SoftReference<String> softRef = new SoftReference<>(strongRef);

		// Remove strong reference
		strongRef = null;

		// Check if the object is still accessible
		if (softRef.get() != null) {
			System.out.println("Object is still accessible: " + softRef.get());
		} else {
			System.out.println("Object has been garbage collected.");
		}
	}
}
