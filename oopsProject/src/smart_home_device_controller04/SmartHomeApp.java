

public class SmartHomeApp {
    public static void main(String[] args) {
        LightDevice livingLight = new LightDevice(101, "Living Room LED");
        FanDevice ceilingFan = new FanDevice(202, "Master Fan");

        livingLight.displayDeviceInfo();
        livingLight.turnon();
        livingLight.increaseLevel();
        livingLight.increaseLevel();
        livingLight.decreaseLevel();

        System.out.println("---------------------------");

        ceilingFan.displayDeviceInfo();
        ceilingFan.turnon();
        ceilingFan.increaseLevel();
        ceilingFan.decreaseLevel();
        ceilingFan.turnoff();
    }
    
}
