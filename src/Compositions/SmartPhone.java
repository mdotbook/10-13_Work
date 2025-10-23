package Compositions;

public class SmartPhone extends Product { // (36)
    private Screen screen;         // (37)
    private Battery battery;       // (38)
    private Processor processor;   // (39)

    // (40) Constructor injecting all components
    public SmartPhone(String model, String manufacturer,
                      Screen screen, Battery battery, Processor processor) {
        super(model, manufacturer);
        this.screen = screen;
        this.battery = battery;
        this.processor = processor;
    }

    // (41) Getters for components
    public Screen getScreen() { return screen; }
    public Battery getBattery() { return battery; }
    public Processor getProcessor() { return processor; }
}

