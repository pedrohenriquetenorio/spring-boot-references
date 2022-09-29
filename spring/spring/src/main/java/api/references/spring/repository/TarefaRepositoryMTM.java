package api.references.spring.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.references.spring.entity.TarefaMTM;

@Repository
public interface TarefaRepositoryMTM extends JpaRepository<TarefaMTM, UUID> {

}
