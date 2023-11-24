import java.math.BigDecimal;

public enum Car {
    FERRARI("1", BigDecimal.valueOf(800)),
    HONDA("2", BigDecimal.valueOf(500)),
    MERS("3", BigDecimal.valueOf(800)),
    TOYOTA("4", BigDecimal.valueOf(400)),
    KIA("5", BigDecimal.valueOf(350)),
    AUDI("6", BigDecimal.valueOf(900)),
    BMW("7", BigDecimal.valueOf(950));

    public BigDecimal price;
    public String id;

    Car(String id, BigDecimal price) {
        this.id = id;
        this.price = price;
    }

}
