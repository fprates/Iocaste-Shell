package org.iocaste.shell.common;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.iocaste.protocol.IocasteModule;

public abstract class ClientForm extends IocasteModule {
    private static final long serialVersionUID = -8940894134198839819L;
    protected static final int STATUS = 0;
    protected static final int WARN= 1;
    protected static final int ERROR = 2;
    private Shell shell;
    
    public ClientForm() {
        setRequest((HttpServletRequest)FacesContext.
                getCurrentInstance().getExternalContext().getRequest());
        shell = new Shell(this);
    }
    
    /**
     * Executa a aplicação informada.
     * @param appname nome da aplicação
     * @throws Exception
     */
    protected final String getAppAddress(String appname) throws Exception {
        return shell.getAppUrl(appname);
    }
    
    /**
     * 
     * @return
     */
    protected final Shell getShellInstance() {
        return shell;
    }
    
    /**
     * 
     * @param type
     * @param tag
     * @return
     */
    protected final void message(int type, String tag) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        
        ctx.addMessage(null, new FacesMessage(tag));
    }
}