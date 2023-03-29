public class lab6 {
    public static void main(String[] args) {
        System.out.println("Main method call method doThis()");
        try{
            System.out.println(1/0);
            } catch(ArithmeticException e) {
            StackTraceElement[] st = e.getStackTrace();
            for (int i = 0; i < st.length; i++) {
                System.out.println(st[0].getClassName());
                System.out.println(st[0].getMethodName());
                System.out.println(st[0].getFileName());
                System.out.println(st[0].getLineNumber());
            }
        }
        }
        public static void doThis() throws Exception {
        System.out.println("Method doThis() call method doThat()");
        doThat();}
    public static void doThat() throws Exception {
        throw new Exception();
        }
}
