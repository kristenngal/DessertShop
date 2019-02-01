/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment2;

public class Candy extends DessertItem {
    private double weight;
    private int pricePerLb;
	
    public Candy(String name, double weight, int pricePerLb) {
	super(name);
	this.weight = weight;
	this.pricePerLb = pricePerLb;
    }

    public int getCost() {
    	int cost = (int)Math.round(pricePerLb * weight);
	return cost;
    }

    public double getWeight() {
	return weight;
    }

    public int getPricePerLb() {
	return pricePerLb;
    }
}