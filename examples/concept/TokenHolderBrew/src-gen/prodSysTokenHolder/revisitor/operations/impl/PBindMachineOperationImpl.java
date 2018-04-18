package prodSysTokenHolder.revisitor.operations.impl;

import java.util.List;
import prodSysBlank.revisitor.operations.ConveyorOperation;
import prodSysBlank.revisitor.operations.MachineOperation;
import prodSysBlank.revisitor.operations.RootOperation;
import prodSysTokenHolder.PBindMachine;
import prodSysTokenHolder.revisitor.ProdSysTokenHolderRevisitor;
import prodSysTokenHolder.revisitor.operations.HBindConveyorOperation;
import prodSysTokenHolder.revisitor.operations.PBindMachineOperation;
import prodSysTokenHolder.revisitor.operations.RBindRootOperation;
import tokenHolder.H;
import tokenHolder.T;
import tokenholderexec.revisitor.operations.HOperation;
import tokenholderexec.revisitor.operations.POperation;
import tokenholderexec.revisitor.operations.ROperation;
import tokenholderexec.revisitor.operations.impl.POperationImpl;

@SuppressWarnings("all")
public class PBindMachineOperationImpl extends POperationImpl implements PBindMachineOperation {
  private PBindMachine obj;
  
  private ProdSysTokenHolderRevisitor<ConveyorOperation, HOperation, HBindConveyorOperation, MachineOperation, POperation, PBindMachineOperation, Object, ROperation, RBindRootOperation, RootOperation, Object, Object> alg;
  
  public PBindMachineOperationImpl(final PBindMachine obj, final ProdSysTokenHolderRevisitor<ConveyorOperation, HOperation, HBindConveyorOperation, MachineOperation, POperation, PBindMachineOperation, Object, ROperation, RBindRootOperation, RootOperation, Object, Object> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public List<H> outHolders() {
    converters.PBindMachineOutHolderToGetOutC convert =  new converters.PBindMachineOutHolderToGetOutC();
    
    convert.doInit();
    
    java.util.List<tokenHolder.H> res = convert.convertReturn(alg.$(obj.getDelegate()).getOutC());
    
    
    return res;
  }
  
  @Override
  public List<H> inHolders() {
    converters.PBindMachineInHolderstoGetInC convert =  new converters.PBindMachineInHolderstoGetInC();
    
    convert.doInit();
    
    java.util.List<tokenHolder.H> res = convert.convertReturn(alg.$(obj.getDelegate()).getInC());
    
    
    return res;
  }
  
  @Override
  public T createToken() {
    converters.PBindMachineCreateTokenToCreateToken convert =  new converters.PBindMachineCreateTokenToCreateToken();
    
    convert.doInit();
    
    tokenHolder.T res = convert.convertReturn(alg.$(obj.getDelegate()).createToken());
    
    
    return res;
  }
}