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
        
        export("get_app_url");
        export("get_task_entries");
    }
    
    /**
     * Retorna url da aplicação informada
     * @param appname nome da aplicação
     * @return url
     */
    private final String getAppUrl(String appname) {
        Task task = (Task)load(Task.class, appname);
        
        return task.getUrl().trim();
    }
    
    private final List<TaskEntry> getTaskEntries() {
        return entries;
    }
    
    @Override
    public Object run(Message message) {
        String id = message.getId();
        
        if (id.equals("get_app_url"))
            return getAppUrl(message.getString("app_name"));
        
        if (id.equals("get_task_entries"))
            return getTaskEntries();
        
        return null;
    }

}
