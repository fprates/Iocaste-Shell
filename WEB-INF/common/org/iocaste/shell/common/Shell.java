package org.iocaste.shell.common;
import java.io.IOException;

import org.iocaste.protocol.AbstractServiceInterface;
import org.iocaste.protocol.IocasteServlet;

public class Shell extends AbstractServiceInterface {
    
    public Shell(IocasteServlet servlet) throws IOException {
        initService(servlet, "http://localhost:8080/iocaste-shell/index.jsp");
    }
}
