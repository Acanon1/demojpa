import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    List<Cliente> findAll();

    Cliente findByNombre(String nombre);

    void deledeleteByNombre(String nombre);

    
}
