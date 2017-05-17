/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bill;

/**
 *
 * @author MSLCELTP1784
 */
public abstract class Customer {
  public   int custId;
    public String custName;
    public long mobileNumber;
    
    
    public Customer(int custId,String custName,long mobileNumber)
    {
    this.custId=custId;
    this.custName=custName;
    this.mobileNumber=mobileNumber;
    }
    
    public void setcustId(int custId){
    this.custId=custId;
    }
    public void setcustName(String custName)
    {
    this.custName=custName;
    }
    public void setmobileNumber(long mobileNumber)
    {
    this.mobileNumber=mobileNumber;
    }
    public int getcustId()
    {
    return custId;
    }
    public String getcustName()
    {
    return custName;
    }
    public long getmobileNumber()
    {
    return mobileNumber;
    }
    public abstract double calculateBill(int minutes);
}
