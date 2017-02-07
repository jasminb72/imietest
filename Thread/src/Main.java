
public class Main {

	public static void main(String[] args) {
		Thread counter1 =new Counter("counter1",2);
		counter1.start();
		Thread counter2 =new Counter("counter2",3);
		counter2.start();
		Thread counter3 =new Counter("counter3",4);
		counter3.start();
		System.out.println(Thread.activeCount());
	}

}
