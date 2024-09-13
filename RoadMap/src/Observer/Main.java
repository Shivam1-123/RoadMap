package Observer;

public class Main {
	    public static void main(String[] args) {
	        WeatherStation weatherStation = new WeatherStation();

	        PhoneDisplay phoneDisplay = new PhoneDisplay();
	        ComputerDisplay computerDisplay = new ComputerDisplay();

	        weatherStation.registerObserver(phoneDisplay);
	        weatherStation.registerObserver(computerDisplay);

	        // Simulating temperature changes
	        weatherStation.setTemperature(30);
	        weatherStation.setTemperature(25);
	    }
	}

