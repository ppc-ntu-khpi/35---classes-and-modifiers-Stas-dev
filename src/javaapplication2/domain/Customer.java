/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2.domain;

/**
 *
 * @author Я
 */
public class Customer {
    private int ID  = 1;
    private boolean isNew = true;
    private float total = 1000.0f;
    public void  displayCustomerInfo(){
        System.out.println("User id - " +ID);
        System.out.println("Total purchase - " +total);
        System.out.println("isNew - " +isNew);
        
    
    }
    public int getId()
    {
        return ID;
    }

    public void setId(int Id)
    {
        this.ID = Id;
    }

    public boolean isIsNew()
    {
        return isNew;
    }

    public void setIsNew(boolean IsNew)
    {
        this.isNew = IsNew;
    }

    public float getTotal()
    {
        return total;
    }

    public void setTotal(float Total)
    {
        this.total = Total;
    }
    public Customer(int id,boolean isNew,float total)
    {
        ID=id;
        isNew=isNew;
        total=total;
    }
    public Customer()
    {
    }
}
