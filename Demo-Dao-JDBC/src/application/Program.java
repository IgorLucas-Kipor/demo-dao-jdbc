package application;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("*** Test number one: Seller findById ***");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println();
		
		System.out.println("*** Test number two: Seller findByDepartment ***");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println();
		
		System.out.println("*** Test number three: Seller findAll ***");
		List<Seller> all = sellerDao.findAll();
		for (Seller s : all) {
			System.out.println(s);
		}
		
		System.out.println();
		
		System.out.println("*** Test number four: Seller insert ***");
		Seller newSeller = new Seller(null, "Greg Royce", "greg@gmail.com", new Date(), 4500.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());

		System.out.println();
		
		System.out.println("*** Test number five: Seller update ***");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println();
		
		System.out.println("*** Test number six: Seller delete ***");
		
		System.out.print("Enter a id for deletion: ");
		
		int id = sc.nextInt();
		
		sellerDao.DeleteById(id);
		
		System.out.println("Deletion completed!");
		
		sc.close();
		
	}

}
