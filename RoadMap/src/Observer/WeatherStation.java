package Observer;

import java.util.ArrayList;

public class WeatherStation implements Subject {
	    private ArrayList<Observer> observers;
	    private float temperature;

	    public WeatherStation() {
	        observers = new ArrayList<>();
	    }

	    @Override
	    public void registerObserver(Observer o) {
	        observers.add(o);
	    }

	    @Override
	    public void removeObserver(Observer o) {
	        observers.remove(o);
	    }

	    @Override
	    public void notifyObservers() {
	        for (Observer o : observers) {
	            o.update(temperature);
	        }
	    }

	    // Method to set a new temperature and notify observers
	    public void setTemperature(float temperature) {
	        this.temperature = temperature;
	        notifyObservers();
	    }
}
