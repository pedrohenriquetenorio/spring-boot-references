package api.references.spring.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class PessoaMTMDTO {
	@NotBlank
	private String nome;
	
}
