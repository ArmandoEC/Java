package entities;

import java.util.function.Consumer;

public class ProductConsumer implements Consumer<Product>{

	@Override
	public void accept(Product t) {
		 t.setPrice(t.getPrice()*1.1);
	}


}
