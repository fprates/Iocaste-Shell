package org.iocaste.shell.common;

import org.iocaste.protocol.IocasteServlet;

public abstract class ClientServlet extends IocasteServlet {
    private static final long serialVersionUID = -8940894134198839819L;
    protected static final int STATUS = 0;
    protected static final int WARN= 1;
    protected static final int ERROR = 2;
    private Shell shell;
    
    protected final void entry() throws Exception {
        shell = new Shell(this);
        appEntry();
    }
    
    /**
     * Ponto de entrada da aplicação
     * @throws Exception
     */
    protected abstract void appEntry() throws Exception;
    
    /**
     * Executa a aplicação informada.
     * @param appname nome da aplicação
     * @throws Exception
     */
    protected final void execute(String appname) throws Exception {
        setValue("app_url", shell.getAppUrl(appname));
        redirect("shell.jsp");
    }
    
    protected final void message(int type, String tag) {
        
    }
}