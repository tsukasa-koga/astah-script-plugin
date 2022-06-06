package com.change_vision.astah.extension.plugin.script;

import javax.swing.JOptionPane;

import com.change_vision.astah.extension.plugin.script.util.Messages;
import com.change_vision.jude.api.inf.ui.IPluginActionDelegate;
import com.change_vision.jude.api.inf.ui.IWindow;

import java.io.Console;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ShowScriptViewAction implements IPluginActionDelegate {

    public Object run(IWindow window) throws UnExpectedException {

        try {
            ScriptView.getInstance().show(window);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(window.getParent(),
                    Messages.getMessage("message.unknown_error"), "Alert",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            throw new UnExpectedException();
        }
        return null;
    }

}
