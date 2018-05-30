package org.think.jvm.instructions.comparison;

import org.think.jvm.Visitor;
import org.think.jvm.instructions.base.BranchInstruction;

/*
*当栈顶int型数值小于等于0时跳转
*@author lixiaobin
*/
public class IFLE extends BranchInstruction {
    @Override
    public void execute(Visitor visitor){
        super.execute(visitor);
        Integer value = visitor.getFrame().getStack().popInt();
        if(value <= 0){
            branch(visitor);
        }
    }
}
