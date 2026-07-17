class Multi extends Thread { 
public void run() { 
System.out.println("Thread Running"); 
} 
} 
public class MultiThread { 
public static void main(String[] args) { 
Multi t1 = new Multi(); 
t1.start(); 
System.out.println("Main Thread"); 
System.out.println("Name: Rishi Mandloi");

System.out.println("Enrollment:0873CS241133 "); 

} 
} 