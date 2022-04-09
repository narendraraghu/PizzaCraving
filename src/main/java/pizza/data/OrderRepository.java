package pizza.data;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import pizza.PizzaOrder;
import pizza.User;


public interface OrderRepository
         extends CrudRepository<PizzaOrder, Long> {

  List<PizzaOrder> findByUserOrderByPlacedAtDesc(
          User user, Pageable pageable);


  List<PizzaOrder> findByUserOrderByPlacedAtDesc(User user);


}
