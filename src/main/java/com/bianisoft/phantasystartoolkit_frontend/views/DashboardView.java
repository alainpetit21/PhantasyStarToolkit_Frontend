package com.bianisoft.phantasystartoolkit_frontend.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;

@Route(value = "dashboard", layout = MainView.class)
public class DashboardView extends Div {
    public DashboardView() {
        add(new Span("DashboardView content"));
    }
}
