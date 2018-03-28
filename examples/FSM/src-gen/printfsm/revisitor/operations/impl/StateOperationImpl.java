package printfsm.revisitor.operations.impl;

import fsm.State;
import fsm.Transition;
import fsm.revisitor.FsmRevisitor;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import printfsm.revisitor.operations.MachineOperation;
import printfsm.revisitor.operations.StateOperation;
import printfsm.revisitor.operations.TransitionOperation;

@SuppressWarnings("all")
public class StateOperationImpl implements StateOperation {
  private State self;
  
  private FsmRevisitor<StateOperation, StateOperation, MachineOperation, StateOperation, TransitionOperation> alg;
  
  public StateOperationImpl(final State self, final FsmRevisitor<StateOperation, StateOperation, MachineOperation, StateOperation, TransitionOperation> alg) {
    this.self = self;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _name = this.self.getName();
    String _plus = ("  State " + _name);
    String _plus_1 = (_plus + "\n");
    final Function1<Transition, String> _function = (Transition t) -> {
      return this.alg.$(t).print();
    };
    String _join = IterableExtensions.join(ListExtensions.<Transition, String>map(this.self.getOutgoing(), _function), "\n");
    return (_plus_1 + _join);
  }
}
