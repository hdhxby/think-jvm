package org.think.jvm.classfile.attribute;

import org.think.jvm.classfile.Attribute;
import org.think.jvm.classfile.ClassFileReader;

import java.io.IOException;

/**
 * @see com.sun.tools.classfile.LocalVariableTypeTable_attribute
 * @author lixiaobin
 * @since 2017/3/24
 */
public class LocalVariableTypeTable_attribute extends Attribute {

    public LocalVariableTypeTable_attribute(ClassFileReader classFileReader, int attribute_name_index, int attribute_length) throws IOException {
        super(attribute_name_index,attribute_length);
    }

}
