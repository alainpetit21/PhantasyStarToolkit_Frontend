package com.bianisoft.phantasystartoolkit.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.charts.model.HorizontalAlign;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.listbox.ListBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;

import java.io.ByteArrayInputStream;

@Route(value = "monsters", layout = MainView.class)
public class MonsterEditorView extends Div {
    public MonsterEditorView() {

        //Creation
        //Main Split View
        SplitLayout layout = new SplitLayout();
        layout.setOrientation(SplitLayout.Orientation.HORIZONTAL);

        //Left side of the split
        ListBox<String> listBox = new ListBox<>();
        listBox.setItems("SWORM", "SCORPIO", "G.SCORPI", "SKELETON");
        listBox.setValue("SWORM");
        listBox.setWidth("15%");

        //Right Side of the Split
        //Span span = new Span("MonsterEditorView content");
        //span.setWidth("75%");
        FormLayout layoutWithBinder = new FormLayout();

        TextField name = new TextField("Name");
        NumberField hp = new NumberField("HP");                 hp.setMin(0);           hp.setMax(255);
        NumberField atk = new NumberField("ATK");               atk.setMin(0);          atk.setMax(255);
        NumberField def = new NumberField("DEF");               def.setMin(0);          def.setMax(255);
        NumberField meseta = new NumberField("MESETA");         meseta.setMin(0);       meseta.setMax(65535);
        NumberField exp = new NumberField("EXP");               exp.setMin(0);          exp.setMax(65535);
        NumberField item = new NumberField("Item");             item.setMin(0);         item.setMax(255);
        NumberField chance_trap = new NumberField("Trap %");    chance_trap.setMin(0);  chance_trap.setMax(100);
        NumberField chance_run = new NumberField("Run %");      chance_run.setMin(0);   chance_run.setMax(100);

        Button bt_save = new Button("Save");
        Button bt_reset = new Button("Reset");
        bt_save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        chance_trap.setSuffixComponent(new Span("%"));
        chance_run.setSuffixComponent(new Span("%"));


        //byte[] imageBytes = new byte[256*256];
        //StreamResource resource = new StreamResource("dummyImageName.jpg", () -> new ByteArrayInputStream(imageBytes));
        //Image image_monster = new Image(resource, "dummy image");
        Image image_monster = new Image("https://dummyimage.com/256x256/000/fff.png", "dummy image");
        Button edit_image = new Button("Edit");
        edit_image.addThemeVariants(ButtonVariant.LUMO_SMALL);

        VerticalLayout right_level1 = new VerticalLayout();
        HorizontalLayout right_down_level2 = new HorizontalLayout();
        HorizontalLayout right_up_level2 = new HorizontalLayout();
        VerticalLayout right_up_left_level3 = new VerticalLayout();
        VerticalLayout right_up_right_level3 = new VerticalLayout();
        VerticalLayout right_up_right2_level3 = new VerticalLayout();

        right_up_left_level3.add(image_monster);
        right_up_left_level3.add(edit_image);
        right_up_left_level3.add(meseta);
        right_up_left_level3.add(exp);

        right_up_right_level3.add(name);
        right_up_right_level3.add(hp);
        right_up_right_level3.add(atk);
        right_up_right_level3.add(def);
        right_up_right2_level3.add(item);
        right_up_right2_level3.add(chance_trap);
        right_up_right2_level3.add(chance_run);


        //Linking internal Right
        right_down_level2.add(bt_save, bt_reset);
        right_up_level2.add(right_up_left_level3, right_up_right_level3, right_up_right2_level3);

        right_level1.add(right_up_level2);
        right_level1.add(right_down_level2);
        //Span span = new Span("MonsterEditorView content");


        //Linking Left and right
        layout.addToPrimary(listBox);
        layout.addToSecondary(right_level1);

        add(layout);
    }
}
