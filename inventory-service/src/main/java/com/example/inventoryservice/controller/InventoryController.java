package com.example.inventoryservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean inStock(@PathVariable String skuCode){


    }
}
