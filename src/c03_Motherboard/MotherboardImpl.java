package c03_Motherboard;

public class MotherboardImpl
{
    public static void main(String[] args)
    {
        Motherboard samsungMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");
        samsungMotherboard.loadProgram("Windows 10");
    }
}
