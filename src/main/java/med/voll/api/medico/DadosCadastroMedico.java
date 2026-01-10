package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String medico, String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco ) {

}
