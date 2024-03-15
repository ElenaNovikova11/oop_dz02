// Абстрактный класс Vehicle://КАК ANIMAL В ПРИМЕРЕ
// Содержит общие свойства и методы для всех видов // транспортных средств.
// Свойства: int id (уникальный идентификатор), // String brand (марка), String model (модель), // int year (год выпуска).
// Методы:
// void startEngine() - запуск двигателя (реализация в подклассах).
// void stopEngine() - остановка двигателя (реализация в подклассах).
// void accelerate(int speed) - увеличение скорости на указанное значение (реализация в подклассах).
// void brake() - прекращение движения (реализация в подклассах).
// abstract void displayInfo() - вывод информации о транспортном средстве (реализация в подклассах).

public abstract class Vehicle {
    private int id;// id
    private String brand;// марка
    private String model;// модель
    private int year;// год выпуска
    private int fuelCapacity;// емкость топливного бака
    private int currentFuelLevel;// текущий уровень топлива
    private int maxSpeed;// максимальная скорость на воде
    private boolean isSailing; // флаг состояния движения по воде
    private int maxAltitude; // максимальная высота полета
    private boolean isFlying; // флаг состояния полета

    public Vehicle(int id, String brand, String model, int year, int fuelCapacity,
            int currentFuelLevel, int maxSpeed, boolean isSailing, int maxAltitude, boolean isFlying) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.maxSpeed = maxSpeed;
        this.isSailing = isSailing;
        this.maxAltitude = maxAltitude;
        this.isFlying = isFlying;
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public boolean getIsFlying() {
        return isFlying;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean getIsSailing() {
        return isSailing;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getMobel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void startEngine() {
        System.out.println();
    }

    public void stopEngine() {
        System.out.println();
    }

    public void accelerate(int speed) {

        System.out.println();
    }

    public void brake() {
        System.out.println();
    }

    public abstract void displayInfo();
}

