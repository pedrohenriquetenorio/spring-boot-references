package api.references.spring.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pessoa_MTM")
public class PessoaMTM {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	@Column(name="nome", length = 80, nullable = false)
	private String nome;
	
	//estrutura
	// nome da tabela + junções das chaves primarias na tabela
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable( name="pessoa_tarefa",
			 	inverseJoinColumns={ @JoinColumn(name="tarefa_id") })
	private Set<TarefaMTM> tarefasMTM = new HashSet<>();
}
