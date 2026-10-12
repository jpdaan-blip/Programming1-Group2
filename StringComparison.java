public class StringComparison {
    public static void main(String[] args) {
        String password1 = "Java123";
        String password2 = "Java123";
        String password3 = new String("Java123");

        System.out.println(password1 == password2);
        System.out.println(password1 == password3);
        System.out.println(password1.equals(password3));
        System.out.println(password1.equalsIgnoreCase(password3));
    }
}
