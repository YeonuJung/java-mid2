package collection.map.test.cart;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {
    // key = Product value = count
    private Map<Product, Integer> products = new LinkedHashMap<>();


    public void add(Product product, int count){
        if(products.containsKey(product)){
            int quantity = products.get(product) + count;
            products.put(product, quantity);
        }else{
            products.put(product, count);
        }
    }

    public void minus(Product product, int count){
        if(products.containsKey(product)){
            if(products.get(product) > count){
                int quantity = products.get(product) - count;
                products.put(product, quantity);
            }else{
                products.remove(product);
            }
        }
    }

    public void printAll(){
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }
}
