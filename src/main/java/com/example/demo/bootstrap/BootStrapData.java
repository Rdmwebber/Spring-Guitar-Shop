package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;


    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;

    }

    @Override
    public void run(String... args) throws Exception {

        if (outsourcedPartRepository.count() ==  0) {

            OutsourcedPart guitarBody = new OutsourcedPart();
            guitarBody.setName("Guitar Body");
            guitarBody.setPrice(349.99);
            guitarBody.setInv(17);
            guitarBody.setCompanyName("Fender");
            guitarBody.setMaxInventory(50);
            guitarBody.setMinInventory(1);
            outsourcedPartRepository.save(guitarBody);

            OutsourcedPart tuningPegs = new OutsourcedPart();
            tuningPegs.setName("Tuning Pegs");
            tuningPegs.setPrice(49.99);
            tuningPegs.setInv(16);
            tuningPegs.setCompanyName("Gibson");
            tuningPegs.setMaxInventory(50);
            tuningPegs.setMinInventory(1);

            outsourcedPartRepository.save(tuningPegs);

            OutsourcedPart pickGuard = new OutsourcedPart();
            pickGuard.setName("Pick Guard");
            pickGuard.setPrice(89.99);
            pickGuard.setInv(21);
            pickGuard.setCompanyName("Yamaha");
            pickGuard.setMaxInventory(50);
            pickGuard.setMinInventory(1);

            outsourcedPartRepository.save(pickGuard);

            OutsourcedPart neck = new OutsourcedPart();
            neck.setName("Neck");
            neck.setPrice(227.99);
            neck.setInv(25);
            neck.setCompanyName("Squire");
            neck.setMaxInventory(50);
            neck.setMinInventory(1);

            outsourcedPartRepository.save(neck);

            OutsourcedPart bridge = new OutsourcedPart();
            bridge.setName("Bridge");
            bridge.setPrice(125.99);
            bridge.setInv(49);
            bridge.setCompanyName("Epiphone");
            bridge.setMaxInventory(50);
            bridge.setMinInventory(1);

            outsourcedPartRepository.save(bridge);

        }

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        if (productRepository.count() == 0) {

        Product telecaster = new Product("Telecaster", 1199.99, 7);
        productRepository.save(telecaster);

        Product lesPaul = new Product("Les Paul", 1499.99, 5);
        productRepository.save(lesPaul);

        Product stratocaster = new Product("Stratocaster", 999.99, 6);
        productRepository.save(stratocaster);

        Product flyingV = new Product("Flying V", 1249.99, 2);
        productRepository.save(flyingV);

        Product mustang = new Product("Mustang", 1549.99, 9);
        productRepository.save(mustang);
        }






        /*
                Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
