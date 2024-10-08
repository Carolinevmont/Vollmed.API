package med.voll.api.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(

        @NotNull
        Long id,
        //Por não ser String utilizamos notnull pra um campo obrigatório

        String nome,

        String email,

        String telefone ,

        DadosEndereco endereco) {
}