class Access { 
public int a = 10; 
private int b = 20; 
protected int c = 30; 
void show() { 
System.out.println("Private = " + b); 
} 
} 
public class AccessSpecifier { 
public static void main(String[] args) { 
Access obj = new Access(); 
System.out.println("Public = " + obj.a); 
obj.show(); 
System.out.println("Protected = " + obj.c); 
System.out.println("Name:  Rishi Mandloi");
System.out.println("Enrollment:0873CS241133 "); 

} 
}