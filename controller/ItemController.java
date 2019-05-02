package jstore.controller;

import java.util.*;
import jstore.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {
	
	@RequestMapping(value = "/items", method = RequestMethod.GET)
	public ArrayList<Item> itemList()
	{
		return DatabaseItem.getItemDatabase();
	}
	
	@RequestMapping(value = "/items/{id_item}", method = RequestMethod.GET)
	public Item getItemFromId(@PathVariable int id_item)
	{
		return DatabaseItem.getItemFromId(id_item);
	}
}