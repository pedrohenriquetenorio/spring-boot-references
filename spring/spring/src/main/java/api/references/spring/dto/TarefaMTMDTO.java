package api.references.spring.dto;


import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarefaMTMDTO {
	@NotBlank
	private String nomeTarefa;
}

