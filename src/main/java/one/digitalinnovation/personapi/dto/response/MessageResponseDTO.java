package one.digitalinnovation.personapi.dto.response;

import lombok.Builder;
import lombok.Data;
import org.aspectj.bridge.IMessageContext;
import org.hibernate.validator.constraints.ParameterScriptAssert;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.NotEmpty;

@Data
@Builder
public class MessageResponseDTO {

    private String message;

    
}

