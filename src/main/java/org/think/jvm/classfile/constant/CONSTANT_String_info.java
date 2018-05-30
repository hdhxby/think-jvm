package org.think.jvm.classfile.constant;

import org.think.jvm.classfile.ClassFileReader;
import org.think.jvm.classfile.ConstantPool;
import org.think.jvm.classfile.CPInfo;

import java.io.IOException;

/**
 * @see com.sun.tools.classfile.ConstantPool.CONSTANT_String_info
 * @see org.apache.bcel.classfile.ConstantString
 * @author lixiaobin
 * @since 2017/3/24
 */
public class CONSTANT_String_info extends CPInfo {
    private int string_index;
    public CONSTANT_String_info(ConstantPool constantPool, ClassFileReader classFileReader) throws IOException{
        super(constantPool,CONSTANT_String);
        this.string_index = classFileReader.readUnsignedShort();
    }

    @Override
    public Object getConstantValue() {
        return cp.get(string_index);
    }

    @Override
    public String toString() {
        return cp.get(string_index).toString();
    }
}