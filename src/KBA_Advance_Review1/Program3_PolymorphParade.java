package KBA_Advance_Review1;

public class Program3_PolymorphParade
{
    interface Worker {
        void work();
    }

    static class Teacher implements Worker {
        @Override
        public void work() {
            System.out.println("Teacher: Teaching math.");
        }
    }
    static class Farmer implements Worker {
        @Override
        public void work() {
            System.out.println("Farmer: Harvesting crops.");
        }
    }
    static class Chef implements Worker { // (7)
        @Override
        public void work() {
            System.out.println("Chef: Cooking yummy food."); // (8)
        }
    }

    public static void main(String[] args) {
        Worker[] parade = { new Teacher(), new Farmer(), new Chef() }; // (9)
        for (int i = 0; i < parade.length; i++) {                     // (10)
            parade[i].work(); // (11) each object does its own work method
        }
    }

}
