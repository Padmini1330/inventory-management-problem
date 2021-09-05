package com.bridgelabz.inventorymanagementprogram;

import com.bridgelabz.inventorydatamanagement.*;
import com.bridgelabz.linkedlistproblems.*;
import java.util.Scanner;

public class InventoryFactory 
{

	public MyLinkedList addInventories()
	{
		Scanner scanner=new Scanner(System.in);
		MyLinkedList<InventoryProperties> node=new MyLinkedList<InventoryProperties>();
		System.out.println("Enter the number of Inventories to be added:");
		int number=scanner.nextInt();
		for(int index=0;index<number;index++)
		{
			System.out.println("Enter name:");
			String name=scanner.next();
			System.out.println("Enter weight:");
			int weight=scanner.nextInt();
			System.out.println("Enter price per Kg:");
			double pricePerKg=scanner.nextDouble();
			InventoryProperties inventory=new InventoryProperties(name, weight, pricePerKg, 0);
			InventoryNode newNode=new InventoryNode(inventory);
			node.add(newNode);
		}
		return node;

	}

}
