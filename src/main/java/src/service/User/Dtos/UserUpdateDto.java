
package src.service.User.Dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserUpdateDto extends  UserCreateDto{
    @JsonProperty(value = "isDeleted")
    public Boolean isDeleted  = false;

}

