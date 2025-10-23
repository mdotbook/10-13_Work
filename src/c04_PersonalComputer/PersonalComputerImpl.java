package c04_PersonalComputer;

public class PersonalComputerImpl
{
    public static void main(String[] args)
    {

//1 create  ComputerCase samsungCase object
        ComputerCase samsungCase = new ComputerCase("1000","samsung","110");

//2 create  ComputerCase samsungCase object Monitor theMonitor
        Monitor samsungMonitor = new Monitor("40 inch Beast", "samsung",
                27, "2540 x 1440");

//3 create  Motherboard theMotherboard object
        Motherboard samsungMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");

        //4 build your pc   PersonalComputer thePC object
        PersonalComputer samsungPC = new PersonalComputer("2208", "Dell",
                samsungCase, samsungMonitor, samsungMotherboard);
        //5 Turn pc on from case
        samsungPC.getComputerCase().pressPowerButton();
        //6 pc to load mother board program
        samsungPC.getMotherboard().loadProgram("windows");
        //7 pc will display drawing using a monitor
        samsungPC.getMonitor().drawPixelAt(190,270,"blue");
    }
}























