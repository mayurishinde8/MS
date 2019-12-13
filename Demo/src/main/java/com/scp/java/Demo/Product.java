package com.scp.java.Demo;

public class Product {
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

@Override
public String toString() {
	return "Product [id=" + id + "]";
}



public Product(int id) {
	super();
	this.id = id;
}

public Product() {
	super();
	// TODO Auto-generated constructor stub
}

}
