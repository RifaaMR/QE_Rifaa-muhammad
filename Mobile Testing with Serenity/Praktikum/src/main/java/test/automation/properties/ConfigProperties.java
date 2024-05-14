package test.automation.properties;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

public class ConfigProperties {

    public DriverAndroidProperties readProperties() {
        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("configuration.yaml");
        DriverAndroidProperties data = yaml.load(inputStream);
        return data;
    }
}
