package br.inatel.dm110.hello.interfaces;

import java.util.List;

public interface Inventory {
	
	List<String> listProductNames();
	
	void createNewProduct(String name);

}
