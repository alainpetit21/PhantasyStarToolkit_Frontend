package com.bianisoft.phantasystartoolkit_frontend.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;

@Route(value = "about", layout = MainView.class)
public class AboutView extends Div {
    public AboutView() {
        add(new Span("AboutView content"));
    }
}
