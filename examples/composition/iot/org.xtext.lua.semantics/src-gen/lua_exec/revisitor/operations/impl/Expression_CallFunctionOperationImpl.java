package lua_exec.revisitor.operations.impl;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import lua.revisitor.LuaRevisitor;
import lua_exec.revisitor.operations.BlockOperation;
import lua_exec.revisitor.operations.ChunkOperation;
import lua_exec.revisitor.operations.ExpressionOperation;
import lua_exec.revisitor.operations.Expression_AccessArrayOperation;
import lua_exec.revisitor.operations.Expression_AccessMemberOperation;
import lua_exec.revisitor.operations.Expression_AndOperation;
import lua_exec.revisitor.operations.Expression_CallFunctionOperation;
import lua_exec.revisitor.operations.Expression_CallMemberFunctionOperation;
import lua_exec.revisitor.operations.Expression_ConcatenationOperation;
import lua_exec.revisitor.operations.Expression_DivisionOperation;
import lua_exec.revisitor.operations.Expression_EqualOperation;
import lua_exec.revisitor.operations.Expression_ExponentiationOperation;
import lua_exec.revisitor.operations.Expression_FalseOperation;
import lua_exec.revisitor.operations.Expression_FunctionOperation;
import lua_exec.revisitor.operations.Expression_InvertOperation;
import lua_exec.revisitor.operations.Expression_LargerOperation;
import lua_exec.revisitor.operations.Expression_Larger_EqualOperation;
import lua_exec.revisitor.operations.Expression_LengthOperation;
import lua_exec.revisitor.operations.Expression_MinusOperation;
import lua_exec.revisitor.operations.Expression_ModuloOperation;
import lua_exec.revisitor.operations.Expression_MultiplicationOperation;
import lua_exec.revisitor.operations.Expression_NegateOperation;
import lua_exec.revisitor.operations.Expression_NilOperation;
import lua_exec.revisitor.operations.Expression_Not_EqualOperation;
import lua_exec.revisitor.operations.Expression_NumberOperation;
import lua_exec.revisitor.operations.Expression_OrOperation;
import lua_exec.revisitor.operations.Expression_PlusOperation;
import lua_exec.revisitor.operations.Expression_SmallerOperation;
import lua_exec.revisitor.operations.Expression_Smaller_EqualOperation;
import lua_exec.revisitor.operations.Expression_StringOperation;
import lua_exec.revisitor.operations.Expression_TableConstructorOperation;
import lua_exec.revisitor.operations.Expression_TrueOperation;
import lua_exec.revisitor.operations.Expression_VarArgsOperation;
import lua_exec.revisitor.operations.Expression_VariableNameOperation;
import lua_exec.revisitor.operations.FieldOperation;
import lua_exec.revisitor.operations.Field_AddEntryToTableOperation;
import lua_exec.revisitor.operations.Field_AddEntryToTable_BracketsOperation;
import lua_exec.revisitor.operations.Field_AppendEntryToTableOperation;
import lua_exec.revisitor.operations.FunctionOperation;
import lua_exec.revisitor.operations.Functioncall_ArgumentsOperation;
import lua_exec.revisitor.operations.LastStatementOperation;
import lua_exec.revisitor.operations.LastStatement_BreakOperation;
import lua_exec.revisitor.operations.LastStatement_ReturnOperation;
import lua_exec.revisitor.operations.LastStatement_ReturnWithValueOperation;
import lua_exec.revisitor.operations.StatementOperation;
import lua_exec.revisitor.operations.Statement_AssignmentOperation;
import lua_exec.revisitor.operations.Statement_BlockOperation;
import lua_exec.revisitor.operations.Statement_CallFunctionOperation;
import lua_exec.revisitor.operations.Statement_CallMemberFunctionOperation;
import lua_exec.revisitor.operations.Statement_For_GenericOperation;
import lua_exec.revisitor.operations.Statement_For_NumericOperation;
import lua_exec.revisitor.operations.Statement_FunctioncallOrAssignmentOperation;
import lua_exec.revisitor.operations.Statement_GlobalFunction_DeclarationOperation;
import lua_exec.revisitor.operations.Statement_If_Then_ElseOperation;
import lua_exec.revisitor.operations.Statement_If_Then_Else_ElseIfPartOperation;
import lua_exec.revisitor.operations.Statement_LocalFunction_DeclarationOperation;
import lua_exec.revisitor.operations.Statement_Local_Variable_DeclarationOperation;
import lua_exec.revisitor.operations.Statement_RepeatOperation;
import lua_exec.revisitor.operations.Statement_WhileOperation;
import lua_exec.revisitor.operations.impl.ExpressionOperationImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.xtext.lua.lua.Expression;
import org.xtext.lua.lua.Expression_CallFunction;
import org.xtext.lua.lua.Expression_VariableName;
import org.xtext.lua.lua.Function;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public class Expression_CallFunctionOperationImpl extends ExpressionOperationImpl implements Expression_CallFunctionOperation {
  private Expression_CallFunction obj;
  
  private LuaRevisitor<BlockOperation, ChunkOperation, ExpressionOperation, Expression_AccessArrayOperation, Expression_AccessMemberOperation, Expression_AndOperation, Expression_CallFunctionOperation, Expression_CallMemberFunctionOperation, Expression_ConcatenationOperation, Expression_DivisionOperation, Expression_EqualOperation, Expression_ExponentiationOperation, Expression_FalseOperation, Expression_FunctionOperation, Expression_InvertOperation, Expression_LargerOperation, Expression_Larger_EqualOperation, Expression_LengthOperation, Expression_MinusOperation, Expression_ModuloOperation, Expression_MultiplicationOperation, Expression_NegateOperation, Expression_NilOperation, Expression_Not_EqualOperation, Expression_NumberOperation, Expression_OrOperation, Expression_PlusOperation, Expression_SmallerOperation, Expression_Smaller_EqualOperation, Expression_StringOperation, Expression_TableConstructorOperation, Expression_TrueOperation, Expression_VarArgsOperation, Expression_VariableNameOperation, FieldOperation, Field_AddEntryToTableOperation, Field_AddEntryToTable_BracketsOperation, Field_AppendEntryToTableOperation, FunctionOperation, Functioncall_ArgumentsOperation, LastStatementOperation, LastStatement_BreakOperation, LastStatement_ReturnOperation, LastStatement_ReturnWithValueOperation, StatementOperation, Statement_AssignmentOperation, Statement_BlockOperation, Statement_CallFunctionOperation, Statement_CallMemberFunctionOperation, Statement_For_GenericOperation, Statement_For_NumericOperation, Statement_FunctioncallOrAssignmentOperation, Statement_GlobalFunction_DeclarationOperation, Statement_If_Then_ElseOperation, Statement_If_Then_Else_ElseIfPartOperation, Statement_LocalFunction_DeclarationOperation, Statement_Local_Variable_DeclarationOperation, Statement_RepeatOperation, Statement_WhileOperation> alg;
  
  public Expression_CallFunctionOperationImpl(final Expression_CallFunction obj, final LuaRevisitor<BlockOperation, ChunkOperation, ExpressionOperation, Expression_AccessArrayOperation, Expression_AccessMemberOperation, Expression_AndOperation, Expression_CallFunctionOperation, Expression_CallMemberFunctionOperation, Expression_ConcatenationOperation, Expression_DivisionOperation, Expression_EqualOperation, Expression_ExponentiationOperation, Expression_FalseOperation, Expression_FunctionOperation, Expression_InvertOperation, Expression_LargerOperation, Expression_Larger_EqualOperation, Expression_LengthOperation, Expression_MinusOperation, Expression_ModuloOperation, Expression_MultiplicationOperation, Expression_NegateOperation, Expression_NilOperation, Expression_Not_EqualOperation, Expression_NumberOperation, Expression_OrOperation, Expression_PlusOperation, Expression_SmallerOperation, Expression_Smaller_EqualOperation, Expression_StringOperation, Expression_TableConstructorOperation, Expression_TrueOperation, Expression_VarArgsOperation, Expression_VariableNameOperation, FieldOperation, Field_AddEntryToTableOperation, Field_AddEntryToTable_BracketsOperation, Field_AppendEntryToTableOperation, FunctionOperation, Functioncall_ArgumentsOperation, LastStatementOperation, LastStatement_BreakOperation, LastStatement_ReturnOperation, LastStatement_ReturnWithValueOperation, StatementOperation, Statement_AssignmentOperation, Statement_BlockOperation, Statement_CallFunctionOperation, Statement_CallMemberFunctionOperation, Statement_For_GenericOperation, Statement_For_NumericOperation, Statement_FunctioncallOrAssignmentOperation, Statement_GlobalFunction_DeclarationOperation, Statement_If_Then_ElseOperation, Statement_If_Then_Else_ElseIfPartOperation, Statement_LocalFunction_DeclarationOperation, Statement_Local_Variable_DeclarationOperation, Statement_RepeatOperation, Statement_WhileOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute(final Environment c) {
    final Expression x = this.obj.getObject();
    boolean _matched = false;
    if (x instanceof Expression_VariableName) {
      boolean _equals = ((Expression_VariableName)x).getVariable().equals("rand");
      if (_equals) {
        _matched=true;
        this.alg.$(this.obj.getArguments().getArguments().get(0)).execute(c);
        final int min = Double.valueOf(Double.parseDouble(c.popValue().toString())).intValue();
        this.alg.$(this.obj.getArguments().getArguments().get(1)).execute(c);
        final int max = Double.valueOf(Double.parseDouble(c.popValue().toString())).intValue();
        final int rand = ThreadLocalRandom.current().nextInt(min, max);
        c.pushValue(Double.valueOf(((double) rand)));
        return;
      }
    }
    this.alg.$(this.obj.getObject()).execute(c);
    boolean _isEmpty = this.obj.getArguments().getArguments().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      this.alg.$(this.obj.getArguments().getArguments().get(0)).execute(c);
      final Object res = c.popValue();
      boolean _equals = "\"*number\"".equals(res);
      if (_equals) {
        final Object res1 = c.popValue();
        c.pushValue(Double.valueOf(Double.parseDouble(("" + res1))));
        return;
      }
    }
    Expression _object = this.obj.getObject();
    if ((_object instanceof Expression_VariableName)) {
      Expression _object_1 = this.obj.getObject();
      final Function function = c.getFunctions().get(((Expression_VariableName) _object_1).getVariable());
      if ((function != null)) {
        final ArrayList<Object> params = CollectionLiterals.<Object>newArrayList();
        final Consumer<Expression> _function = (Expression args) -> {
          this.alg.$(args).execute(c);
          params.add(c.popValue());
        };
        this.obj.getArguments().getArguments().forEach(_function);
        final Environment newC = new Environment();
        newC.setParent(c);
        newC.getVariables().putAll(c.getVariables());
        newC.getFunctions().putAll(c.getFunctions());
        newC.getValues().addAll(c.getValues());
        for (int i = 0; (i < function.getParameters().size()); i++) {
          newC.putVariable(function.getParameters().get(i), params.get(i));
        }
        this.alg.$(function.getBody()).execute(newC);
        c.pushValue(newC.popValue());
      }
    }
  }
}
