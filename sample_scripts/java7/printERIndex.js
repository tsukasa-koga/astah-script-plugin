//This script writes out all the indexs of ER Entities
//in the current Astah project.
JavaImporter(com.change_vision.jude.api.inf.model);
var entities = astah.findElements(IEREntity);
for(var i in entities) {
    var entity = entities[i];
    var indexList = entity.getERIndices();
    if (indexList.length > 0) {
        println('ENTITY: ' + entity.getName());
        for(var j in indexList) {
            var index = indexList[j];
            //print index
            print('  INDEX[' + j + ']: ' + index.getName());
            print(', ' + index.getKind());
            if (index.isUnique()) print(', unique');
            println('');
            
            //print attributes
            var attributes = index.getERAttributes();
            for(var k in attributes) {
                var attribute = attributes[k];
                println('    ATTR[' + k + ']: ' + attribute.getName());
            }
        }
        println('');
    }
}
