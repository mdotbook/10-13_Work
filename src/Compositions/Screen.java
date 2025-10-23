package Compositions;

public class Screen extends Product{
    private String resolution;
    private double size;

    public Screen(String model, String manufacturer, String resolution, double size) {
        super(model, manufacturer);
        this.resolution = resolution;
        this.size = size;
    }

    // (12) Simulate a touch at coordinates (x,y)
    public void touchAt(int x, int y) {
        System.out.printf("Screen touched at (%d,%d)%n", x, y);
    }

    // (13) Getters
    public String getResolution() { return resolution; }
    public double getSize() { return size; }

}

