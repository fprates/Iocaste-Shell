package org.iocaste.shell.servlet;

import org.iocaste.protocol.ServerServlet;

public class Servlet extends ServerServlet {
    private static final long serialVersionUID = 5664214046986778837L;

    @Override
    protected void config() {
        ShellServices shellservices = new ShellServices();
        
        addFunction("get_app_url", shellservices);
    }

}
