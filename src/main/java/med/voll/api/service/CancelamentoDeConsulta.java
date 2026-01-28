package med.voll.api.service;

import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.cancelamento.DadosCancelamentoConsulta;
import med.voll.api.domain.consulta.validacoes.ValidadorCancelmentoDeConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CancelamentoDeConsulta {

    @Autowired
    private ConsultaRepository repository;

    @Autowired
    private List<ValidadorCancelmentoDeConsulta> validadores;

    @Transactional
    public void cancelar(DadosCancelamentoConsulta dados) {
        validadores.forEach(v -> v.validar(dados));

        var consulta = repository.getReferenceById(dados.idConsulta());
        consulta.cancelar(dados.motivo());
    }


}
