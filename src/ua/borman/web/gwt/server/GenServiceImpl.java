package ua.borman.web.gwt.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import ua.borman.web.gwt.client.GenService;

/**
 * Created by Artem on 02.03.2016.
 */
public class GenServiceImpl extends RemoteServiceServlet implements GenService {

    public Integer generate() {
        return (int) (Math.random() * 10000);
    }
}