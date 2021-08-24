package cw.DTO;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfigure {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
