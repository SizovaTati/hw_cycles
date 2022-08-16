public class Main {
    public static void main(String[] args) {
        //Task 1

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        int a = 10;
        while (a > 0) {
            System.out.print(a + " ");
            a--;
        }
        //Task 2
        System.out.println();

        int friday = 3;
        for (int i = friday; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
        //Task 3
        System.out.println();

        int year = 2022;
//        int beforeYears = year - 200;
//        int afterYears = year + 100;
        for (int i = 0; i < year + 100; i = i + 79) {
            if (i > year - 200) {
                System.out.println(i);
            }


        }


    }
}