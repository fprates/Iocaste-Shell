package org.iocaste.shell.common;
import java.io.IOException;

import org.iocaste.protocol.AbstractServiceInterface;
import org.iocaste.protocol.IocasteServlet;
import org.iocaste.protocol.Message;

public class Shell extends AbstractServiceInterface {
    
    public Shell(IocasteServlet servlet) throws IOException {
        initService(servlet, "http://localhost:8080/iocaste-shell/services.html");
    }
    
    /**
     * Retorna a url de uma aplicação cadastrada
     * @param appname nome da aplicação
     * @return url da aplicação
     * @throws Exception
     */
    public final String getAppUrl(String appname) throws Exception {
        Message message = new Message();
        
        message.setId("get_app_url");
        message.add("app_name", appname);
        
        return (String)call(message);
    }
}
