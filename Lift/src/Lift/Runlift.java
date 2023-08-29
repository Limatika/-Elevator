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
            System.out.println(" Добро Пожаловать!  ВВедите этаж ");
            int floor = scanner.nextInt();
            Elevator lift = new Elevator();
            lift.getCurrentFloor();
            lift.move(floor);

        }
    }
