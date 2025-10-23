package KBA_Advance_Review1;

public class Program5_ManyInterfaces
{
    interface Playable {
        void play();
    }
    interface Chargeable {             // (3)
        void charge();                 // (4)
    }

    static class ToyRobot implements Playable, Chargeable { // (5)
        String model;

        ToyRobot(String model) {       // (6)
            this.model = model;        // (7)
        }

        @Override
        public void play() {           // (8)
            System.out.println(model + " plays music and dances."); // (9)
        }

        @Override
        public void charge() {         // (10)
            System.out.println(model + " is charging its battery."); // (11)
        }
    }

    public static void main(String[] args) {
        ToyRobot t = new ToyRobot("RoboFun"); // (12)
        t.play();                             // (13)
        t.charge();                           // (14)
    }

}
