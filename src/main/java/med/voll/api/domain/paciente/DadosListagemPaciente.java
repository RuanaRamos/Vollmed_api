package med.voll.api.domain.paciente;

public record DadosListagemPaciente( Long Id, String nome, String telefone, String cpf) {

    public DadosListagemPaciente(Paciente paciente){
        this(paciente.getID(), paciente.getNome(), paciente.getTelefone(), paciente.getCpf());
    }
}
