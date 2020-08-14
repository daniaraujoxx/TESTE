package br.com.rdevs.EstudoProva.repository;

import br.com.rdevs.EstudoProva.entity.LojaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LojaRepository extends JpaRepository<LojaEntity, Integer> {
    List<LojaEntity> findByNome(String nome);
}
