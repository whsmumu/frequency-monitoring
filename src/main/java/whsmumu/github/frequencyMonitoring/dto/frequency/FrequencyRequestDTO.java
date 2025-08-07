package whsmumu.github.frequencyMonitoring.dto.frequency;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FrequencyRequestDTO {

    @NotNull(message = "Campo obrigatório")
    @PastOrPresent(message = "Não pode ser uma data futura")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;

    @NotNull @PositiveOrZero
    private Integer quantidadeMembrosHomem;

    @NotNull @PositiveOrZero
    private Integer quantidadeMembrosMulheres;

    @NotNull @PositiveOrZero
    private Integer quantidadeVisitantesHomem;

    @NotNull @PositiveOrZero
    private Integer quantidadeVisitantesMulher;

    @NotNull @PositiveOrZero
    private Integer quantidadeKids;

    @NotNull @PositiveOrZero
    private Integer quantidadeBaby;
}