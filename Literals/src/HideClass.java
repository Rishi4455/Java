class Hidden { 
    void show() { 
        System.out.println("Hidden Class Accessed"); 
    } 
} 
public class HideClass { 
    public static void main(String[] args) { 
 
        Hidden obj = new Hidden(); 
        obj.show(); 
        System.out.println("Name: Rishi Mandloi "); 
        System.out.println("Enrollment: 0873CS241133 "); 
    } 
}