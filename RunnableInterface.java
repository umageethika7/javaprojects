package xyz;
class Car implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("BMW Car moving"+i);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				
			}
		}
	}
}
class Bike implements Runnable {
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("ninja Bike is moving"+i);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				
			}
		}
	}	
}
public class RunnableInterface{

	public static void main(String[] args) {
		Thread calThread = new Thread(new Car());
		Thread baThread = new Thread(new Bike());
		System.out.println("Gooo");
		calThread .start();
		baThread.start();
		
		

	}

}



