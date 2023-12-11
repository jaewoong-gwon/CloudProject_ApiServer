package kjw.cloud.project.common.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@Getter
public class ApiResponse<T> {
    private final Object message;
    private final T data;
}
