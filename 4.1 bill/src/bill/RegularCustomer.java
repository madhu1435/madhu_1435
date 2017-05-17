/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bill;

/**
 *
 * @author MSLCELTP1784
 */
public class RegularCustomer extends Customer{
    
    public int billNo;
    public float billAmount;
    
    public int getbillNo()
    {
    return billNo;
    }
    public float getbillAmount()
    {
    return billAmount;
    }
     public RegularCustomer( int empId,String empName,long mobileNumber,int billNo,float billAmount)
    {
        super(empId,empName,mobileNumber);
    this.billAmount=billAmount;
    this.billNo=billNo;
    }

    @Override
    public double calculateBill(int minutes) 
    {
      if(minutes<=30){
        billAmount=minutes*1;
        }
        if(minutes>30){
        billAmount=(float) (minutes*0.5);
        }
       return billAmount;
    }
    
}
