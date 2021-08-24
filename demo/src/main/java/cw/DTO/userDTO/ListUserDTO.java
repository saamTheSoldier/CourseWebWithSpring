package cw.DTO.userDTO;

import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public class ListUserDTO {
    @Autowired
    private  ModelMapper modelMapper;
    Long id;
    private String name;
    private String username;
}
