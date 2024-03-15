// Класс Aircraft (самолеты):
// Наследует от Vehicle.
// Реализует методы абстрактного класса displayInfo.
// Реализует методы интерфейса Flyable.
// Добавляет свойства: int maxAltitude (максимальная высота полета), boolean isFlying (флаг состояния полета).
// Реализует методы:
// void startEngine() - запуск двигателя самолета.
// void stopEngine() - остановка двигателя самолета.
// void takeOff() - взлет самолета.
// void land() - посадка самолета.

public class Aircraft extends Vehicle implements Flyable {
    
    private static int fuelCapacity;// емкость топливного бака
    private static int currentFuelLevel;// текущий уровень топлива
    private static int maxSpeed;// максимальная скорость на воде
    private static boolean isSailing; // флаг состояния движения по воде
    
    public Aircraft(int id, String brand, String model, int year, int maxAltitude, boolean isFlying) {
        super(id, brand, model, year, fuelCapacity, currentFuelLevel, maxSpeed, isSailing, maxAltitude, isFlying);
    }

    @Override
    public void startEngine() {
        System.out.println("Запускаем двигатель самолета");
    }

    @Override
    public void stopEngine() {
        System.out.println("Останавливаем двигатель самолета");
    }

    @Override
    public void displayInfo() {
        System.out.println("Самолет: " + "id:"
        + getId() + " марка:" + getBrand()
        + " модель:" + getMobel() + " год выпуска:"
        + getYear() + " максимальная высота полета:" + 
        getMaxAltitude() + " флаг состояния полета:"
        + getIsFlying());
    }

    @Override
    public void takeOff() {
        System.out.println("Взлетаем");
    }

    @Override
    public void land() {
        System.out.println("Приземляемся");
    }

}