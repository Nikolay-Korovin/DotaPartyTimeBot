package com.example.dotapartytimebot.telegram;

import com.example.dotapartytimebot.config.BotConfig;
import com.example.dotapartytimebot.telegram.keyboard.ReplyKeyboardMaker;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
@AllArgsConstructor
public class BotComponent extends TelegramLongPollingBot {

    private final ReplyKeyboardMaker replyKeyboardMaker = new ReplyKeyboardMaker();

    private final BotConfig botConfig;

    @Override
    public String getBotUsername() {
        return botConfig.getBotName();
    }

    @Override
    public String getBotToken() {
        return botConfig.getToken();
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println("работаю");
    }
}