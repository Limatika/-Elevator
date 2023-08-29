package Lift;

public class Elevator {

        int currentFloor=10;
        private int minFloor = 1;
        private int maxFloor = 10;

        //-Метод getCurrentFloor, возвращающий текущий этаж, на котором находится лифт.
        public void getCurrentFloor() {
            System.out.println("Вы находитесь на "+currentFloor+" этаже");
                    }

        //-Метод moveDown, перемещающий лифт на один этаж вниз (уменьшающий значение переменной currentFloor на единицу).
        public int moveDown() {
            return currentFloor--;
        }
        //-Метод moveUp, перемещающий лифт на один этаж вверх.
        public int moveUp(){
            return currentFloor++;
        }
        //-Метод move(int floor), перемещающий лифт на заданный в параметре этаж, если он задан верно.
        //Если параметр у метода задан неверно, ничего не делать и выводить в консоль сообщение об ошибке.
        public void move(int floor){
            if (floor>=minFloor && floor<=maxFloor){
                System.out.println("Поехали");
                while (floor!=currentFloor){
                    System.out.println(currentFloor+ " Этаж");
                    if (floor>currentFloor) {
                        System.out.println("Идет вверх ");
                        moveUp();}
                    else {
                        System.out.println("Идет вниз ");
                        moveDown();
                    }
                }
                System.out.println(" Вы приехали " + currentFloor+ " этаж");
            }
            else {
                System.out.println("Этаж задан неверно ввеите значение от 1-10");
            }

        }

    }





