package br.rti.tcc.judicbackend.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@ConfigurationProperties(prefix = "judic")
@Component
public class ConfigProperties {

    private Cors cors = new Cors();

    @Data
    public static class Cors {
        private List<String> origemPermitida;
    }
}
