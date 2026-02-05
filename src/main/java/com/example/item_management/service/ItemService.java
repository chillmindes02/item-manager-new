package com.example.item_management.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.item_management.enity.Item;

@Service
public class ItemService {

	private final List<Item> items = new ArrayList<>();

	public Item addItem(Item item) {
		// add item

		for (Item i : items) {

			if (i.getId().equals(item.getId())) {
				i.setName(item.getName());
				i.setDescription(item.getDescription());
				i.setAmt(item.getAmt());
				return item;
			}
		}

		items.add(item);
		return item;
	}

	public Optional<Item> getItemById(String id) {
		// get item by id

		return items.stream().filter(item -> item.getId().equals(id)).findFirst();
	}

	public List<Item> getItemById() {
		// get all item

		return items;
	}

	public String deleteItemById(String id) {
		// delete item by id

		boolean removed = items.removeIf(item -> item.getId().equals(id));

		if (removed) {
			return "Item deleted successfully";
		} else {
			return "Item not found";
		}
	}

}
