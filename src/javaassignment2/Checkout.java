
package javaassignment2;

import java.util.ArrayList;


public class Checkout {
    public static int numberOfItems = 0;
    private ArrayList<DessertItem> itemArray;
    
    //constructor details
    public Checkout() {
        
        //Creates a Checkout instance with an empty list of DessertItem's
        this.itemArray = new ArrayList<DessertItem>();
    }
    
    //method details
    public int numberOfItems() {
        
        //Returns the number of DessertItem's in the list
        
        return itemArray.size();

    }
    
    public void enterItem(DessertItem newItem) {
        
        //A DessertItem is added to the end of the list of items
        itemArray.add(newItem);
        
    }
    
    public void clear() {
        //Clears the Checkout to begin checking out a new set of items
        itemArray.clear();
        
    }
    
    public int totalCost() {
        //Returns total cost of items in cents (without tax)
	int cost = 0;
	for (int i = 0; i < itemArray.size(); i++) {
            cost += itemArray.get(i).getCost();
	}
	return cost;
    }
    
    public double totalTax() {
        
        //Returns total tax on items in cents
	return (double)Math.round(totalCost() * DessertShoppe.TAX_RATE /100); 

    }
    
    public java.lang.String toString() {
       
        String message = "";
        
        message += "       " + (DessertShoppe.STORE_NAME) + "\n"; 
        message += "       " + ("--------------------") + "\n";
        
        for (int i = 0; i < itemArray.size(); i++) {
            DessertItem item = itemArray.get(i);
            double cost = (double)item.getCost()/100;
            String name = item.getName();
            
            
            
            if (item.getClass() == Candy.class) {
            
                message += ((Candy)item).getWeight() + " lbs." + " @ " + 
                        ((double)((Candy)item).getPricePerLb()/100) + " /lb. \n";
            
            }
            if (item.getClass() == Cookie.class ){
                
                message += ((Cookie)item).getNumCookies() + " @ " + 
                        ((double)((Cookie)item).getPricePerDozen()/100) + " /dz. \n";
                
            }
            if (item.getClass() == Sundae.class){
                
                name = ((Sundae)item).getNameTopping() + " Sundae With\n" + name + "     ";
            }
	
            message += (name + "        " + cost) + "\n";
        }
        
        message += ("Tax" + "                           " + ((double)totalTax()/100)) + "\n";
        message += ("Total Cost" + "                   " + ((double)totalCost()/100)) + "\n";
        return message;
        
      
 
    }
    
    
}
  /* returns a String representing a receipt for the current list of items       
            Overrides:
        toString in class java.lang.Object
        
            Returns:
        a String representing a receipt for the current list of DessertItem's 
        with the name of the Dessert store, the items purchased, the tax, 
        and the total cost, for example,

              M & M Dessert Shoppe
              --------------------

         Strawberry Ice Cream       1.45
         Caramel Sundae with
         Vanilla Ice Cream          1.55
         1.33 lbs. @ .89 /lb.
         Gummy Worms                1.18
         4 @ 3.99 /dz.
         Chocolate Chip Cookies     1.33
         1.50 lbs. @ 2.09 /lb.
         Salt Water Taffy           3.14
         3.00 lbs. @ 1.09 /lb.
         Candy Corn                 3.27

         Tax                         .77
         Total Cost                12.69
       */