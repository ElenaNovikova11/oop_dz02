// Интерфейс Swimmable (плавающие транспортные средства):
// Методы: void startSwimming(), void stopSwimming().

public interface Swimmable {

    default void startSwimming() {
        System.out.println();
    }

    default void stopSwimming() {
        System.out.println();
    }
}
