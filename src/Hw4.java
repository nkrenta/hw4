import java.util.Scanner;

public class Hw4 {
    public static int scanner(String text) {
        Scanner input = new Scanner(System.in);
        System.out.println(text);
        return input.nextInt();
    }

    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
        String a = "Введите возраст:";
        int age1 = scanner(a);
        //Init bool and check
        boolean isFullAge = age1 >= 18;
        if (isFullAge) {
            System.out.println("Если возраст человека равен " + age1 + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age1 + " , то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();

        //Task 2
        System.out.println("Task 2");
        a = "Введите температуру:";
        int temperature = scanner(a);
        //Bool + check
        boolean isItCold = temperature <= 5;
        if (isItCold) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку!");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки!");
        }
        System.out.println();

        //Task 3
        System.out.println("Task 3");
        //Init Scanner
        a = "Введите вашу скорость:";
        int speed = scanner(a);
        //Bool + check
        boolean isSpeedExceed = speed >= 60;
        if (isSpeedExceed) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф!");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно!");
        }
        System.out.println();

        //Task 4
        System.out.println("Task 4");
        a = "Введите возраст человека:";
        int age2 = scanner(a);
        //Bool + check
        boolean isKindergarden = age2 >= 2 && age2 <= 6;
        boolean isSchool = age2 >= 7 && age2 <= 17;
        boolean isUniversity = age2 >= 18 && age2 <= 24;
        boolean isWork = age2 > 24;
        if (isKindergarden) {
            System.out.println("Если человеку " + age2 + ", то ему нужно ходить в детский сад.");
        } else if (isSchool) {
            System.out.println("Если человеку " + age2 + ", то ему нужно ходить в школу.");
        } else if (isUniversity) {
            System.out.println("Если человеку " + age2 + ", то ему нужно ходить в университет.");
        } else if (isWork) {
            System.out.println("Если человеку " + age2 + ", то ему нужно ходить на работу.");
        } else {
            System.out.println("Ошибка!");
        }
        System.out.println();

        //Task 5
        System.out.println("Task 5");
        a = "Введите возраст:";
        int age3 = scanner(a);
        boolean notLet = age3 < 5;
        boolean withAdult = age3 >= 5 && age3 < 14;
        boolean freeUse = age3 >= 14;
        if (notLet) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе.");
        } else if (withAdult) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (freeUse) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        } else {
            System.out.println("Error!");
        }
        System.out.println();

        //Task 6
        System.out.println("Task 6");
        int fullCarriages = 102;
        int sittingPlaces = 60;
        int standingPlaces = fullCarriages - sittingPlaces;
        //Init Scanner busy places
        a = "Введите количество занятых сидячих мест:";
        String b = "Введите количество стоячих мест:";
        int busySittingPlaces = scanner(a);
        int busyStandingPlaces = scanner(b);
        //Count left places
        int leftSittingPlaces = sittingPlaces - busySittingPlaces;
        int leftStandingPlaces = standingPlaces - busyStandingPlaces;
        int leftPlacesCarriage = leftSittingPlaces + leftStandingPlaces;

        boolean leftPlaces = leftPlacesCarriage > 0;
        if (leftPlaces) {
            System.out.println("В вагоне остались следующие свободные места: " + leftSittingPlaces + " сидячих мест и " + leftStandingPlaces + " стоячих мест.");
        } else {
            System.out.println("Свободных мест в вагоне не осталось(");
        }
        System.out.println();

        //Task 7
        System.out.println("Task 7");
        a = "First number:";
        b = "Second number:";
        String c = "Third number:";
        //Init Scanners
        int one = scanner(a);
        int two = scanner(b);
        int three = scanner(c);
        //Init Bool
        boolean oneMoreTwo = one > two;
        boolean oneMoreThree = one > three;
        boolean twoMoreOne = two > one;
        boolean twoMoreThree = two > three;
        System.out.println();

        if (oneMoreTwo && oneMoreThree){
            System.out.println("One is the biggest!");
        } else if (twoMoreOne && twoMoreThree) {
            System.out.println("Two is the biggest!");
        } else {
            System.out.println("Three is the biggest!");
        }

    }
}
