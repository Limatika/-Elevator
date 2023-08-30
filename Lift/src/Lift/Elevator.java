package Lift;

public class Elevator {

        private int currentFloor=1;
        int minFloor ;
        int maxFloor ;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    //-Метод getCurrentFloor, возвращающий текущий этаж, на котором находится лифт.
        private void getCurrentFloor() {
            System.out.println(currentFloor+" этаж");
                    }

        //-Метод moveDown, перемещающий лифт на один этаж вниз (уменьшающий значение переменной currentFloor на единицу).
        private void moveDown() {
             currentFloor--;
             if (currentFloor == 0){
                 currentFloor--;
             }
        }
        //-Метод moveUp, перемещающий лифт на один этаж вверх.
        private void moveUp(){
             currentFloor++;
             if (currentFloor==0){
                 currentFloor++;
             }
        }
        //-Метод move(int floor), перемещающий лифт на заданный в параметре этаж, если он задан верно.
        //Если параметр у метода задан неверно, ничего не делать и выводить в консоль сообщение об ошибке.
        public void move(int floor){
            if (floor>=minFloor && floor<=maxFloor && floor!=0) {
                System.out.println("Поехали");
                while (floor != currentFloor) {
                    getCurrentFloor();
                    if (floor > currentFloor) {
                        System.out.println("Идет вверх ");
                        moveUp();
                    } else {
                        System.out.println("Идет вниз ");
                        moveDown();
                    }
                }
                    System.out.println(" Вы приехали " + currentFloor + " этаж");
            }
            else {
                System.out.println("Этаж задан неверно введите значение от " + minFloor + " до " + maxFloor);
            }

        }

    }





