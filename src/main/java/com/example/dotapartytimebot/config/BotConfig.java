package com.example.dotapartytimebot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class BotConfig {
    @Value("${telegram.bot-name}")
    String botName;
    @Value("${telegram.token}")
    String token;
}
