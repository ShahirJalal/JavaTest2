package Test49;

public class Main {
    public static void main(String[] args) {
        
        // polymorphism = greek word for poly-"many", morph-"form"
        //                The ability of an aobject to indentify as more than one type

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car,bicycle,boat};

        for(Vehicle x : racers) {
            x.go();
        }

    }
}
