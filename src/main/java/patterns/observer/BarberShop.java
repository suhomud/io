package patterns.observer;

import java.util.HashSet;
import java.util.Observable;
import java.util.Set;

/**
 * @author Yevhen Sukhomud
 */
public class BarberShop {

    private Set<Barber> barbers = new HashSet<>();

    public synchronized void addBarber(Barber barber) {
        barbers.add(barber);
    }

    public synchronized void deleteBarber(Barber barber) {
        barbers.remove(barber);
    }

    public void notifyBarbers() {
        barbers.forEach(barber -> {
            new Thread(barber).start();
        });
    }

}
