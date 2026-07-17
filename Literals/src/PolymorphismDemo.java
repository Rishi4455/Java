class Addition { 
int add(int a, int b) { 
return a + b; 
} 
int add(int a, int b, int c) { 
return a + b + c; 
} 
 
} 
public class PolymorphismDemo { 
public static void main(String[] args) { 
Addition obj = new Addition(); 
System.out.println("Sum = " + obj.add(10, 20)); 
System.out.println("Sum = " + obj.add(10, 20, 30)); 
System.out.println("Name: Rishi Mandloi"); 
System.out.println("Enrollment: 0873CS241133 "); 
} 
}