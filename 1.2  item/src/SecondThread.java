import java.util.ListIterator;
public class SecondThread extends Thread {
	private FirstThread first;

	SecondThread(FirstThread ff){
		this.first=ff;
	}
	
	public void run(){
		synchronized(first){
			ListIterator li=first.al.listIterator();
			System.out.println("second thread get started to print the item details\n");
			System.out.println("the item details are:");
			while(li.hasNext()){
				Item item=(Item)(li.next());
				item.display();
				
			}
		}
	}}
