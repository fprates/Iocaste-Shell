package org.iocaste.shell.server;

import java.util.LinkedList;
import java.util.List;

import org.iocaste.protocol.AbstractFunction;
import org.iocaste.protocol.Message;
import org.iocaste.shell.common.TaskEntry;

public class ShellServices extends AbstractFunction {
    private List<TaskEntry> entries;
    
    public ShellServices() {
        entries = new LinkedList<TaskEntry>();
        
        entries.add(new TaskEntry("teste1.xhtml", "Teste1"));
        entries.add(new TaskEntry("teste2.xhtml", "Teste2"));
        
        export("get_app_url", "getAppUrl");
        export("get_task_entries", "getTaskEntries");
    }
    
    /**
     * Retorna url da aplicação informada
     * @param appname nome da aplicação
     * @return url
     */
    public final String getAppUrl(Message message) {
        Task task = (Task)load(Task.class, message.getString("app_name"));
        
        return task.getUrl().trim();
    }
    
    public final List<TaskEntry> getTaskEntries(Message message) {
        return entries;
    }

}
