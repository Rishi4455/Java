interface Demo { 
void display(); 
} 
class Test implements Demo { 
public void display() { 
System.out.println("Interface Implemented"); 
} 
} 
public class InterfaceDemo { 
public static void main(String[] args) { 
Test obj = new Test(); 
obj.display(); 
System.out.println("Name: Rishi Mandloi"); 
System.out.println("Enrollment: 0873CS241133"); 
} 
}