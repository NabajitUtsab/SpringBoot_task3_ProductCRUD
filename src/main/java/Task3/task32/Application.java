package Task3.task32;

import Task3.task32.model.Product;
import Task3.task32.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}
	@Autowired
	private productRepository obj;

	@Override
	public void run(String... args) throws Exception {
		/*Product pro=new Product();

		pro.setProductName("Galaxy S23 Ultra");
		pro.setProductPrice("104500");
		pro.setAvailability(true);
		pro.setBrandName("Samsung");
		obj.save(pro);*/
	}
}
