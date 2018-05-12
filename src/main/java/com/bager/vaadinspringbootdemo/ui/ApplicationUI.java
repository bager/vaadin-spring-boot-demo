package com.bager.vaadinspringbootdemo.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
@Theme("valo")
public class ApplicationUI extends UI {
	
	private VerticalLayout layout;

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		setupLayout();

		layout.addComponent(new Label("Hello World!"));
		layout.addComponent(new Button("Push Me!", click -> Notification.show("Pushed")));
		
		TextField nameInput = new TextField("Your name", "Blazej");
		layout.addComponent(nameInput);
		layout.addComponent(new Button("Push Me!", click -> {
			Notification.show("Hello " + nameInput.getValue(), Type.WARNING_MESSAGE);
		}));
	}

	private void setupLayout() {
		layout = new VerticalLayout();
		layout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
		setContent(layout);
	}

}