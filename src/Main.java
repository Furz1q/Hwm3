public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int age = 17;
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний.");
        }
        else{
            System.out.println("Если возраст человека равен " +
                    age + " то не достиг совершеннолетия, нужно немного подождать.");

        }
        System.out.println("Задание 2");

        int temperature = -6;
        if (temperature < 5){
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }else{
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println("Задние 3");

        int speed = 57;
        if (speed > 60){
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }else{
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        System.out.println("Задание 4");

        int agePeople = 77;
        if (agePeople >= 2 && agePeople <= 6){
            System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить в детский сад");
        }else if (agePeople >= 7 && agePeople <= 17){
            System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить в в школу");
        }else if (agePeople >= 18 && agePeople <= 24){
            System.out.println("Если возраст человека равен " + agePeople + " то его место в университете");
        }else {
            System.out.println("Если возраст человека равен " + agePeople + " то ему пора ходить на работу");
        }
        System.out.println("Задание 5");

        int ageChild = 14;
        if (ageChild < 5){
            System.out.println("Если возраст ребенка равен " + ageChild + " то ему нельзя кататься на аттракционе");
        }else if (ageChild >= 5 && ageChild < 14){
            System.out.println("Если возраст ребенка равен " +
                    ageChild + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }else {
            System.out.println("Если возраст ребенка равен " +
                    ageChild + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("Задание 6");

        int places = 102;
        int sitPlaces = 60;
        int people = 80;
        if (people < sitPlaces){
            System.out.println("Есть сидячие места");
        }else if (people >= sitPlaces && people < places){
            System.out.println("Есть стоячие места");
        }else {
            System.out.println("Вагон уже полностью забит");
        }
        System.out.println("Задание 7");

        int one = 25;
        int two = 104;
        int three = -74;
        if (one >= two && one >= three){
            System.out.println("Максимольное число в переменной one, равно " + one);
        }else if (two >= three){
            System.out.println("Максимольное число в переменной two, равно " + two);
        }else{
            System.out.println("Максимольное число в переменной three, равно " + three);
        }
    }
}