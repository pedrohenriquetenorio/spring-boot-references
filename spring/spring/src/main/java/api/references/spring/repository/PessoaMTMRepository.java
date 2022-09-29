package api.references.spring.repository;

import java.util.UUID;
import org.springframework.stereotype.Repository;

import api.references.spring.entity.PessoaMTM;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PessoaMTMRepository extends JpaRepository <PessoaMTM, UUID>{

}
