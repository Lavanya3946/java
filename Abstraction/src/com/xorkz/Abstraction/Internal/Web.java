package com.xorkz.Abstraction.Internal;

public  abstract class Web {
    protected String version;


    public Web(String version){
        this.version=version;
    }
     public abstract void autoConnect();

    @Override
    public String toString() {
        return "version: "+version;
    }
}
