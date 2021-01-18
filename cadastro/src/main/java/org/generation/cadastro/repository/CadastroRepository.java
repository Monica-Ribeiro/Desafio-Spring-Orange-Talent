package org.generation.cadastro.repository;

import java.util.Optional;
import org.generation.cadastro.model.CadastroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//ESTA ANOTAÇÃO INDICA QUE ESSA CLASSE É UM REPOSITORY
public interface CadastroRepository extends JpaRepository<CadastroModel,Long>{
	Optional<CadastroModel> findByCpf(String cpf);

}