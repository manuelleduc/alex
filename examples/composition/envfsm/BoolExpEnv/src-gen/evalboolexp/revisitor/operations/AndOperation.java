package evalboolexp.revisitor.operations;

import boolExpEnv.runtime.Env;
import evalboolexp.revisitor.operations.ExpOperation;

@SuppressWarnings("all")
public interface AndOperation extends ExpOperation {
  public abstract boolean eval(final Env env);
}
