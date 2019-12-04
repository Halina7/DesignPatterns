package builder;

public class Person {
    //required
    private String name;
    private String pesel;
    //optional
    private String surname;
    private int age;
    private int heihgt;
    private int weight;

    public Person(String name, String pesel, String surname, int age, int heihgt, int weight) {
        this.name = name;
        this.pesel = pesel;
        this.surname = surname;
        this.age = age;
        this.heihgt = heihgt;
        this.weight = weight;
    }

    public static class Builder{
        //required
        private String name;
        private String pesel;
        //optional
        private String surname = "Somebody";
        private int age = 20;
        private int heihgt;
        private int weight;

        public Builder(String name, String pesel){
            this.name = name;
            this.pesel = pesel;
        }
        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder height(int height){
            this.heihgt = height;
            return this;
        }
        public Builder weight(int weight){
            this.weight = weight;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    private Person(Builder builder){
        this.name = builder.name;
        this.pesel = builder.pesel;
        this.surname = builder.surname;
        this.age = builder.age;
        this.heihgt = builder.heihgt;
        this.weight = builder.weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pesel='" + pesel + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", heihgt=" + heihgt +
                ", weight=" + weight +
                '}';
    }
}
