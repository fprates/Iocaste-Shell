package org.iocaste.shell;

import org.iocaste.protocol.AbstractFunction;
import org.iocaste.protocol.Message;

public class ShellServices extends AbstractFunction {
    
    /**
     * Retorna url da aplicação informada
     * @param appname nome da aplicação
     * @return url
     */
    private final String getAppUrl(String appname) {
        return "";
    }
    
    @Override
    public Object run(Message message) {
        String id = message.getId();
        
        if (id.equals("get_app_url"))
            return getAppUrl(message.getString("app_name"));
        
        return null;
    }

}
