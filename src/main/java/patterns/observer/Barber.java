package patterns.observer;

/**
 * @author Yevhen Sukhomud
 */
public abstract class Barber implements Runnable {

    public String name;

    public Barber(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Barber barber = (Barber) o;

        return name != null ? name.equals(barber.name) : barber.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

}
