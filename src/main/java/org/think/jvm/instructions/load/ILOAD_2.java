package org.think.jvm.instructions.load;

import org.think.jvm.instructions.Instruction;
import org.think.jvm.Visitor;

/*
*将第三个int型局部变量推送至栈顶
*@author lixiaobin
*/
public class ILOAD_2 extends Instruction {
    @Override
    public void execute(Visitor visitor){
        Integer value = visitor.getFrame().getLocalVars().getInt(2);
        log.debug(value);
        visitor.getFrame().getStack().pushInt(value);
    }
}
