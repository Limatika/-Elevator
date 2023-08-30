package Lift;

import java.util.Scanner;

public class Runlift {

    //Создайте класс Elevator:
//
//-Переменные currentFloor (текущий этаж), minFloor и maxFloor (минимальный и максимальный этажи). Тип переменных — int.
//-Конструктор с двумя параметрами minFloor и maxFloor, сохраняющий эти параметры в соответствующих переменных класса.
//-Значение переменной currentFloor изначально должно быть равно 1.
//-Метод getCurrentFloor, возвращающий текущий этаж, на котором находится лифт.
//-Метод moveDown, перемещающий лифт на один этаж вниз (уменьшающий значение переменной currentFloor на единицу).
//-Метод moveUp, перемещающий лифт на один этаж вверх.
//-Метод move(int floor), перемещающий лифт на заданный в параметре этаж, если он задан верно.
//Если параметр у метода задан неверно, ничего не делать и выводить в консоль сообщение об ошибке.
//Этот метод может перемещать лифт только последовательно, по одному этажу, с помощью циклов и методов moveUp и moveDown,
//и он должен выводить в консоль текущий этаж после каждого перемещения между этажами.
         public static void main (String[] args) throws InterruptedException {

            Scanner scanner = new Scanner(System.in);
            Elevator lift1 = new Elevator(-3,10);
            Elevator lift2 = new Elevator(1,10);
            Elevator lift3 = new Elevator(-2,12);
            System.out.println(" Добро Пожаловать!");
             System.out.println("Выберите номер Лифта 1,2,3");
             int numer = scanner.nextInt();
             if (numer>0 && numer<4) {
                 System.out.println("ВВедите количество поездок");
                 int kolvo = scanner.nextInt();
                 for (int i = 0; i < kolvo; i++) {
                     if (numer == 1) {
                         System.out.println("Лифт1: Введите этаж: " + lift1.minFloor + " " + lift1.maxFloor);
                         int floor = scanner.nextInt();
                         lift1.move(floor);
                     }
                     if (numer == 2) {
                         System.out.println("Лифт2: Введите этаж: " + lift2.minFloor + " " + lift2.maxFloor);
                         int floor = scanner.nextInt();
                         lift2.move(floor);
                     }
                     if (numer == 3) {
                         System.out.println("Лифт3: Введите этаж: " + lift3.minFloor + " " + lift3.maxFloor);
                         int floor = scanner.nextInt();
                         lift3.move(floor);
                     }
                 }
             }
             else {
                 System.out.println("Вы неверно ввели номер лифта. ");

             }
    }
}

