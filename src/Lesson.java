public class Lesson {
    public static void main(String[] args) {
        //Tab 2
        int age = 17;
        if (age>=18) {
            System.out.println("Ты можешь водить!");
        } else {
            System.out.println("Ты не можешь водить!");
        }
        int score = 70;
        if (score<=60){
            System.out.println("Ты не прошел тест");
        } else {
            System.out.println("Ты прошел тест");
        }
        //Tab 3
        if (age >=18 && age < 21){
            System.out.println("Ты достаточно взрослый для того, чтобы водить, но не достаточно, чтобы пить алкоголь!");
        }

        if (age < 7 || age > 18){
            System.out.println("Я думаю, ты не ходишь в школу!");
        }

        boolean skyIsClear = true;
        if (skyIsClear){
            System.out.println("Небо чистое");
        }

        boolean canNotGoToSchool = age < 7 || age > 18;
        if (canNotGoToSchool){
            System.out.println("Я думаю, ты не ходишь в школу!");
        }

    }
}