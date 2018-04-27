package lua_exec.revisitor.operations.lua_exec.impl;

import lua.revisitor.LuaRevisitor;
import lua_exec.revisitor.operations.lua_exec.BlockOperation;
import lua_exec.revisitor.operations.lua_exec.ChunkOperation;
import lua_exec.revisitor.operations.lua_exec.ExpressionOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_AccessArrayOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_AccessMemberOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_AndOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_CallFunctionOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_CallMemberFunctionOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_ConcatenationOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_DivisionOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_EqualOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_ExponentiationOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_FalseOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_FunctionOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_InvertOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_LargerOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_Larger_EqualOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_LengthOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_MinusOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_ModuloOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_MultiplicationOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_NegateOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_NilOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_Not_EqualOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_NumberOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_OrOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_PlusOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_SmallerOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_Smaller_EqualOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_StringOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_TableConstructorOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_TrueOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_VarArgsOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_VariableNameOperation;
import lua_exec.revisitor.operations.lua_exec.FieldOperation;
import lua_exec.revisitor.operations.lua_exec.Field_AddEntryToTableOperation;
import lua_exec.revisitor.operations.lua_exec.Field_AddEntryToTable_BracketsOperation;
import lua_exec.revisitor.operations.lua_exec.Field_AppendEntryToTableOperation;
import lua_exec.revisitor.operations.lua_exec.FunctionOperation;
import lua_exec.revisitor.operations.lua_exec.Functioncall_ArgumentsOperation;
import lua_exec.revisitor.operations.lua_exec.LastStatementOperation;
import lua_exec.revisitor.operations.lua_exec.LastStatement_BreakOperation;
import lua_exec.revisitor.operations.lua_exec.LastStatement_ReturnOperation;
import lua_exec.revisitor.operations.lua_exec.LastStatement_ReturnWithValueOperation;
import lua_exec.revisitor.operations.lua_exec.StatementOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_AssignmentOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_BlockOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_CallFunctionOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_CallMemberFunctionOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_For_GenericOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_For_NumericOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_FunctioncallOrAssignmentOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_GlobalFunction_DeclarationOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_If_Then_ElseOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_If_Then_Else_ElseIfPartOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_LocalFunction_DeclarationOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_Local_Variable_DeclarationOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_RepeatOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_WhileOperation;
import lua_exec.revisitor.operations.lua_exec.impl.ExpressionOperationImpl;
import org.xtext.lua.lua.Expression_Negate;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public class Expression_NegateOperationImpl extends ExpressionOperationImpl implements Expression_NegateOperation {
  private Expression_Negate obj;
  
  private LuaRevisitor<BlockOperation, ChunkOperation, ExpressionOperation, Expression_AccessArrayOperation, Expression_AccessMemberOperation, Expression_AndOperation, Expression_CallFunctionOperation, Expression_CallMemberFunctionOperation, Expression_ConcatenationOperation, Expression_DivisionOperation, Expression_EqualOperation, Expression_ExponentiationOperation, Expression_FalseOperation, Expression_FunctionOperation, Expression_InvertOperation, Expression_LargerOperation, Expression_Larger_EqualOperation, Expression_LengthOperation, Expression_MinusOperation, Expression_ModuloOperation, Expression_MultiplicationOperation, Expression_NegateOperation, Expression_NilOperation, Expression_Not_EqualOperation, Expression_NumberOperation, Expression_OrOperation, Expression_PlusOperation, Expression_SmallerOperation, Expression_Smaller_EqualOperation, Expression_StringOperation, Expression_TableConstructorOperation, Expression_TrueOperation, Expression_VarArgsOperation, Expression_VariableNameOperation, FieldOperation, Field_AddEntryToTableOperation, Field_AddEntryToTable_BracketsOperation, Field_AppendEntryToTableOperation, FunctionOperation, Functioncall_ArgumentsOperation, LastStatementOperation, LastStatement_BreakOperation, LastStatement_ReturnOperation, LastStatement_ReturnWithValueOperation, StatementOperation, Statement_AssignmentOperation, Statement_BlockOperation, Statement_CallFunctionOperation, Statement_CallMemberFunctionOperation, Statement_For_GenericOperation, Statement_For_NumericOperation, Statement_FunctioncallOrAssignmentOperation, Statement_GlobalFunction_DeclarationOperation, Statement_If_Then_ElseOperation, Statement_If_Then_Else_ElseIfPartOperation, Statement_LocalFunction_DeclarationOperation, Statement_Local_Variable_DeclarationOperation, Statement_RepeatOperation, Statement_WhileOperation> alg;
  
  public Expression_NegateOperationImpl(final Expression_Negate obj, final LuaRevisitor<BlockOperation, ChunkOperation, ExpressionOperation, Expression_AccessArrayOperation, Expression_AccessMemberOperation, Expression_AndOperation, Expression_CallFunctionOperation, Expression_CallMemberFunctionOperation, Expression_ConcatenationOperation, Expression_DivisionOperation, Expression_EqualOperation, Expression_ExponentiationOperation, Expression_FalseOperation, Expression_FunctionOperation, Expression_InvertOperation, Expression_LargerOperation, Expression_Larger_EqualOperation, Expression_LengthOperation, Expression_MinusOperation, Expression_ModuloOperation, Expression_MultiplicationOperation, Expression_NegateOperation, Expression_NilOperation, Expression_Not_EqualOperation, Expression_NumberOperation, Expression_OrOperation, Expression_PlusOperation, Expression_SmallerOperation, Expression_Smaller_EqualOperation, Expression_StringOperation, Expression_TableConstructorOperation, Expression_TrueOperation, Expression_VarArgsOperation, Expression_VariableNameOperation, FieldOperation, Field_AddEntryToTableOperation, Field_AddEntryToTable_BracketsOperation, Field_AppendEntryToTableOperation, FunctionOperation, Functioncall_ArgumentsOperation, LastStatementOperation, LastStatement_BreakOperation, LastStatement_ReturnOperation, LastStatement_ReturnWithValueOperation, StatementOperation, Statement_AssignmentOperation, Statement_BlockOperation, Statement_CallFunctionOperation, Statement_CallMemberFunctionOperation, Statement_For_GenericOperation, Statement_For_NumericOperation, Statement_FunctioncallOrAssignmentOperation, Statement_GlobalFunction_DeclarationOperation, Statement_If_Then_ElseOperation, Statement_If_Then_Else_ElseIfPartOperation, Statement_LocalFunction_DeclarationOperation, Statement_Local_Variable_DeclarationOperation, Statement_RepeatOperation, Statement_WhileOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute(final Environment c) {
    this.alg.$(this.obj.getExp()).execute(c);
    Object _popValue = c.popValue();
    final Double left = ((Double) _popValue);
    c.pushValue(Double.valueOf(((left).doubleValue() * (-1))));
  }
}
