package com.bridgelabz.inventorymanagementprogram;

public class InventoryManagementMain 
{

	public static void main(String[] args) 
	{
		InventoryManager manager=new InventoryManager();
		manager.readInventory();
		System.out.println("Before computing value of each Inventory: ");
		manager.displayInventory();
		System.out.println("  ");
		System.out.println("After computing value of each Inventory:");
		manager.computeValue();
		manager.displayInventory();

	}

}
