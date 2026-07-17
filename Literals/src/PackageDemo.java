class ThreadDemo extends Thread { 
public void run() { 
System.out.println("Thread is Running"); 
} 
public class ThreadLifeCycle { 
public static void main(String[] args) { 
ThreadDemo t = new ThreadDemo(); 
t.start(); 
System.out.println("Thread Started"); 
System.out.println("Name:Rishi Mandloi "); 
System.out.println("Enrollment: 0873CS241133"); 
} 
}
}