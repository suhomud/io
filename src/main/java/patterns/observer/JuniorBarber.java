package patterns.observer;

/**
 * @author Yevhen Sukhomud
 */
public class JuniorBarber extends Barber {

    private static final int PROF_LEVEL_COEFFICIENT = 10000;

    public JuniorBarber(String name) {
        super(name);
    }

    public void run() {
        try {
            System.out.println("Barber " + name + " has started work");
            Thread.sleep(PROF_LEVEL_COEFFICIENT);
            System.out.println("Barber " + name + " has finished work");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
