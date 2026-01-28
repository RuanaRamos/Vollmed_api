package med.voll.api.domain.consulta.validacoes;
import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.domain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ValidadorPacienteAtivo implements ValidadorAgendamentoDeConsulta {

    @Autowired
        private PacienteRepository repository;

        public void validar(DadosAgendamentoConsulta dados){

            if (dados.idPaciente() == null){
                return;
            }
            var pacienteEstaAtivo = repository.findAtivoByID(dados.idPaciente());
            if(!pacienteEstaAtivo){
                throw new ValidacaoException("consulta nao podeser agendada Paciente invalido");
            }
        }

    }


