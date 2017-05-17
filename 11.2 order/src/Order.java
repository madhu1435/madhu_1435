import java.util.Scanner;


public class Order {
	public int orderId;
	public String orderName;
	public String category;
	public double price;
	public double tax;
	public void acceptData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("orderid");
		orderId=sc.nextInt();
		System.out.println("ordername");
		orderName=sc.next();
		System.out.println("price");
		price=sc.nextDouble();
		System.out.println("Select a category \n 1.Shipping \n 2.Air \n 3.Road");
		category=sc.next();
		
	}
	public double calTax(){
		String c=category;
		double tax[]=new double[3];
		tax[0]=(price*15)/100;
		tax[1]=(price*25)/100;
		tax[2]=(price*8)/100;
		switch(c){
			case "1":System.out.println("Calculated tax for shipping:"+tax[0]);
			return tax[0];
		    case "2":System.out.println("Calculated tax for Air:"+tax[1]);
		    return tax[1];
		    case "3":System.out.println("Calculated tax for Road:"+tax[2]);
		    return tax[2];
		    default:System.out.println("Please enter a valid category");
			
		}
		return 0;
	}
	public void dispOrder(){
		//double tax=calTax();
		
		double Totalprice=price+calTax();
		System.out.println("orderId  OrderName Totalprice");
		System.out.println(orderId+"        "+orderName+"        "+Totalprice);
	}

}
