/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment2;

public class Cookie extends DessertItem {
    private int numCookies;
    private int pricePerDozen;

    public Cookie(String name, int numCookies, int pricePerDozen) {
	super(name);
	this.numCookies = numCookies;
	this.pricePerDozen = pricePerDozen;
    }

    public int getCost() {
	int cost = (int)Math.round((numCookies * pricePerDozen) / 12);
	return cost;
    }

    public int getNumCookies() {
	return numCookies;
    }

    public int getPricePerDozen() {
	return pricePerDozen;
    }
}
