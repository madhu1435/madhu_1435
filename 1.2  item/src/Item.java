
public class Item {
	int itemId;
	String itemName;
	
	public Item(int itemId,String itemName){
		super();
		this.itemId=itemId;
		this.itemName=itemName;
	}

	public void display(){
		System.out.println("item id:"+ this.itemId +"itemName:" + this.itemName);
	}
}
