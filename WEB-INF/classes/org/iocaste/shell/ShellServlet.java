package org.iocaste.shell;

import org.iocaste.protocol.Iocaste;
import org.iocaste.protocol.IocasteServlet;

public class ShellServlet extends IocasteServlet {
    private static final long serialVersionUID = 1946889529842250472L;
    
    @Override
    protected void entry() throws Exception {
        Iocaste iocaste = new Iocaste(this);
        
        if (!iocaste.isConnected()) {
            setValue("app_title", "Autenticação");
            setValue("app_url", "logon.jsp");
            
            redirect("shell.jsp");
        }
    }
    
}
