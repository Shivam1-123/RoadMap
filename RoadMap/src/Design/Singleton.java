package Design;

public class Singleton {
	private static Singleton instance = null;
	
	private Singleton(){
		
	}
	
	public static Singleton createInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void showMessage() {
		System.out.println("HI!! This is a Singleton Class");
	}

}

class Main {
	public static void main(String[] args) {
		Singleton singleInstance = Singleton.createInstance();
		
		singleInstance.showMessage();
		
	}
}
