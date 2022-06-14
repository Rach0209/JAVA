// page 264
// 4번
// 5번
// 6번
// 7번

// 6번문제

package question6;

public class Main {
	public static void main(String[] args) {
		SmartPhone oldphone = new SmartPhone("Apple", 1470000, 5, "IOS", 15.5, 256, true, true);
		System.out.println(oldphone.toString());
		
		SmartPhone se = SmartPhoneFactory.iphoneSE3();
		System.out.println(se.getCompany());
		System.out.println(se.getPrice());
		System.out.println(se.getType());
		System.out.println(se.getOs());
		System.out.println(se.getOsVer());
		System.out.println(se.getMemory());
		System.out.println(se.isCamera());
		System.out.println(se.isBluetooth());
	}
}
