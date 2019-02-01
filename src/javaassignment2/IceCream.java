/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment2;

public class IceCream extends DessertItem {
    private int cost;

    public IceCream(String name, int cost) {
	super(name);
	this.cost = cost;
    }

    public int getCost() {
	return cost;
    }
	
}
