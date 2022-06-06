package com.change_vision.astah.extension.plugin.script;

class ScriptAwareClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return getClass().getClassLoader().loadClass(name);
    }

}