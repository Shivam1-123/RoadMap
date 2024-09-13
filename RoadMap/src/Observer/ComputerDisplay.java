package Observer;

public class ComputerDisplay implements Observer {
	    private float temperature;

	    @Override
	    public void update(float temperature) {
	        this.temperature = temperature;
	        display();
	    }

	    public void display() {
	        System.out.println("Computer Display: Current Temperature is " + temperature + " degrees.");
	    }


}
