package med.voll.api.domain.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(

        @NotBlank
        String logradouro,

        @NotBlank
        String bairro,


        @NotBlank
        @Pattern(regexp = "\\d{5}")
        String cep,
        //(PLZ)

        @NotBlank
        String uf,

        String complemento,

        String numero,

        @NotBlank
        String cidade )
    //Ort
{


}
