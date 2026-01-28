package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.consulta.cancelamento.DadosCancelamentoConsulta;

public interface ValidadorCancelmentoDeConsulta {

    void validar(DadosCancelamentoConsulta dados);


}
