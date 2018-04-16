package pongsem.revisitor.operations.impl;

import org.eclipse.xtext.xbase.lib.InputOutput;
import pong.PPong;
import pong.revisitor.PongRevisitor;
import pongsem.revisitor.operations.PPingOperation;
import pongsem.revisitor.operations.PPongOperation;

@SuppressWarnings("all")
public class PPongOperationImpl implements PPongOperation {
  private PPong obj;
  
  private PongRevisitor<PPingOperation, PPongOperation> alg;
  
  public PPongOperationImpl(final PPong obj, final PongRevisitor<PPingOperation, PPongOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void exec() {
    InputOutput.<String>println("Pong");
    this.alg.$(this.obj.getPping()).decrement();
  }
}
