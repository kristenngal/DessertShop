/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment2;

public class Sundae extends IceCream {
    private String nameTopping;
    private int costTopping;

    public Sundae(String nameIceCream, int costIcecream, String nameTopping, int costTopping) {
	super(nameIceCream, costIcecream);
	this.nameTopping = nameTopping;
	this.costTopping = costTopping;
    }

    public int getCost() {
	return super.getCost() + costTopping;
    }

    public String getNameTopping() {
	return nameTopping;
    }
	
}