package candy;

import io.micronaut.core.annotation.Introspected;

@Introspected
public record Message(
    Integer speed,
    String status,
    Boolean gimme
){
}
