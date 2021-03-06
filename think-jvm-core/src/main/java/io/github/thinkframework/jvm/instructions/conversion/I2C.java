package io.github.thinkframework.jvm.instructions.conversion;

import io.github.thinkframework.jvm.Visitor;
import io.github.thinkframework.jvm.instructions.base.NoOperandsInstruction;

/*
*将栈顶int型数值强制转换成char型数值并将结果压入栈顶
*@author lixiaobin
*/
public class I2C extends NoOperandsInstruction {
    @Override
    public void execute(Visitor visitor){
        super.execute(visitor);
        Character value = (char)visitor.getFrame().getStack().popInt().intValue();
        visitor.getFrame().getStack().pushChar(value);
    }
}
