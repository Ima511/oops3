package oops3;

public class Main {
    public static void main(String[] args) {

      //  Engine engine = new Engine("hyper", 12220);

        Car mercedies = new Car("X11", 4, "MateBlack", new Engine("Renault", 8000));

        System.out.println(mercedies.getName() + " " + mercedies.getDoors()+ " " + mercedies.getColor()+ " " + mercedies.getEngine().getModel() + " " + mercedies.getEngine().getRpm());

/**
 *
 */

   final Engine engine = new Engine("Renault", 9000);
        engine.setModel("hawa ka jhoka");

    }

}
