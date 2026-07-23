 class parrent
 {
    void display()
    {
		System.out.println("this is a parrent class");
    }
}
class child extends parrent
{
    void show()
    {
        System.out.println("this is a child class");
    }
}
public class Main
{
    	public static void main(String[] args) 
    	{
    	    child obj=new child();
    	    obj.display();
    	    obj.show();
    	}
    
}
