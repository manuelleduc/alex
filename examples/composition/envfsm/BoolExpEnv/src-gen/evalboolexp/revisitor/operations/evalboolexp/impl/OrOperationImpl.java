package evalboolexp.revisitor.operations.evalboolexp.impl;

import boolExpEnv.Or;
import boolExpEnv.revisitor.BoolExpEnvRevisitor;
import boolExpEnv.runtime.Env;
import evalboolexp.revisitor.operations.evalboolexp.AndOperation;
import evalboolexp.revisitor.operations.evalboolexp.BinExpOperation;
import evalboolexp.revisitor.operations.evalboolexp.ExpOperation;
import evalboolexp.revisitor.operations.evalboolexp.FalsOperation;
import evalboolexp.revisitor.operations.evalboolexp.LitOperation;
import evalboolexp.revisitor.operations.evalboolexp.NotOperation;
import evalboolexp.revisitor.operations.evalboolexp.OrOperation;
import evalboolexp.revisitor.operations.evalboolexp.TruOperation;
import evalboolexp.revisitor.operations.evalboolexp.VarRefOperation;

@SuppressWarnings("all")
public class OrOperationImpl implements OrOperation {
  private Or obj;
  
  private BoolExpEnvRevisitor<? extends AndOperation, ? extends BinExpOperation, ? extends ExpOperation, ? extends FalsOperation, ? extends LitOperation, ? extends NotOperation, ? extends OrOperation, ? extends TruOperation, ? extends VarRefOperation> alg;
  
  public OrOperationImpl(final Or obj, final BoolExpEnvRevisitor<? extends AndOperation, ? extends BinExpOperation, ? extends ExpOperation, ? extends FalsOperation, ? extends LitOperation, ? extends NotOperation, ? extends OrOperation, ? extends TruOperation, ? extends VarRefOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public boolean eval(final Env env) {
    return (this.alg.$(this.obj.getLhs()).eval(env) || this.alg.$(this.obj.getRhs()).eval(env));
  }
}
