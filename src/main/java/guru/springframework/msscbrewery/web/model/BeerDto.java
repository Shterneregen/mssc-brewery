package guru.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    @Null
    private UUID id;
    @NotBlank
    @Size(min = 3, max = 100)
    private String beerName;
    @NotBlank
    private String beerStyle;
    @Positive
    @NotNull
    private Long upc;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastUpdatedDate;
}
