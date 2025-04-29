class Instrument {
    public void play() {
        System.out.println("Playing a generic instrument");
    }
}

class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Playing a guitar");
    }
}

public class Main {
    public static void main(String[] args) {
        Instrument i = new Instrument();
        Guitar g = new Guitar();

        i.play(); // Output: Playing a generic instrument
        g.play(); // Output: Playing a guitar

        Instrument polyInstrument = new Guitar(); // Polymorphism
        polyInstrument.play(); // Output: Playing a guitar
    }
}