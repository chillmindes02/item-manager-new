package com.example.item_management.enity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Item {

	@NotNull
	private String id;

	@NotBlank
	private String name;

	private String description;

	private double amt;
}
