package com.DZ1and2;
import java.util.Scanner;
public class Menu {

    public void MainMenu() {
        System.out.println("Введите номер задачи:");
        System.out.println("1 - Решение квадратного уравнения");
        System.out.println("2 - Рассчет параметров объемных фигур");

        Scanner In = new Scanner(System.in);
        int num = 0;
        while (num != 1 && num != 2) {
            num = In.nextInt();
            if (num == 1) {
                System.out.println("Введите коэффициент a:");
                double a = In.nextDouble();
                System.out.println("Введите коэффициент b:");
                double b = In.nextDouble();
                System.out.println("Введите коэффициент c:");
                double c = In.nextDouble();

                Equations Eq = new Equations();
                Eq.QuadEquation(a, b, c);
            } else if (num == 2) {
                figureMenu();
            } else {
                System.out.println("Введено некорректное значение!");
            }
        }
    }

    public void figureMenu() {
        System.out.println("Выберите тип фигуры:");
        System.out.println("1 - Шар");
        System.out.println("2 - Куб");
        System.out.println("3 - Параллелепипед");
        Scanner in = new Scanner(System.in);
        int num = 0;
        while (num != 1 && num != 2 && num != 3) {
            num = in.nextInt();
            if (num == 1) {
//                System.out.println("Дайте имя фигуре:");
//                String name = in.nextLine();
                String name = "Sphere of chaos";
                System.out.println("Радиус шара = ");
                double radius = in.nextDouble();
                Sphere sph = new Sphere(name, radius);
                System.out.println("Площадь фигуры: " + sph.getSurfaceArea());
                System.out.println("Объем фигуры: " + sph.getVolume());
            } else if (num == 2) {
                System.out.println("Воспользуйтесь пунктом 3!");
            } else if (num == 3) {
                System.out.println("Введите ширину фигуры:");
                double width = in.nextDouble();
                System.out.println("Введите глубину фигуры:");
                double length = in.nextDouble();
                System.out.println("Введите высоту фигуры:");
                double heigth = in.nextDouble();
                Cuboid cbd = new Cuboid("Cuboid", width, length, heigth);
                System.out.println("Площадь фигуры: " + cbd.getSurfaceArea());
                System.out.println("Объем фигуры: " + cbd.getVolume());
            } else {
                System.out.println("Введите корректные значения");
                num = in.nextInt();
            }
        }
    }
}
