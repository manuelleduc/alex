package evalexp.revisitor.operations.impl;

import boolexp.Fals;
import boolexp.revisitor.BoolexpRevisitor;
import evalexp.revisitor.operations.AndOperation;
import evalexp.revisitor.operations.ExpOperation;
import evalexp.revisitor.operations.FalsOperation;
import evalexp.revisitor.operations.OrOperation;
import evalexp.revisitor.operations.TruOperation;
import evalexp.revisitor.operations.impl.ExpOperationImpl;

@SuppressWarnings("all")
public class FalsOperationImpl extends ExpOperationImpl implements FalsOperation {
  private Fals self;
  
  private BoolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, OrOperation, TruOperation> alg;
  
  public FalsOperationImpl(final Fals self, final BoolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, OrOperation, TruOperation> alg) {
    super(self, alg);
    this.self = self;
    this.alg = alg;
  }
  
  @Override
  public boolean eval() {
    return false;
  }
}
