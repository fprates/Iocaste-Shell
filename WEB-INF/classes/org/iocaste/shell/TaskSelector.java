package org.iocaste.shell;

import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.iocaste.shell.common.ClientForm;
import org.iocaste.shell.common.Shell;
import org.iocaste.shell.common.TaskEntry;

@ManagedBean(name="task_selector")
@RequestScoped
public class TaskSelector extends ClientForm {
    private static final long serialVersionUID = 5243240216263158706L;

    public TaskSelector() throws Exception {
        super();
    }

    public final Collection<TaskEntry> getItems() throws Exception {
        Shell shell = getShellInstance();
        
        return shell.getTaskEntries();
    }

}
