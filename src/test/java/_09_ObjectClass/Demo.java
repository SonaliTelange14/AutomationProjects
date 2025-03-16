package _09_ObjectClass;

/*Object class is Super most parent class to all classes in java.
 * Object class implicitly extend by all classes in java,
 * not need to write extends keywork with classes for extend Object class, its impicitly extended.
 * There 11 methods present in Object class but 1 method is deprecated.
*/
/*
 * finalize() method-Deprecated. Finalization is deprecated and subject to
 * removal in a futurerelease. The use of finalization can lead to problems with
 * security,performance, and reliability.
 */
public class Demo {
	public static void main(String[] args) throws Throwable {
		Demo d= new Demo();
		d.clone();
		d.equals(d);
		d.getClass();
		d.hashCode();
		d.notify();
		d.notifyAll();
		d.toString();
		d.wait();
		d.wait(1000);
		d.wait(1000, 1000);
		d.finalize();
		
	}

	
}
