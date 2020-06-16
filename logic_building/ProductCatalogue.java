package tech;

import java.util.ArrayList;
import java.util.Scanner;
import tech.Product;

public class ProductCatalogue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc =new Scanner(System.in);
   ArrayList <Product>pList=new ArrayList <Product>();
  System.out.println("enter the number of products to add to catalogue");
  int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
	   System.out.println("enter the product id");
	   int id =sc.nextInt();
	   System.out.println("enter the product name");
	   String name =sc.next();
	   System.out.println("enter the product price");
	   double price =sc.nextDouble();
	   
	   Product p=new Product();
	   p.setId(id);
	   p.setName(name);
	   p.setPrice(price);
	   
	   
	   
	   pList.add(p);
   }
   System.out.println("enter product id to find details");
    int search=sc.nextInt();
    boolean found=false;
    for(Product p:pList)
    {
    	if(p.getId()==search)
    	{
    		System.out.println("product found with id"+p.getId());
    		System.out.println("name"+p.getName());
    		System.out.println("price"+p.getName());
    		found=true;
    		break;
    	}
    }
    if(found==false) {
    System.out.println("product not found");
    	}
   }
  
  
  
  
	}


