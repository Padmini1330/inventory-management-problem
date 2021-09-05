package com.bridgelabz.inventorymanagementprogram;

import com.bridgelabz.inventorydatamanagement.*;

import com.bridgelabz.linkedlistproblems.*;

public class InventoryManager 
{
	MyLinkedList<InventoryProperties> node;

	public void readInventory() 
	{
		InventoryFactory inventoryFactory=new InventoryFactory();
		node=inventoryFactory.addInventories();
	}

	public void displayInventory() 
	{
		node.printMyNodes();
	}
	
	public void computeValue()
	{
		InventoryNode temporaryNode=(InventoryNode)node.head;
		while(temporaryNode!=null)
		{
			InventoryProperties current=temporaryNode.getKey();
			current.setValue(current.getWeight()*current.getPrice());
			temporaryNode=(InventoryNode) temporaryNode.getNext();		}
	}
}
