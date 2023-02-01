package org.sibernetik.fooda.views.helloworld;

import com.google.common.util.concurrent.Service;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import javax.annotation.security.PermitAll;

import org.sibernetik.fooda.services.ServiceB;

import com.vaadin.flow.component.dependency.CssImport;

@PageTitle("Hello World")
@Route(value = "hello")
@RouteAlias(value = "")
@PermitAll
public class HelloWorldView extends HorizontalLayout {

    private final TextField name;
    private final Button sayHello;
    private final ServiceB serviceB;

    public HelloWorldView(ServiceB serviceB) {

        this.serviceB = serviceB;

        name = new TextField("Your name");
        sayHello = new Button("Say hello");
        sayHello.addClickListener(e -> {
            Notification.show(serviceB.greeting(name.getValue()).getContent());
        });
        sayHello.addClickShortcut(Key.ENTER);

        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);

        add(name, sayHello);
    }

}
