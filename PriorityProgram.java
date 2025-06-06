/**
 * 
 */
package xyz;

/**
 * 
 */
public class PriorityProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread lowPriorityThread = new Thread(()->{
			for(int i=1;i<3;i++) {
				System.out.println("low priority thread"+i);
			}
		});
		Thread highPriorityThread = new Thread(()->{
			for(int i=1;i<3;i++) {
				System.out.println("high priority thread");
			}
		});
		lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
		highPriorityThread.setPriority(Thread.MAX_PRIORITY);
		lowPriorityThread.start();
		highPriorityThread.start();
		
		

	}

}
