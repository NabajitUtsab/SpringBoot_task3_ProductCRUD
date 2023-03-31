package Task3.task32.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="productsTable")

public class Product {
 @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long productID;
     @Column(name="productName")
     private String productName;
    @Column(name="productPrice")
     private String productPrice;
    @Column(name="availability")
     private boolean availability;
    @Column(name="brandName")
     private  String brandName;
}
