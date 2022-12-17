package СarFinder;

public enum Car {
    OYOTA_CAMRY("Toyota Camry", 180, "Toyota", 250000, "белый"),
    HONDA_CIVIC("Honda Civic", 200, "Honda", 220000, "синий"),
    FORD_MUSTANG("Ford Mustang", 240, "Ford", 300000, "красный"),
    BMW_3_SERIES("BMW 3 Series", 270, "BMW", 350000, "черный"),
    AUDI_A4("Audi A4", 250, "Audi", 320000, "бежевый");

    // Название модели
    private String modelName;
    // Максимальная скорость
    private int maxSpeed;
    // Марка
    private String make;
    // Стоимость
    private int cost;
    // Цвет
    private String color;

    Car() {
    }

    private Car(String modelName, int maxSpeed, String make, int cost, String color) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
        this.make = make;
        this.cost = cost;
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Получить марку
    public String getMake() {
        return make;
    }

    public int getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    // Переопределяем метод toString, чтобы выводить все параметры автомобиля
    @Override
    public String toString() {
        return modelName + " - " + maxSpeed + "mph, " + make + ", $" + cost + ", " + color;
    }
}
