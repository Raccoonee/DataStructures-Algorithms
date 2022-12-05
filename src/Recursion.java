import java.sql.SQLOutput;

public class Recursion {
    // Recursion - When a thing is defined in terms of itself.
    // Apply the result of a procedure, to a procedure.
    // A recursive method calls itself. Can be substituted for iteration.
    // Divide a problem into sub-problems of the same type as the original.
    // Commonly used with advanced sorting algorithms and navigating trees

    // Advantages: - easier to read/write - easier to debug
    // Disadvantages: - sometimes slower - uses more memory

    public static void main(String[] args) {

//        walk(1);

        int fact = factorial(7);
        System.out.println(fact);
        
        int power = power(2, 8);
        System.out.println(power);


    }

    private static int power(int base, int exponent) {
        if(exponent < 1) return 1;
        return base * power(base, exponent - 1);
    }

    private static int factorial(int num) {
        if(num < 1) return 1;
        return num * factorial(num - 1);
    }
    
    // recursively
//    private static void walk(int steps) {
//        if(steps < 1) return;
//        System.out.println("You took a step");
//        walk(steps - 1);
//    }
    // iterative
//    private static void walk(int steps) {
//        for(int i = 0; i < steps; i++)
//            System.out.println("You took a step: " + (i + 1));
//    }
}
