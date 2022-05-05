package com.mycompany.app;

import java.sql.SQLException;
import java.util.Scanner;

import com.mycompany.dao.ProductManagementDAO;
import com.mycompany.domain.Product;

public class ProductManagementApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\nA. View Products\n" + "B. Add Product\n" + "C. Update Product\n"
					+ "D. Delete Product\n" + "E. Search Product\n" + "F. Exit");
			System.out.println("==============================");
			System.out.println("Enter an option");
			System.out.println("==============================");
			char ch = sc.next().charAt(0);
//			System.out.println("\n\n------------------------------");

			Product prod = new Product();
			ProductManagementDAO prodDao = new ProductManagementDAO();
			int rows;

			switch (ch) {
			case 'A':
				prodDao = new ProductManagementDAO();
				rows = prodDao.view();
				break;

			case 'B':
				System.out.println("Enter the Product Name: ");
				System.out.println("------------------------------");
				prod = new Product();
				prod.setProductName(sc.next());
				System.out.println("Enter the Product Id: ");
				System.out.println("------------------------------");
				prod.setProductId(sc.nextInt());
				System.out.println("Enter the Product Price: ");
				System.out.println("------------------------------");
				prod.setProductPrice(sc.nextInt());
				prodDao = new ProductManagementDAO();
				rows = prodDao.insert(prod);
				if (rows > 0) {
					System.out.println("Product added successfully");
				} else {
					System.out.println("Product insertion failed!");
				}
				break;

			case 'C':
				System.out.println("Enter the Product Name: ");
				prod.setProductName(sc.next());
				System.out.println("Enter the Product Id: ");
				prod.setProductId(sc.nextInt());
				prodDao.update(prod);
				break;
				
			case 'D':
				System.out.println("Enter the Product Id: ");
				prod.setProductId(sc.nextInt());
				prodDao.delete(prod);
				System.out.println("The row deleted successfully...");
				break;
				
			case 'E':
				System.out.println("Enter the Product Id: ");
				prod.setProductId(sc.nextInt());
				prodDao.search(prod);
				break;

			case 'F':
				System.out.println("***************THANK YOU***************");
				System.exit(0);
				break;

			default:
				break;

			}

		}

	}

}
