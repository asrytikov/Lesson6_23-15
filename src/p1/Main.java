package p1;

public class Main {

    public static void main(String[] args2) {
        int a = 10;
        int b = 15;
        sum(a, b);
        sum(30, 15);
        welcome("Alex", 22);
        welcome("Ivan", 33);
        sumInt("test");

        sumInt("Test2", 2,34,45);

        int x = sumThree(2,3,4);
        int y = sumThree(a,b,x);
        System.out.println(y);

        System.out.println(dayTime(12));
        dTime(12);
    }

    static void sum(int x, int y){
        int z  = x + y;
        System.out.println(z);
    }

    static void welcome(String name, int age){
        System.out.println("welcome, " + name + ". Your are " + age);
    }

    static void sumInt(String message, int ...nums){
        System.out.println(message);
        int res = 0;
        for(int x: nums){
            res += x;
        }
        System.out.println(res);
    }

    static int sumThree(int a, int b, int c){
        return a+b+c;
    }

    static String dayTime(int hour){
        if ((hour>7) && (hour<12))
            return "Morning";
        else if (hour>12)
            return "Day";
        else
            return "Evening";
    }

    static void dTime(int hour){
        if ((hour>7) && (hour<12))
            return;
        else if (hour>12)
            System.out.println("Day");
        else
            System.out.println("Evening");
    }


}
