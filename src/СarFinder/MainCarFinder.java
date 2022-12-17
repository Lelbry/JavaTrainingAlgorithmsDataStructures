package СarFinder;
import java.util.Scanner;
import java.util.Arrays;

public class MainCarFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите максимальную сумму, которую вы можете потратить: Rub ");
        int maxPrice = scanner.nextInt();

        // Сортируем автомобили по максимальной скорости
        Car[] cars = Car.values();
        Arrays.sort(cars, (car1, car2) -> car2.getMaxSpeed() - car1.getMaxSpeed());

        System.out.println("Доступные для покупки автомобили:");
        for (Car car : cars) {
            if (car.getCost() <= maxPrice) {
                System.out.println(car);
            }
        }
    }
}
