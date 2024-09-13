package Facade;

public class Main {
	 public static void main(String[] args) {
	        DVDPlayer dvdPlayer = new DVDPlayer();
	        Projector projector = new Projector();
	        SoundSystem soundSystem = new SoundSystem();

	        // Creating a facade to simplify operations
	        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem);

	        // Watching a movie using the facade
	        homeTheater.watchMovie("Inception");

	        // Ending the movie using the facade
	        homeTheater.endMovie();
	    }

}
