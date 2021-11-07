package com.ubosque.Shop.Delivery.Controller;
//Jose B.
import com.ubosque.Shop.Delivery.Model.Store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

@RestController
public class StoreController {
	
	private List<Store> stores;
	
	@PostConstruct
	public void initialize() {
		stores = new ArrayList<>();
		stores.add(new Store(1,"El Corral","Hambuerguesas","Carnes","url"));
		stores.add(new Store(1,"McDonald's","Hambuerguesas","Carnes","url"));
		stores.add(new Store(1,"Burger King","Hambuerguesas","Carnes","url"));
	}
	
	@GetMapping("/stores")
	public List<Store> getStores(){
		return stores;
		
	}

}
