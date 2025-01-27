package StructuralDesignPattern.Facade;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Projector projector;

    public HomeTheaterFacade(Amplifier amplifier, DVDPlayer dvdPlayer, Projector projector) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
    }
    public void hello(){

    }

    public void watchMovie() {
        System.out.println("Getting ready to watch a movie...");
        amplifier.on();
        dvdPlayer.on();
        projector.on();
    }

    public void endMovie() {
        System.out.println("Movie is over. Shutting down...");
        amplifier.off();
        dvdPlayer.off();
        projector.off();
    }
}
