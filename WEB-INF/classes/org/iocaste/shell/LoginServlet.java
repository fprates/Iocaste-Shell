package org.iocaste.shell;

import org.iocaste.protocol.Iocaste;
import org.iocaste.shell.common.ClientServlet;

public class LoginServlet extends ClientServlet {
    private static final long serialVersionUID = 1946889529842250472L;
    
    @Override
    protected void entry() throws Exception {
        Iocaste iocaste = new Iocaste(this);
        
        if (iocaste.login(getValue("user"), getValue("secret"))) {
            execute("task_selector");
        } else {
            message(ERROR, "invalid.login");
        }
    }
    
}
