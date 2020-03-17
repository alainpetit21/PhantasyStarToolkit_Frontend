package com.bianisoft.phantasystartoolkit_frontend.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;

@Route(value = "dungeons", layout = MainView.class)
public class DungeonsEditorView extends Div {
    public DungeonsEditorView() {
        add(new Span("DungeonsEditorView content"));
    }
}
