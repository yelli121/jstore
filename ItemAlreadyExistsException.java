package jstore;

public class ItemAlreadyExistsException extends Exception{
	private Item item_error;
	
	public ItemAlreadyExistsException(Item item_input)
	{
		super("Item Name: ");
		
		item_error = item_input;
	}
	
	public String getExMessage()
	{
		String s = super.getMessage() + item_error.getName() +
				item_error.getCategory() + ", Status: " + item_error.getStatus() +
				" from: " + item_error.getSupplier().getName() +
				" already exists.";
		return s;
	}			
}
