package question6;

public class SmartPhone extends Phone {
	private String os;
	private double osVer;
	private int memory;
	private boolean camera;
	private boolean bluetooth;
	
	public SmartPhone(String company, int price, int type, String os, double osVer, int memory, boolean camera,
			boolean bluetooth) {
		super(company, price, type);
		this.os = os;
		this.osVer = osVer;
		this.memory = memory;
		this.camera = camera;
		this.bluetooth = bluetooth;
	}

	public String getOs() {
		return os;
	}

	public double getOsVer() {
		return osVer;
	}

	public int getMemory() {
		return memory;
	}

	public boolean isCamera() {
		return camera;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public String toString() {
		return super.toString() + "운영체제 : " + os + ", 운영체제 버전: " + osVer + ", 메모리 : " + memory + "g, 카메라 지원: " + camera
				+ "GByte, 블루투스 지원 : " + bluetooth;
	}
}
