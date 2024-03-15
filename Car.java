// Класс Car (автомобили):
// Наследует от Vehicle.
// Реализует методы абстрактного класса displayInfo.
// Добавляет свойства: int fuelCapacity (емкость топливного бака), int currentFuelLevel (текущий уровень топлива).
// Реализует методы:
// void startEngine() - запуск двигателя автомобиля.
// void stopEngine() - остановка двигателя автомобиля.
// void accelerate(int speed) - увеличение скорости автомобиля на указанное значение.
// void brake() - прекращение движения автомобиля.
// void refuel(int liters) - заправка автомобиля (увеличение уровня топлива).

public class Car extends Vehicle{
    private static int maxSpeed;// максимальная скорость на воде
    private static boolean isSailing; // флаг состояния движения по воде
    private static int maxAltitude; // максимальная высота полета
    private static boolean isFlying; // флаг состояния полета

    public Car(int id, String brand, String model, int year, int fuelCapacity, int currentFuelLevel){
        super(id, brand, model, year, fuelCapacity, currentFuelLevel, maxSpeed, isSailing, maxAltitude, isFlying);
         }
  
     @Override
    public void startEngine(){
        System.out.println("Запускаем двигатель автомобиля");
    }
    @Override
public void stopEngine() {
        System.out.println("Останавливаем двигатель автомобиля");
    }
    @Override
    public void accelerate(int speed) {
        speed = 12;
        System.out.println("Увеличиваем скорость автомобиля на "+ speed+"км/ч");
    }
    @Override
    public void brake() {
        System.out.println("Прекращаем движение автомобиля");
    }

    @Override
    public void displayInfo() {
        System.out.println("Автомобиль: " + "id:"
        + getId() + " марка:" + getBrand()
        + " модель:" + getMobel() + " год выпуска:"
        + getYear() + " емкость топливного бака:" + 
        getFuelCapacity() + " текущий уровень топлива:"
        + getCurrentFuelLevel());
        }

        public void refuel(int liters){
            liters = 50;
            System.out.println("Заправка автомобиля на " + liters + "л.");
        }
    }

