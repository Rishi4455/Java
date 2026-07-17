class Parent { 
void display() { 
System.out.println("This is Parent Class"); 
} 
} 
class Child extends Parent { 
void show() { 
System.out.println("This is Child Class"); 
} 
} 
public class InheritanceDemo { 
public static void main(String[] args) { 
Child obj = new Child(); 
obj.display(); 
obj.show(); 
System.out.println("Name: Rishi Mandloi");
System.out.println("Enrollment: 0873CS241133"); 
}
}