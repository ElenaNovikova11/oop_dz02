//Интерфейс Flyable (летающие транспортные средства):
//Методы: void takeOff(), void land().
public interface Flyable {
    default void takeOff() {
        System.out.println();
    }

    default void land() {
        System.out.println();
    }

}
