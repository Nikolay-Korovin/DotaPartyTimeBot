package com.example.dotapartytimebot.telegram.enums;

/**
 * Названия кнопок основной клавиатуры
 */
public enum ButtonNameEnum {
    TEST("TEST");

    private final String buttonName;

    ButtonNameEnum(String buttonName) {
        this.buttonName = buttonName;
    }

    public String getButtonName() {
        return buttonName;
    }
}