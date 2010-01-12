package com.calclab.hablar.client.chat;

import com.calclab.hablar.client.chat.ChatView.MessageType;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ChatMessage extends Composite {

    interface ChatMessageUiBinder extends UiBinder<Widget, ChatMessage> {
    }

    private static ChatMessageUiBinder uiBinder = GWT.create(ChatMessageUiBinder.class);

    @UiField
    SpanElement author;
    @UiField
    SpanElement body;

    public ChatMessage(String name, String body, MessageType type) {
	initWidget(uiBinder.createAndBindUi(this));
	this.author.setInnerText(name + ": ");
	this.body.setInnerText(body);
    }

}