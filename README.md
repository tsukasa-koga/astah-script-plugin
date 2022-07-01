Astah Script Plugin
=============================
![dialog image](https://github.com/ChangeVision/astah-script-plugin/raw/master/doc/screenshots/script_dialog.png)

Version
------------
1.0.4

Available for
------------
Astah Community, UML, and Professional 6.5.x or later.
Astah SysML 1.2, Astah GSN 1.0 or later.
Some sample scripts are available only for Astah UML and Professional.
Astah: http://astah.net/

Description
------------
This Plugin enables you to access Astah by Script languages.
You are able to edit and run with ECMAScript(Javascript).

Requirement
------------

How to install
------------
1. Deploy the jar file you downloaded from [Astah Script Plugin](http://astah.change-vision.com/plugins/astah_script_plugin/1.0.4.html), in the **"plugins"** folder.

    e.g.) for Professional edition: 
    `$USER_HOME/.astah/professional/plugins/`
    `/Applications/astah professional/plguins/`
    `C:¥Program Files¥astah-professional¥plugins¥`
    
    e.g.) for Community edition: 
    `$USER_HOME/.astah/community/plugins/`
    `/Applications/astah community/plugins/`
    `C:¥Program Files¥astah-community¥plugins¥`

    e.g.) for SysML edition: 
    `$USER_HOME/.astah/sysml/plugins/`
    `/Applications/astah sysml/plugins/`
    `C:¥Program Files¥astah-sysml¥plugins¥`

2. Start Astah.

3. The [Script...] has been added under the [Tool] menu.

![menu image](https://github.com/ChangeVision/astah-script-plugin/raw/master/doc/screenshots/script_menu.png)

Script example
------------
JavaScript:
```javascript
with(new JavaImporter(
        com.change_vision.jude.api.inf.model)) {
    classes = astah.findElements(IClass.class);
    for(var i in classes) {
        print(classes[i].getName());
    }
}
```
 * Other examples are in the `sample_scripts` directory.
 * Use the following predefined variables in your script.
   * `projectAccessor`
     * It's an object of ProjectAccessor in Astah API.
     * `null` if Astah has no project.
   * `astah`
     * It's same as `projectAccessor`.
   * `astahWindow`
     * It's the main window object of Astah.
   * `scriptWindow`
     * It's the window object of the script plugin.
 * Use the Astah API in your script.
   * Astah API
     * <http://astah.net/features/astah-api>
   * Astah API Javadoc
     * <http://members.change-vision.com/javadoc/astah-api/latest/api/en/doc/javadoc/index.html>
 * Use the Java API in your script.

How to build
------------
1. Install the Astah Plug-in SDK - <http://astah.net/features/sdk>
2. `git clone git://github.com/ChangeVision/astah-script-plugin.git`
3. `cd script`
4. `astah-build`
5. `astah-launch`

 * Generating config to load classpath [for Eclipse](http://astah.net/tutorials/plug-ins/plugin_tutorial_en/html/helloworld.html#eclipse)

      * `astah-mvn eclipse:eclipse`

How to use other script languages
------------
You are able to use other script languages which support OSGi JSR223(experimental).

1. Download jar file for other script languages(ex. groovy-all.jar, jruby-###.jar).
2. Copy the jar file to the Astah plugins folder(<user-home>/.astah/<Astah-edition>/plugins).
3. Start Astah.

License
------------
Copyright 2015 Change Vision, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this work except in compliance with the License.
You may obtain a copy of the License in the LICENSE file, or at:

   <http://www.apache.org/licenses/LICENSE-2.0>

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Third party software licenses
------------
 * RSyntaxTextArea is licensed under modified BSD License.  Please see the included license file.
 * AutoComplete is licensed under modified BSD License.  Please see the included license file.

