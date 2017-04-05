package com.example;

/**
 * Created by IntelliJ IDEA.
 * Date: 4/5/17
 * Time: 12:15 PM
 *
 * @author Gary Clayburg
 */
public class StudioReader {

    private Studio wiredstudio;

    public String getMessage(){
        return wiredstudio.getAreacode();
    }

    public StudioReader setWiredstudio(Studio studio) {
        this.wiredstudio = studio;
        return this;
    }
}
