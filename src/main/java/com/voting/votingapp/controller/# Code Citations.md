# Code Citations

## License: unknown
https://github.com/jnaalisv/kona/tree/e1b7bf23f8e360a0151e4e551c6518ca5f8c6e06/src/main/java/kona/WebConfig.java

```
context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {
    @Bean
```


## License: unknown
https://github.com/Sawa97/restaurant-manager/tree/5ece265e61d451cfd02d83ecd076912b94743bcf/restaurant/src/main/java/com/sawa/restaurant/configuration/WebConfig.java

```
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
```


## License: unknown
https://github.com/bogurs/shopAngular/tree/e29b9fbb91fed5f48fd558adc3980f33832a8f74/shop/src/main/java/shop/goodstudy/mall/config/WebConfig.java

```
springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://localhost:4200");
```


## License: unknown
https://github.com/HCAnindya/GoOnline/tree/72fe22756968264042fa051a213fb0a442f8214b/GoOnlineInventoryManagement/src/main/java/com/goonline/inventory/management/WebConfig.java

```
Configuration
public class WebConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
    }
```

