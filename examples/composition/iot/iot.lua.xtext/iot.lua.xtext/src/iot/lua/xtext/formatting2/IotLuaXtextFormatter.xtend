/*
 * generated by Xtext 2.12.0
 */
package iot.lua.xtext.formatting2

import com.google.inject.Inject
import iot.Board
import iot.HWComp
import iot.IotOperationDef
import iot.Sensor
import iot.lua.xtext.services.IotLuaXtextGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class IotLuaXtextFormatter extends AbstractFormatter2 {
	
	@Inject extension IotLuaXtextGrammarAccess

	def dispatch void format(iot.System system, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (HWComp hWComp : system.getComponents()) {
			hWComp.format;
		}
		for (Board board : system.getBoards()) {
			board.format;
		}
		system.getSketch.format;
	}

	def dispatch void format(Sensor sensor, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (IotOperationDef iotOperationDef : sensor.getServices()) {
			iotOperationDef.format;
		}
	}
	
	// TODO: implement for Actuator, Sketch, IotOperationDefBindOperationDef, OperationDef, IdlStmtBindBlock, ParameterDef, Block, LastStatement_ReturnWithValue, Statement_Block, Statement_While, Statement_Repeat, Statement_If_Then_Else, Statement_If_Then_Else_ElseIfPart, Statement_For_Numeric, Statement_For_Generic, Statement_GlobalFunction_Declaration, Statement_LocalFunction_Declaration, Statement_Local_Variable_Declaration, Statement_Assignment, Statement_CallMemberFunction, Statement_CallFunction, Expression_Or, Expression_And, Expression_Larger, Expression_Larger_Equal, Expression_Smaller, Expression_Smaller_Equal, Expression_Equal, Expression_Not_Equal, Expression_Concatenation, Expression_Plus, Expression_Minus, Expression_Multiplication, Expression_Division, Expression_Modulo, Expression_Negate, Expression_Length, Expression_Invert, Expression_Exponentiation, Expression_Function, Expression_TableConstructor, Expression_CallMemberFunction, Expression_CallFunction, Expression_AccessArray, Function, Functioncall_Arguments, Field_AddEntryToTable_Brackets, Field_AddEntryToTable, Field_AppendEntryToTable, IotActivityBindActivity, Activity, OpaqueAction, ExpressionBindStatement, IntegerVariable, BooleanVariable, Expression_AccessMember
}
