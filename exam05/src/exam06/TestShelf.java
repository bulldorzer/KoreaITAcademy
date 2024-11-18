package exam06;

public class TestShelf {

	public static void main(String[] args) {
		Queue bookQueue = new BookShelf();
		
		bookQueue.enQueue("Herry Poter1 - 마법사의 돌");
		bookQueue.enQueue("Herry Poter2 - 비밀의 방");
		bookQueue.enQueue("Herry Poter3 - 불의 잔");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}

}
