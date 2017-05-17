
public class Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstThread first=new FirstThread();
		SecondThread second=new SecondThread(first);
		first.run();
		second.run();
		
	}

}
