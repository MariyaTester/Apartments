import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество этажей:");
        int allFloors = scanner.nextInt();
        System.out.println("Введите количество подъездов:");
        int allEntrances = scanner.nextInt();
        System.out.println("Введите номер квартиры:");
        int apartmentNumber = scanner.nextInt();
        int allApartments = 4 * allFloors * allEntrances;
        int apartmentsEntrance = allApartments / allEntrances;
        int entranceNumber = (int) Math.ceil((double) apartmentNumber / apartmentsEntrance);
        int floorNumber = (int) Math.ceil(((double) apartmentNumber - apartmentsEntrance * (entranceNumber - 1)) / 4);

        if (apartmentNumber < 1) {
            System.out.println("Введено неверное значение (слишком малое).");
        } else if (apartmentNumber > allApartments) {
            System.out.println("Введено неверное значение (слишком большое).");
        } else if (apartmentNumber % 4 == 1) {
            System.out.printf("%s%d%s%d%s", "Расположение квартиры: в ", entranceNumber, " подъезде на ", floorNumber, " этаже, ближняя слева.");
        } else if (apartmentNumber % 4 == 2) {
            System.out.println("Расположение квартиры: в " + entranceNumber + " подъезде на " + floorNumber + " этаже, дальняя слева.");
        } else if (apartmentNumber % 4 == 3) {
            System.out.println("Расположение квартиры: в " + entranceNumber + " подъезде на " + floorNumber + " этаже, дальняя справа.");
        } else {
            System.out.println("Расположение квартиры: в " + entranceNumber + " подъезде на " + floorNumber + " этаже, ближняя справа.");
        }
    }
}
