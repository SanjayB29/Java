public class Strings {
    public static void main(String[] args) {
        String name = "Sanjay ";
        boolean res = name.equalsIgnoreCase("sanjay");
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf('S'));
        System.out.println(name.trim());
        System.out.println(name.replace('a','o'));
    }
}
