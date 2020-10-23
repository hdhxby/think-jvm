package org.think.jvm.instructions.load;

import org.think.jvm.Visitor;
import org.think.jvm.instructions.base.NoOperandsInstruction;

/*
*将第一个float型局部变量推送至栈顶
*@author lixiaobin
*/
public class FLOAD_0 extends NoOperandsInstruction {
    @Override
    public void execute(Visitor visitor) {
        Float value = visitor.getFrame().getLocalVars().getFloat(0);
        log.debug(value);
        visitor.getFrame().getStack().pushFloat(value);
    }
}