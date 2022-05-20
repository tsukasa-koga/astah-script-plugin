load('nashorn:mozilla_compat.js');

importPackage(com.change_vision.jude.api.inf.model);
classes = astah.findElements(IClass);
print('Class # = ' + classes.length);
