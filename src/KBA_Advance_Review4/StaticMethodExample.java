package KBA_Advance_Review4;

public class StaticMethodExample {
    public static void main(String[] args) {
        int result = MathHelper.add(5, 3); // (2) call without creating object
        System.out.println("Sum: " + result); // (3)
    }
}
