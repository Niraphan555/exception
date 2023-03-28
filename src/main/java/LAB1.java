public class LAB1 {
    public static void main(String[] args) {
//        int[] list = new int[10];
//        try {
//            System.out.println("list[10] is" list[10] );
//        }
//        catch (ArithmeticException ex) {
//            System.out.println("ArithmeticException");
//        }
//        catch (RuntimeException ex) {
//            System.out.println("RuntimeException");
//        }
//        catch (Exception ex) {
//            System.out.println("exception");
//        }
        System.out.println(quotient(5,0));
}public static int quotient(int number1, int number2) {
    if (number2 == 0)
        throw new ArithmeticException("Divisor cannot be zero");
    return number1 / number2;

}
}
