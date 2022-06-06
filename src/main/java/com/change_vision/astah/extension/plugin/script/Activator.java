package com.change_vision.astah.extension.plugin.script;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import javax.swing.*;
import java.net.URL;
import java.net.URLClassLoader;

public class Activator implements BundleActivator {
    private ScriptBundleCollector scriptBundleCollector;

    public void start(BundleContext context) {

        scriptBundleCollector = new ScriptBundleCollector(context);
        scriptBundleCollector.startCollecting();
        ScriptViewContext.bundleContext = context;

    }

    public void stop(BundleContext context) {
        scriptBundleCollector.stopCollecting();
    }
}
