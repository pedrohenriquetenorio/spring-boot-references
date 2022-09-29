package api.references.spring.entity;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tarefa_MTM")
public class TarefaMTM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	@Column(name="nome_tarefa", length = 80, nullable = false)
	private String nomeTarefa;	
	
	@ManyToMany(mappedBy = "tarefasMTM")
	private Set<PessoaMTM> pessoaMTM = new HashSet<>();
}
