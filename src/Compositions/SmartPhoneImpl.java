package Compositions;

public class SmartPhoneImpl
{
    public static void main(String[] args) { // (44)
        // (45) Create components
        Screen screen = new Screen("S-AMOLED-1", "Samsung", "1080x2400", 6.5);
        Battery battery = new Battery("BAT-5000", "LG Chem", 5000, 85); // 85% initial
        Processor cpu = new Processor("Snapdragon-888", "Qualcomm", 8, 2.84);

        // (46) Compose smartphone
        SmartPhone myPhone = new SmartPhone("GalaxyX", "Samsung", screen, battery, cpu);

        // (47) Print phone and component info
        System.out.println("Phone Model: " + myPhone.getModel());
        System.out.println("Manufacturer: " + myPhone.getManufacturer());
        System.out.println("Screen: " + myPhone.getScreen().getResolution() +
                " (" + myPhone.getScreen().getSize() + " inches)");
        System.out.println("Battery: " + myPhone.getBattery().getCapacity() +
                "mAh, Charge: " + myPhone.getBattery().getChargeLevel() + "%");
        System.out.println("Processor: " + myPhone.getProcessor().getCores() +
                " cores @ " + myPhone.getProcessor().getFrequency() + " GHz");

        // (48) Simulate interactions
        myPhone.getScreen().touchAt(150, 300);                  // touch screen
        myPhone.getProcessor().runApp("YouTube", myPhone.getBattery()); // run an app
        System.out.println("Battery after running app: " + myPhone.getBattery().getChargeLevel() + "%");

        // (49) Charge phone a bit
        myPhone.getBattery().charge(10);

        System.out.println("Battery after charging: " + myPhone.getBattery().getChargeLevel() + "%");
    }
}


