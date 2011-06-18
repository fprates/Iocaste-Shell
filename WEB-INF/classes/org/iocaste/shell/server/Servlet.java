package org.iocaste.shell.server;

import org.iocaste.protocol.ServerServlet;

public class Servlet extends ServerServlet {
    private static final long serialVersionUID = 5664214046986778837L;

    @Override
    protected void config() {
        register(new ShellServices());
        
        setUrl("http://localhost:8080/iocaste-shell/services.html");
    }

}
