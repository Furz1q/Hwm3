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

        int temperature = -5;
        if (temperature < 5){
            System.out.println("На улицее холодно нужно надеть шапку ");
        }else{
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println("Задние 3");

        int speed = 57;
        if (speed > 60){
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }else{
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        System.out.println("Задание 4");

        int agePeople = 23;
        if ( agePeople >= 2 && agePeople <= 6){
            System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить в детский сад");
        }
        if ( agePeople >= 7 && agePeople <= 17){
            System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить в в школу");
        }
        if ( agePeople >= 18 && agePeople <= 24){
            System.out.println("Если возраст человека равен " + agePeople + " то его место в университете");
        }
        if ( agePeople > 24){
            System.out.println("Если возраст человека равен " + agePeople + " то ему пора ходить на работу");
        }
        System.out.println("Задание 5");

        int ageChild = 14;
        if( ageChild <= 5){
            System.out.println("Если возраст ребенка равен " + ageChild + " то ему нельзя кататься на аттракционе");
        }
        else if( ageChild > 5 && ageChild < 14){
            System.out.println("Если возраст ребенка равен " +
                    ageChild + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else{
            System.out.println("Если возраст ребенка равен " +
                    ageChild + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("Задание 6");

        int wagonСapacity = 77;
        if ( wagonСapacity <= 60){
            System.out.println("Есть сидячие места");
        } else if ( wagonСapacity > 60 && wagonСapacity <= 102){
            System.out.println("Есть стоячие места");
        } else {
            System.out.println("Вагон уже полностью забит");
        }
        System.out.println("Задание 7");

        int one = 25;
        int two = 104;
        int three = -74;
        if ( one > two && one > three){
            System.out.println(one);
        }else if ( two > three){
            System.out.println(two);
        }else{
            System.out.println(three);
        }
    }
}