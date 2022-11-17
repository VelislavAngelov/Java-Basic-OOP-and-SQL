package homeWork_2.task_2_CarFactory;

public enum Enum {
    NAVIGATION(500),
    AUTOMATIC(3000),
    AIR_CONDITION(850);


    public final int priceExtras;

    Enum(int priceExtras) {
        this.priceExtras = priceExtras;
    }

    public int getPriceExtras() {
        return priceExtras;
    }
}
