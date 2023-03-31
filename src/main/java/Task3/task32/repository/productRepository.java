package Task3.task32.repository;

import Task3.task32.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<Product,Long> {

}


