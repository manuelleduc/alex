package activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl;

import activitydiagram.Activity;
import activitydiagram.ActivityNode;
import activitydiagram.ActivitydiagramFactory;
import activitydiagram.BooleanValue;
import activitydiagram.Context;
import activitydiagram.InitialNode;
import activitydiagram.InputValue;
import activitydiagram.IntegerValue;
import activitydiagram.Trace;
import activitydiagram.Value;
import activitydiagram.Variable;
import activitydiagram.revisitor.ActivitydiagramRevisitor;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityEdgeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityFinalNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.BooleanValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.BooleanVariableOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ContextOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ControlFlowOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ControlNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ControlTokenOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.DecisionNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExecutableNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExpOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.FinalNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ForkNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ForkedTokenOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.InitialNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.InputOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.InputValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.IntegerValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.IntegerVariableOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.JoinNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.MergeNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedActivityOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.OfferOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.OpaqueActionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.TokenOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.TraceOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.VariableOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.NamedActivityOperationImpl;
import com.google.common.collect.Iterables;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ActivityOperationImpl extends NamedActivityOperationImpl implements ActivityOperation {
  private Activity obj;
  
  private ActivitydiagramRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ContextOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedActivityOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg;
  
  public ActivityOperationImpl(final Activity obj, final ActivitydiagramRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ContextOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedActivityOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void main(final List<InputValue> value) {
    final Context c = ActivitydiagramFactory.eINSTANCE.createContext();
    EList<InputValue> _inputValues = c.getInputValues();
    Iterables.<InputValue>addAll(_inputValues, value);
    c.setActivity(this.obj);
    final Trace trace = ActivitydiagramFactory.eINSTANCE.createTrace();
    c.setOutput(trace);
    if (value!=null) {
      final Consumer<InputValue> _function = (InputValue v) -> {
        v.getVariable().setCurrentValue(v.getValue());
      };
      value.forEach(_function);
    }
    final Consumer<ActivityNode> _function_1 = (ActivityNode n) -> {
      n.setRunning(true);
    };
    this.obj.getNodes().forEach(_function_1);
    this.alg.$(this.obj).execute(c);
  }
  
  @Override
  public void execute(final Context c) {
    final Consumer<Variable> _function = (Variable v) -> {
      this.alg.$(v).init(c);
    };
    this.obj.getLocals().forEach(_function);
    final Function1<ActivityNode, Boolean> _function_1 = (ActivityNode node) -> {
      return Boolean.valueOf((node instanceof InitialNode));
    };
    this.alg.$(((ActivityNode[])Conversions.unwrapArray(IterableExtensions.<ActivityNode>filter(this.obj.getNodes(), _function_1), ActivityNode.class))[0]).execute(c);
    final Function1<ActivityNode, Boolean> _function_2 = (ActivityNode node) -> {
      return Boolean.valueOf(this.alg.$(node).hasOffers());
    };
    Iterable<ActivityNode> list = IterableExtensions.<ActivityNode>filter(this.obj.getNodes(), _function_2);
    while (((list != null) && (IterableExtensions.size(list) > 0))) {
      {
        final ActivityNode exec = IterableExtensions.<ActivityNode>head(list);
        this.alg.$(exec).execute(c);
        final Function1<ActivityNode, Boolean> _function_3 = (ActivityNode node) -> {
          return Boolean.valueOf(this.alg.$(node).hasOffers());
        };
        list = IterableExtensions.<ActivityNode>filter(this.obj.getNodes(), _function_3);
      }
    }
  }
  
  @Override
  public void reset(final Context c) {
    c.setOutput(null);
  }
  
  @Override
  public void writeToFile(final Context c) {
    String text = this.alg.$(this.obj).printTrace(c);
    try {
      String _name = this.obj.getName();
      String _plus = ("trace/" + _name);
      String _plus_1 = (_plus + ".txt");
      File _file = new File(_plus_1);
      FileOutputStream _fileOutputStream = new FileOutputStream(_file);
      OutputStreamWriter _outputStreamWriter = new OutputStreamWriter(_fileOutputStream);
      BufferedWriter writer = new BufferedWriter(_outputStreamWriter);
      writer.write(text);
      writer.close();
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Override
  public String printTrace(final Context c) {
    final StringBuffer text = new StringBuffer();
    final Consumer<ActivityNode> _function = (ActivityNode n) -> {
      text.append(n.getName());
      text.append(System.getProperty("line.separator"));
    };
    c.getOutput().getExecutedNodes().forEach(_function);
    final Consumer<Variable> _function_1 = (Variable v) -> {
      text.append(this.alg.$(v).print());
      text.append(System.getProperty("line.separator"));
    };
    this.obj.getLocals().forEach(_function_1);
    return text.toString();
  }
  
  @Override
  public double getIntegerVariableValue(final String variableName) {
    Value currentValue = this.alg.$(this.obj).getVariableValue(variableName);
    if ((currentValue instanceof IntegerValue)) {
      return ((IntegerValue)currentValue).getValue();
    }
    return (-1);
  }
  
  @Override
  public boolean getBooleanVariableValue(final String variableName) {
    Value currentValue = this.alg.$(this.obj).getVariableValue(variableName);
    if ((currentValue instanceof BooleanValue)) {
      return ((BooleanValue)currentValue).isValue();
    }
    return false;
  }
  
  @Override
  public Value getVariableValue(final String variableName) {
    Variable variable = this.alg.$(this.obj).getVariable(variableName);
    Value currentValue = variable.getCurrentValue();
    return currentValue;
  }
  
  @Override
  public Variable getVariable(final String variableName) {
    ArrayList<Variable> allVariables = CollectionLiterals.<Variable>newArrayList();
    allVariables.addAll(this.obj.getLocals());
    allVariables.addAll(this.obj.getInputs());
    for (final Variable var1 : allVariables) {
      boolean _equals = this.alg.$(var1).name().equals(variableName);
      if (_equals) {
        return var1;
      }
    }
    return null;
  }
  
  @Override
  public void writeTrace(final Context c) {
    this.alg.$(this.obj).writeToFile(c);
    this.alg.$(this.obj).reset(c);
  }
}
