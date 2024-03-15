// Главный класс Main для проверки:
// Создайте объекты различных транспортных средств (автомобиль, самолет, лодка).
// Продемонстрируйте их работу, вызывая соответствующие методы (запуск двигателя, движение, взлет, посадка и т.д.).
// Выведите информацию о каждом транспортном средстве с использованием метода displayInfo.

public class Main {

    public static void main(String[] args) {
        Car car = new Car(1, "HYUNDAI", "i30", 2024, 111, 322);
        Boat boat = new Boat(2, "Ривьера", "3200", 2003, 200, true);
        Aircraft aircraft = new Aircraft(3, "ИЛ", "62", 1999, 500, false);
        
            car.displayInfo();
            car.startEngine();
            car.refuel(0);
            car.accelerate(0);
            car.brake();
            car.stopEngine();
        System.out.println();
            boat.displayInfo();
            boat.startEngine();
            boat.startSwimming();
            boat.stopSwimming();        
            boat.stopEngine();
        System.out.println();
            aircraft.displayInfo();
            aircraft.startEngine();
            aircraft.takeOff();
            aircraft.land();        
            aircraft.stopEngine();
}
}
