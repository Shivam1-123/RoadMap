package Facade;

public class HomeTheaterFacade {
	
	 private DVDPlayer dvdPlayer;
	    private Projector projector;
	    private SoundSystem soundSystem;

	    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
	        this.dvdPlayer = dvdPlayer;
	        this.projector = projector;
	        this.soundSystem = soundSystem;
	    }
	
	
	 // Simplifies the process of watching a movie
    public void watchMovie(String movie) {
        System.out.println("Preparing to watch a movie...");
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
        System.out.println("Enjoy the movie!");
    }

    // Simplifies the process of shutting down the home theater
    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
    }

}
