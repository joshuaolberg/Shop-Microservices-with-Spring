package de.leuphana.shop.connector;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@RestController
public class ShopController {


	@GetMapping("/shop")
	public String getShop() {
		return "Shop";

	}


}
