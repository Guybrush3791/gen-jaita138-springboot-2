package org.generation.jaita138.demo5.db.repo;

import org.generation.jaita138.demo5.db.entity.Animale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimaleRepo extends JpaRepository<Animale, Long> {

}
