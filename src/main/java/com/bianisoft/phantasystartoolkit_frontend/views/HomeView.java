package com.bianisoft.phantasystartoolkit_frontend.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = MainView.class)
public class HomeView extends Div {
    public HomeView() {
        add(new Span("HomeView content"));
    }
}
