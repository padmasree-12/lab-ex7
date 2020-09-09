/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author padma
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<empl>list=new ArrayList<empl>();
        list.add(new empl("padma",6000));
        list.add(new empl("Safii",6000));
        list.add(new empl("Akshaya",4500));
        list.add(new empl("niski",8000));
        list.add(new empl("shubha",8000));
        list.add(new empl("Kavi",12000));
        list.add(new empl("Arun",11000));
        list.add(new empl("mahesh",7000));
        list.add(new empl("Abi",15000));
        list.add(new empl("john",9000));
        list.add(new empl("sta",7500));
        list.add(new empl("rithu",13800));
        list.add(new empl("ganesh",7080));
        list.add(new empl("vicky",10000));
        list.add(new empl("prabha",12500));
        list.add(new empl("akshaya",14000));
        list.add(new empl("sanju",17000));
        list.add(new empl("nivas",8800));
        list.add(new empl("luckas",6060));
        list.add(new empl("sree",9500));
        Collections.sort(list,new Salary());
        System.out.println("Salary sorted list");
        for(empl e:list)
        {
            System.out.println(e);
        }
        // TODO code application logic here
    }
    

}
class Salary implements Comparator<empl>
{
    @Override
    public int compare(empl e1,empl e2)
    {
      if(e1.getSalary()>e2.getSalary())
      {
          return 1;
      }
      else
      {
          return -1;
      }
    }
}
class empl
{
    String name;
    int salary;
   
    public empl(String n,int s)
    {
        this.name=n;
        this.salary=s;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
       this.name=name; 
    }
    public int getSalary()
    {
        return salary;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    public String toString()
    {
        return "Name:"+this.name+"-Salary:"+this.salary;
    }
}