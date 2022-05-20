//This script writes out all the classifiers in the current Astah project.
importPackage(com.change_vision.jude.api.inf.model);
classes = astah.findElements(IClass);
for(var i in classes) {
    print(classes[i].getName());
}
