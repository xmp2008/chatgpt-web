package cn.xmp.chatgpt.infras;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"cn.xmp.chatgpt.infras.dao.**"})
@EnableJpaRepositories(basePackages = {"cn.xmp.chatgpt.infras.dao.**"})
@EntityScan(basePackages = {"cn.xmp.chatgpt.infras.dao.**"})
@EnableJpaAuditing
public class InfrasAutoConfiguration
{

}
