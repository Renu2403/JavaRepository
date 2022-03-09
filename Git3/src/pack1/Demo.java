package pack1;
import pack1.MyInterfaceImpl;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInterfaceImpl impl = new MyInterfaceImpl();
		impl.disp();

	}

}


/*package pack1;

public class MyInterfaceImpl implements MyInterface{
	
	public void disp() {
		System.out.println("inside myInterfaceImpl class");
	}

}


package pack1;

public interface MyInterface {
	void disp();

}
*/