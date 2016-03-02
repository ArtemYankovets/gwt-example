package ua.borman.web.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;

/**
 * Created by Artem on 02.03.2016.
 */
public class Example implements EntryPoint {
    int value = 0;

    public void onModuleLoad() {
        Button button = new Button("кнопка2");
        RootPanel.get().add(button);

        button.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                GenService.App.getInstance().generate(new AsyncCallback<Integer>() {
                    @Override
                    public void onFailure(Throwable caught) {

                    }

                    @Override
                    public void onSuccess(Integer result) {
                        Window.alert("" + result);
                    }
                });
            }
        });
    }
}
