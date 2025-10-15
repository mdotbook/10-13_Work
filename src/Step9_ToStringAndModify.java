public class Step9_ToStringAndModify
{
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {return name;}
        public void setName(String name) { this.name = name;}
        public int getAge() {return age;}
        public void setAge(int age) {this.age = age;}

        @Override
        public String toString () {  // (8) readable printout
            return "Person{name='" + name + "', age=" + age + "}";

        }
    }

    public static void main(String[] args) {
        Person p = new Person("Alex", 15); // (9)
        System.out.println("Before: " + p); // (10) calls toString()
        p.setAge(16);                       // (11)
        p.setName("Alexa");                 // (12)
        System.out.println("After : " + p); // (13)

    }
}
