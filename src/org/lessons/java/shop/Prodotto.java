package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
		
	    private Random randomNumber = new Random ();
		private int code;
		private String name;
		private String description;
		private double price;
		private double vat;
		
		public Prodotto() {}
		public Prodotto(String name, String description, double price, double vat) {
			this.setCode(randomNumber.nextInt());
			this.setName(name);
			this.setDescription(description);
			this.setPrice(price);
			this.setVat(vat);
		}
		public int getCode() {
			return code;
		}
		public void setCode(int code) {
			this.code = code;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public double getVat() {
			return vat;
		}
		public void setVat(double vat) {
			this.vat = vat;
		}
		public double getPriceWithVat() {
			return this.price + this.vat;
		}
		public String extendedName(){
			return code + "-" + name;
		}
		

}
