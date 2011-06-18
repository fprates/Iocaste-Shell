package org.iocaste.shell.common;

import java.io.Serializable;

public class TaskEntry implements Serializable {
    private static final long serialVersionUID = -6311717065350246035L;
    private String url;
    private String text;
    
    public TaskEntry(String url, String text) {
        this.url = url;
        this.text = text;
    }
    
    /**
     * @return the url
     */
    public final String getUrl() {
        return url;
    }
    /**
     * @return the text
     */
    public final String getText() {
        return text;
    }
    
    /**
     * @param url the url to set
     */
    public final void setUrl(String url) {
        this.url = url;
    }
    /**
     * @param text the text to set
     */
    public final void setText(String text) {
        this.text = text;
    }
    
    
}
