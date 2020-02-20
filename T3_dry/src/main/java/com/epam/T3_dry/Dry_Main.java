package com.epam.T3_dry;


public class Dry_Main{
  public void Study(){
    System.out.println("I'm studying");
    performTasks();
    }
    
    public void Sleep(){
     System.out.println("I'm sleeping");
      performTasks();
    }
    public void performTasks(){
        System.out.println("I'm relaxing");
        System.out.println("I'm eating");
     
    }
    }
    class dryMain{
          public static void main(String args[]){
           Dry_Main d=new Dry_Main();
           d.Study();
           d.Sleep();
           }
     }
