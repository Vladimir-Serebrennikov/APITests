package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Register {
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;
}
