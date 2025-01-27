package StructuralDesignPattern.Facade;

public class Main {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();

        // Use the Facade to simplify interaction
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, dvdPlayer, projector);

        // Watch a movie using the Facade
        homeTheater.watchMovie();

        // End the movie using the Facade
        homeTheater.endMovie();
    }
}
