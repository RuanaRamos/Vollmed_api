package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.cancelamento.DadosCancelamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMotivoCancelamento implements ValidadorCancelmentoDeConsulta  {

    @Autowired
    public void validar(DadosCancelamentoConsulta dados) {
        if(dados.motivo() == null ){
            throw new ValidacaoException("Motivo de cancelamento e obrigatorio!");
        }



    }
}
