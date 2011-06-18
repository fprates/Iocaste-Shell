package org.iocaste.shell.common;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.iocaste.protocol.AbstractServiceInterface;
import org.iocaste.protocol.Message;
import org.iocaste.protocol.Module;

public class Shell extends AbstractServiceInterface {
    
    /**
     * 
     * @param module
     * @throws IOException
     */
    public Shell(Module module) throws Exception {
        initService(module, "http://localhost:8080/iocaste-shell/services.html");
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
    
    public List<TaskEntry> getTaskEntries()throws Exception {
        List<?> list;
        List<TaskEntry> entries;
        Message message = new Message();
        
        message.setId("get_task_entries");
        
        list = (List<?>)call(message);
        if (list == null)
            return null;
        
        entries = new LinkedList<TaskEntry>();
        
        for (Object entry : list)
            entries.add((TaskEntry)entry);
        
        return entries;
    }
}
