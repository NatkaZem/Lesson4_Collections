package Homework;

import java.util.Scanner;

public class Main {
    private static Storage storage = new Storage();

    public static void main(String[] args) {

        while (true) {
            System.out.println("Выберите необходимое действие, указав цифру от 1 до 4:");
            System.out.println("1) Получить список продуктов");
            System.out.println("2) Добавить продукт");
            System.out.println("3) Удалить продукт");
            System.out.println("4) Получить количество позиций продуктов на складе");
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            int menuValue = scanner.nextInt();
            switch (menuValue) {
                case 1:
                    storage.getProducts();
                    break;
                case 2:
                    storage.addProduct();
                    break;
                case 3:
                    storage.deleteProduct();
                    break;
                case 4:
                    storage.getSize();
                    break;
            }
        }
    }
}
