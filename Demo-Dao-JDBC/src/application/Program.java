package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller seller = new Seller(32, "Lucas Mars", "lucas@gmail.com", new Date(), 3500.0, obj);
		
		System.out.println(seller);

	}

}
