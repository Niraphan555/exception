public class lab4 {
public static void main(String[]args){
        try {
            System.out.println("Statement1");
            System.out.println(1/0);
            System.out.println("Statement3");
        }catch (ArrayIndexOutOfBoundsException e) {

        }catch (ArithmeticException e) {
        throw new StringIndexOutOfBoundsException();
        }finally {
            System.out.println("Statement4");;}
    System.out.println("Statement5");;

        }
}