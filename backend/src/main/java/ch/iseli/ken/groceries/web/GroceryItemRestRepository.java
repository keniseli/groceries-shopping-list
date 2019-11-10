package ch.iseli.ken.groceries.web;

import ch.iseli.ken.groceries.domain.GroceryItem;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "groceryitems", path = "groceryitems")
public interface GroceryItemRestRepository extends PagingAndSortingRepository<GroceryItem, Long> {

}
