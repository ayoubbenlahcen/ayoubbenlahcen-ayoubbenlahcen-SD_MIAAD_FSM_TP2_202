package ma.fsm.benlahcenayoub__tp2__miaad__2024.produit_projet.web;

import ma.fsm.benlahcenayoub__tp2__miaad__2024.produit_projet.entities.Product;
import ma.fsm.benlahcenayoub__tp2__miaad__2024.produit_projet.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
Cette in partie de ceode est  Conçu  pour la partie Web
 */
@RestController
public class ProductRestService {
    @Autowired
    private IProductRepository productRepository ;

    @GetMapping("/products")
    public List<Product>   products(){
        return productRepository.findAll() ;
    }
    /*
        cette fonction a comme bute est de faire recuperere un produit a parir de son ID
        A savoir que :
            productRepository.findById(id).orElse(null);
        va nous permet de faire ca  mais si le id n'existe pas dans la bese de donnee
        cette dernier va nous retourner null  alors que cette c'est une exception
        qu'il faut traiter dans les jours suivant.
        il est possible d'utiliser aussi:
            productRepository.findById(id).get();
     */
    @GetMapping("/products/{id}")
    public Product   findProduct(@PathVariable Long id){
        return productRepository.findById(id).orElse(null);
    }
}
