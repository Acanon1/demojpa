package com.example.demojpa;
import org.springframework.data.jpa.repository.JpaRepository;


// ientidad cliente
import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    List<Cliente> findAll();

    Cliente findByNombre(String nombre);

    void deleteByNombre(String nombre);

    
}
