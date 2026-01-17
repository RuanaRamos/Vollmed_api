package med.voll.api.domain.paciente;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.domain.endereco.Endereco;

@Entity(name = "Paciente")
@Table(name = "paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nome;
        private String telefone;
        private String email;
        private String cpf;
        @Embedded
        private Endereco endereco;

        private Boolean ativo;

    public Paciente(DadosCadastroPaciente dados) {

            this.nome = dados.nome();
            this.telefone = dados.telefone();
            this.email = dados.email();
            this.endereco = new Endereco(dados.endereco());
            this.cpf = dados.cpf();

        }

        public void atualizarInformacoes (@Valid DadosAtualizacaoPaciente dados){

            if (dados.nome() != null) {
                this.nome = dados.nome();
            }
            if (dados.telefone() != null) {
                this.telefone = dados.telefone();
            }
            if (dados.endereco() != null) {
                this.endereco.atualizarInformacoes(dados.endereco());
            }
        }

        public void excluir() {
            this.ativo = false;
        }
    }


