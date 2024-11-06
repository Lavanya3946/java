package com.xorkz.Abstraction.Runner;

import com.xorkz.Abstraction.Internal.GlueWeb;
import com.xorkz.Abstraction.Internal.Web;

public class WebRunner {
    public static void main(String[] args) {
        Web web=new GlueWeb("1.0;");
        web.autoConnect();
        System.out.println(web);
    }
}
