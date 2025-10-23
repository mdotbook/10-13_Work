package Compositions;

class Processor extends Product { // (27)
    private int cores;         // (28) number of cores
    private double frequency;  // (29) GHz

    // (30) Constructor
    public Processor(String model, String manufacturer, int cores, double frequency) {
        super(model, manufacturer);
        this.cores = cores;
        this.frequency = frequency;
    }

    // (31) Simulate running an app: drains battery a bit and prints status
    public void runApp(String appName, Battery battery) {
        System.out.println("Processor running app: " + appName);
        // (32) simple battery drain heuristic
        if (battery != null) {
            int drainAmount = Math.max(1, (int)Math.round(frequency * cores)); // (33)
            battery.drain(drainAmount);
        }
    }

    // (34) Getters
    public int getCores() { return cores; }
    public double getFrequency() { return frequency; }
}

