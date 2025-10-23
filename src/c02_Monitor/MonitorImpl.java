package c02_Monitor;

public class MonitorImpl
{
    public static void main(String[] args)
    {
        Monitor samsungMonitor = new Monitor("40 inch Beast", "Acer",
                27, "2540 x 1440");
        samsungMonitor.drawPixelAt(110,200,"red");
        ;
    }
}
