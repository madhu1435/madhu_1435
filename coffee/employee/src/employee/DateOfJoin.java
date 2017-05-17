/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author MSLCELTP1784
 */
public class DateOfJoin {
    public int day;
    public int month;
    public int year;
    
    public DateOfJoin(int day,int month,int year)
    {
    this.day=day;
    this.month=month;
    this.year=year;
    }
    public void showDate()
    {
    System.out.println("day:"+day+"month:"+month+"year:"+year);
    }
}
