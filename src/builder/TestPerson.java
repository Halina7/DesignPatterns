package builder;

public class TestPerson {
    public static void main(String[] args) {
        Person John = new Person.Builder("John", "64081299999").build();
        Person Anna = new Person.Builder("Anna", "03061211111").surname("Karenina")
                .age(16).height(170).weight(61).build();
        System.out.println(John);
        System.out.println(Anna);
    }

}
