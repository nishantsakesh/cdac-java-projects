
abstract class Device {
	int deviceId;
	String deviceName;
	
	Device(int deviceId,String deviceName ){
		this.deviceId = deviceId;
		this.deviceName = deviceName;
	}
	void displayDeviceInfo(){
		System.out.println("ID: " + deviceId + " | Device: " + deviceName);
	}
	abstract void turnon();
	abstract void turnoff();
}

interface RemoteControl{
	void increaseLevel();
	void decreaseLevel();
}




class LightDevice extends Device implements RemoteControl{
	int brightness =50;

	LightDevice(int deviceId, String deviceName) {
		super(deviceId, deviceName);
		
	}
	
	@Override
	void turnon() { System.out.println(deviceName + " is now ON (Glow)."); }
	
	@Override 
	void turnoff() { System.out.println(deviceName + " is now OFF."); }
	
	@Override
	public void increaseLevel() {
		brightness = Math.min(100, brightness + 10);
        System.out.println(deviceName + " Brightness: " + brightness + "%");
	}
	
	@Override
	public void decreaseLevel() {
		brightness = Math.max(0, brightness - 10);
        System.out.println(deviceName + " Brightness: " + brightness + "%");
}
	
	

	
	
}
	
	class FanDevice extends Device implements RemoteControl {
	    int speed = 1;

	    FanDevice(int deviceId, String deviceName) {
	        super(deviceId, deviceName);
	    }

	    @Override
	    public void turnon() { System.out.println(deviceName + " is now spinning."); }

	    @Override
	    public void turnoff() { System.out.println(deviceName + " has stopped."); }

	    @Override
	    public void increaseLevel() {
	        speed = Math.min(5, speed + 1);
	        System.out.println(deviceName + " Speed Level: " + speed);
	    }

	    @Override
	    public void decreaseLevel() {
	        speed = Math.max(0, speed - 1);
	        System.out.println(deviceName + " Speed Level: " + speed);
	    }
}
	
	
