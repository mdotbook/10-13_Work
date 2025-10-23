package Compositions;

public class Battery extends Product
{
    private int capacity;       // (16) mAh
    private int chargeLevel;    // (17) percentage 0-100

    // (18) Constructor
    public Battery(String model, String manufacturer, int capacity, int initialCharge) {
        super(model, manufacturer);
        this.capacity = capacity;
        this.chargeLevel = Math.max(0, Math.min(100, initialCharge)); // (19) clamp 0-100
    }

    // (20) Return current charge level
    public int getChargeLevel() {
        return chargeLevel;
    }

    // (21) Drain battery by given percent (simple simulation)
    public void drain(int percent) {
        if (percent < 0) return; // (22) ignore invalid
        chargeLevel = Math.max(0, chargeLevel - percent); // (23)
        System.out.println("Battery drained by " + percent + "%");
    }

    // (24) Charge battery by given percent
    public void charge(int percent) {
        if (percent < 0) return;
        chargeLevel = Math.min(100, chargeLevel + percent);
        System.out.println("Battery charged by " + percent + "%");
    }

    public int getCapacity() { return capacity; } // (25)
}

