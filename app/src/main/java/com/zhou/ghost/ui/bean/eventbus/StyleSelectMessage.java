package com.zhou.ghost.ui.bean.eventbus;

public class StyleSelectMessage {
    private String style;

    public StyleSelectMessage(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
