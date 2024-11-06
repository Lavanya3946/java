package com.xorkz.Abstraction.Internal;

public class GlueWeb extends Web{
    public GlueWeb(String version){
        super(version);

    }

    @Override
    public void autoConnect() {
        System.out.println("autoConnect running in Glueweb..");
    }
}
