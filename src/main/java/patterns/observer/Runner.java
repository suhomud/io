package patterns.observer;

/**
 * @author Yevhen Sukhomud
 */
public class Runner {

    public static void main(String[] args) {
        BarberShop barberShop = new BarberShop();

        barberShop.addBarber(new JuniorBarber("Gabriel"));
        barberShop.addBarber(new MiddleBarber("Tomasz"));
        barberShop.addBarber(new SeniorBarber("Lukasz"));

        barberShop.notifyBarbers();

        barberShop.deleteBarber(new JuniorBarber("Gabriel"));
        barberShop.addBarber(new SeniorBarber("Marcin"));

        barberShop.notifyBarbers();

    }

}
