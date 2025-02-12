# Home Theater System: Facade Design Pattern

This project demonstrates the **Facade Design Pattern** using a home theater system. It simplifies interactions with complex subsystems like the amplifier, DVD player, and projector.

---

## Problem

A home theater system has multiple components:
1. **Amplifier**
2. **DVD Player**
3. **Projector**

To watch a movie, you need to:
1. Turn on the amplifier.
2. Turn on the DVD player.
3. Turn on the projector.

Managing these components manually is tedious and error-prone.

---

## Traditional Approach

In the traditional approach, the client interacts directly with all components, leading to **tight coupling** and **complex code**.

### Code
```java
class Amplifier { void on() { System.out.println("Amplifier is on"); } }
class DvdPlayer { void on() { System.out.println("DVD Player is on"); } }
class Projector { void on() { System.out.println("Projector is on"); } }

public class Main {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();

        // Client manages components manually
        amplifier.on();
        dvdPlayer.on();
        projector.on();
    }
}