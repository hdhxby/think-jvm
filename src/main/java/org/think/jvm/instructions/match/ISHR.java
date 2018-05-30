package org.think.jvm.instructions.match;

import org.think.jvm.Visitor;
import org.think.jvm.instructions.base.NoOperandsInstruction;

/*
*将int型数值右(有符号)移位指定位数并将结果压入栈顶
*@author lixiaobin
*/
public class ISHR extends NoOperandsInstruction {
    @Override
    public void execute(Visitor visitor) {
        super.execute(visitor);
        Integer v2 = visitor.getFrame().getStack().popInt();
        Integer v1 = visitor.getFrame().getStack().popInt();
        Integer result = v1 + v2;
        visitor.getFrame().getStack().pushInt(result);
    }
}