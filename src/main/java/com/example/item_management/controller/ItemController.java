package com.example.item_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.item_management.enity.Item;
import com.example.item_management.service.ItemService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/items")
public class ItemController {

	@Autowired
	private ItemService itemService;

	// Add a new item
	@PostMapping
	public ResponseEntity<Item> addItem(@Valid @RequestBody Item item) {
		return ResponseEntity.ok(itemService.addItem(item));
	}

	// Get item by ID
	@GetMapping("/{id}")
	public ResponseEntity<?> getItemById(@PathVariable String id) {
		return itemService.getItemById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/get-all")
	public List<Item> getItemAll() {

		return itemService.getItemById();
	}

	@DeleteMapping("/delete-by-id")
	public String deleteItemById(@RequestParam("id") String id) {

		return itemService.deleteItemById(id);
	}
}
