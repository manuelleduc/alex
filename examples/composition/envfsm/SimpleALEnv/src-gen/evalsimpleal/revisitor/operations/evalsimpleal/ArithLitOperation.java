package evalsimpleal.revisitor.operations.evalsimpleal;

import evalsimpleal.revisitor.operations.evalsimpleal.ArithOperation;
import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public interface ArithLitOperation extends ArithOperation {
  public abstract int eval(final Env env);
}
