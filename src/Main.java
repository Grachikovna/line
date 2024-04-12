public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("task 1");
        String lastName = "Ivanov";
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
        System.out.println();
        //task 2
        System.out.println("task 2");
        String f = lastName + " " + firstName + " " + middleName;
        System.out.println(f.toUpperCase());
        System.out.println();
        //task 3
        System.out.println("task 3");
        String q = "Иван Семён Семёнович";
        q = q.replace("ё", "е");
        System.out.println(q);
    }
}