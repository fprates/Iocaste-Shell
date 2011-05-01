package org.iocaste.shell.server;

import java.io.Serializable;

public class Task implements Serializable {
    private static final long serialVersionUID = -4499449183954319356L;
    private String appName;
    private String url;
    
    /*
     * 
     * Getters
     * 
     */
    
    /**
     * @return the appName
     */
    public String getAppName() {
        return appName;
    }
    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }
    
    /*
     * 
     * Setters
     * 
     */
    
    /**
     * @param appName the appName to set
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }
    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
    
}
