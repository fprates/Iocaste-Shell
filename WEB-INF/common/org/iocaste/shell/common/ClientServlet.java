package org.iocaste.shell.common;

import org.iocaste.protocol.IocasteServlet;

public abstract class ClientServlet extends IocasteServlet {
    private static final long serialVersionUID = -8940894134198839819L;
    protected static final int STATUS = 0;
    protected static final int WARN= 1;
    protected static final int ERROR = 2;
    
    protected final void execute(String appname) {
        
    }
    
    protected final void message(int type, String tag) {
        
    }
}