public class lab5 {
    public static void main(String[] args) {
        System.out.println("Main method called method doThis()");
        try {
            doThis();
        } catch (Exception e){
            System.out.println("Main method received exception" + e.getMessage());
        }

    }
    public static void doThis() throws Exception {
        System.out.println("Method dothis() called method dothat()");
        dothat();
    }
    public static void dothat() throws Exception {
        System.out.println(1/0);
    }
}
