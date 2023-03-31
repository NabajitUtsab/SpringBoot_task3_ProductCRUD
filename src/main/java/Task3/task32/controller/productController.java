package Task3.task32.controller;

import Task3.task32.exception.ProductNotFound;
import Task3.task32.model.Product;
import Task3.task32.repository.productRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class productController {
@Autowired
    private productRepository obj;

//Finding all product

@GetMapping
 public List<Product> getAllProducts()
 {
    return obj.findAll();
 }

 //Building Create product api

    @PostMapping("/add")
    public ResponseEntity<String> addProduct(@RequestBody Product product)
    {
     obj.save(product);
    return ResponseEntity.ok("Product added succesfully");

    }

    //Building Update product api
@PutMapping("/update/{id}")
  public ResponseEntity<String> updateProduct(@PathVariable long id,@RequestBody Product object)
  {
     Product product1=obj.findById(id)
             .orElseThrow(()->new ProductNotFound("Product not found"+ id));

  product1.setProductName(object.getProductName());
  product1.setProductPrice(object.getProductPrice());
  product1.setAvailability(object.isAvailability());
  product1.setBrandName(object.getBrandName());

     obj.save(product1);
  return ResponseEntity.ok("Product updated successfully");

  }


    //Building Get product api by id
    @GetMapping("/get/{id}")
    public ResponseEntity<Product>getProduct(@PathVariable long id)
    {
        Product product = obj.findById(id)
                .orElseThrow(()->new ProductNotFound("Product not found"+ id) );
        return ResponseEntity.ok(product);

    }


//Building Delete product api
    @DeleteMapping("/delete/{id}")
 public ResponseEntity<String> deleteProduct(@PathVariable long id)
 {
   Product delEmp=obj.findById(id)
           .orElseThrow(()->new ProductNotFound("Product not found"+id));
   obj.delete(delEmp);
   return ResponseEntity.ok("Product deleted successfully");
 }


}
