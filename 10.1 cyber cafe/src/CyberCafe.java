
public class CyberCafe 
{
	String cafeName;			
	String address;			
	int	membersCount;		
	int ratePerHour;
	
	public CyberCafe(String cafeName, String address, int membersCount,
			int ratePerHour) {
		super();
		this.cafeName = cafeName;
		this.address = address;
		this.membersCount = membersCount;
		this.ratePerHour = ratePerHour;
	}

	public String getCafeName() {
		return cafeName;
	}

	public String getAddress() {
		return address;
	}

	public int getMembersCount() {
		return membersCount;
	}

	public int getRatePerHour() {
		return ratePerHour;
	}
	
	
	
	


}
