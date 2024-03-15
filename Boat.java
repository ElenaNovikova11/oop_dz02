// Класс Boat (лодки):
// Наследует от Vehicle.
// Реализует методы абстрактного класса displayInfo.
// Реализует методы интерфейса Swimmable.
// Добавляет свойства: int maxSpeed (максимальная скорость на воде), boolean isSailing (флаг состояния движения по воде).
// Реализует методы:
// void startEngine() - запуск двигателя лодки.
// void stopEngine() - остановка двигателя лодки.
// void startSwimming() - начало движения лодки по воде.
// void stopSwimming() - прекращение движения лодки по воде.
//extends
public class Boat extends Vehicle implements Swimmable {

    private static int fuelCapacity;// емкость топливного бака
    private static int currentFuelLevel;// текущий уровень топлива
    private static int maxAltitude; // максимальная высота полета
    private static boolean isFlying; // флаг состояния полета

    public Boat(int id, String brand, String model, int year, int maxSpeed, boolean isSailing) {
        super(id, brand, model, year, fuelCapacity, currentFuelLevel, maxSpeed, isSailing, maxAltitude, isFlying);
    }

    @Override
    public void startEngine() {
        System.out.println("Запускаем двигатель лодки");
    }

    @Override
    public void stopEngine() {
        System.out.println("Останавливаем двигатель лодки");
    }

    @Override
    public void displayInfo() {
        System.out.println("Лодка: " + "id:"
        + getId() + " марка:" + getBrand()
        + " модель:" + getMobel() + " год выпуска:"
        + getYear() + " максимальная скорость на воде:" + 
        getMaxSpeed() + " флаг состояния движения по воде:"
        + getIsSailing());
    }

    @Override
    public void startSwimming() {
        System.out.println("Начинаем движения лодки по воде");
    }

    @Override
    public void stopSwimming() {
        System.out.println("Прекращаем движения лодки по воде");
    }

}
