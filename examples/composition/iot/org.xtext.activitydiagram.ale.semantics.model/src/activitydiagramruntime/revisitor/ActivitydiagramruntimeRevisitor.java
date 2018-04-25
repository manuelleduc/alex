package activitydiagramruntime.revisitor;

public interface ActivitydiagramruntimeRevisitor<Activitydiagram__ActionT extends Activitydiagram__ExecutableNodeT, Activitydiagram__ActivityT extends Activitydiagram__NamedElementT, Activitydiagram__ActivityEdgeT extends Activitydiagram__NamedElementT, Activitydiagram__ActivityFinalNodeT extends Activitydiagram__FinalNodeT, Activitydiagram__ActivityNodeT extends Activitydiagram__NamedElementT, Activitydiagram__BooleanValueT extends Activitydiagram__ValueT, Activitydiagram__BooleanVariableT extends Activitydiagram__VariableT, Activitydiagramruntime__ContextT, Activitydiagram__ControlFlowT extends Activitydiagram__ActivityEdgeT, Activitydiagram__ControlNodeT extends Activitydiagram__ActivityNodeT, Activitydiagramruntime__ControlTokenT extends Activitydiagramruntime__TokenT, Activitydiagram__DecisionNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ExecutableNodeT extends Activitydiagram__ActivityNodeT, Activitydiagram__ExpressionT, Activitydiagram__FinalNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ForkNodeT extends Activitydiagram__ControlNodeT, Activitydiagramruntime__ForkedTokenT extends Activitydiagramruntime__TokenT, Activitydiagram__InitialNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Activitydiagram__IntegerValueT extends Activitydiagram__ValueT, Activitydiagram__JoinNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__MergeNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__NamedElementT, Activitydiagramruntime__OfferT, Activitydiagram__OpaqueActionT extends Activitydiagram__ActionT, Activitydiagramruntime__TokenT, Activitydiagramruntime__TraceT, Activitydiagram__ValueT, Activitydiagram__VariableT>
	extends activitydiagram.revisitor.ActivitydiagramRevisitor<Activitydiagram__ActionT, Activitydiagram__ActivityT, Activitydiagram__ActivityEdgeT, Activitydiagram__ActivityFinalNodeT, Activitydiagram__ActivityNodeT, Activitydiagram__BooleanValueT, Activitydiagram__BooleanVariableT, Activitydiagram__ControlFlowT, Activitydiagram__ControlNodeT, Activitydiagram__DecisionNodeT, Activitydiagram__ExecutableNodeT, Activitydiagram__ExpressionT, Activitydiagram__FinalNodeT, Activitydiagram__ForkNodeT, Activitydiagram__InitialNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Activitydiagram__IntegerValueT, Activitydiagram__JoinNodeT, Activitydiagram__MergeNodeT, Activitydiagram__NamedElementT, Activitydiagram__OpaqueActionT, Activitydiagram__ValueT, Activitydiagram__VariableT> {
	Activitydiagramruntime__ContextT context(final activitydiagramruntime.Context it);
	Activitydiagramruntime__ControlTokenT controlToken(final activitydiagramruntime.ControlToken it);
	Activitydiagramruntime__ForkedTokenT forkedToken(final activitydiagramruntime.ForkedToken it);
	Activitydiagramruntime__OfferT offer(final activitydiagramruntime.Offer it);
	Activitydiagramruntime__TraceT trace(final activitydiagramruntime.Trace it);

	default Activitydiagram__ActionT $(final activitydiagram.Action it) {
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return opaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Activitydiagram__ActivityT $(final activitydiagram.Activity it) {
		return activity(it);
	}
	default Activitydiagram__ActivityEdgeT $(final activitydiagram.ActivityEdge it) {
		if (it.getClass() == activitydiagram.impl.ControlFlowImpl.class)
			return controlFlow((activitydiagram.ControlFlow) it);
		return null;
	}
	default Activitydiagram__ActivityFinalNodeT $(final activitydiagram.ActivityFinalNode it) {
		return activityFinalNode(it);
	}
	default Activitydiagram__ActivityNodeT $(final activitydiagram.ActivityNode it) {
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activityFinalNode((activitydiagram.ActivityFinalNode) it);
		if (it.getClass() == activitydiagram.impl.DecisionNodeImpl.class)
			return decisionNode((activitydiagram.DecisionNode) it);
		if (it.getClass() == activitydiagram.impl.ForkNodeImpl.class)
			return forkNode((activitydiagram.ForkNode) it);
		if (it.getClass() == activitydiagram.impl.InitialNodeImpl.class)
			return initialNode((activitydiagram.InitialNode) it);
		if (it.getClass() == activitydiagram.impl.JoinNodeImpl.class)
			return joinNode((activitydiagram.JoinNode) it);
		if (it.getClass() == activitydiagram.impl.MergeNodeImpl.class)
			return mergeNode((activitydiagram.MergeNode) it);
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return opaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	Activitydiagram__BooleanValueT $(final activitydiagram.BooleanValue it);
	Activitydiagram__BooleanVariableT $(final activitydiagram.BooleanVariable it);
	default Activitydiagramruntime__ContextT $(final activitydiagramruntime.Context it) {
		return context(it);
	}
	default Activitydiagram__ControlFlowT $(final activitydiagram.ControlFlow it) {
		return controlFlow(it);
	}
	default Activitydiagram__ControlNodeT $(final activitydiagram.ControlNode it) {
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activityFinalNode((activitydiagram.ActivityFinalNode) it);
		if (it.getClass() == activitydiagram.impl.DecisionNodeImpl.class)
			return decisionNode((activitydiagram.DecisionNode) it);
		if (it.getClass() == activitydiagram.impl.ForkNodeImpl.class)
			return forkNode((activitydiagram.ForkNode) it);
		if (it.getClass() == activitydiagram.impl.InitialNodeImpl.class)
			return initialNode((activitydiagram.InitialNode) it);
		if (it.getClass() == activitydiagram.impl.JoinNodeImpl.class)
			return joinNode((activitydiagram.JoinNode) it);
		if (it.getClass() == activitydiagram.impl.MergeNodeImpl.class)
			return mergeNode((activitydiagram.MergeNode) it);
		return null;
	}
	default Activitydiagramruntime__ControlTokenT $(final activitydiagramruntime.ControlToken it) {
		return controlToken(it);
	}
	default Activitydiagram__DecisionNodeT $(final activitydiagram.DecisionNode it) {
		return decisionNode(it);
	}
	default Activitydiagram__ExecutableNodeT $(final activitydiagram.ExecutableNode it) {
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return opaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	Activitydiagram__ExpressionT $(final activitydiagram.Expression it);
	default Activitydiagram__FinalNodeT $(final activitydiagram.FinalNode it) {
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activityFinalNode((activitydiagram.ActivityFinalNode) it);
		return null;
	}
	default Activitydiagram__ForkNodeT $(final activitydiagram.ForkNode it) {
		return forkNode(it);
	}
	default Activitydiagramruntime__ForkedTokenT $(final activitydiagramruntime.ForkedToken it) {
		return forkedToken(it);
	}
	default Activitydiagram__InitialNodeT $(final activitydiagram.InitialNode it) {
		return initialNode(it);
	}
	default Activitydiagram__InputT $(final activitydiagram.Input it) {
		return input(it);
	}
	default Activitydiagram__InputValueT $(final activitydiagram.InputValue it) {
		return inputValue(it);
	}
	Activitydiagram__IntegerValueT $(final activitydiagram.IntegerValue it);
	default Activitydiagram__JoinNodeT $(final activitydiagram.JoinNode it) {
		return joinNode(it);
	}
	default Activitydiagram__MergeNodeT $(final activitydiagram.MergeNode it) {
		return mergeNode(it);
	}
	default Activitydiagram__NamedElementT $(final activitydiagram.NamedElement it) {
		if (it.getClass() == activitydiagram.impl.ActivityImpl.class)
			return activity((activitydiagram.Activity) it);
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activityFinalNode((activitydiagram.ActivityFinalNode) it);
		if (it.getClass() == activitydiagram.impl.ControlFlowImpl.class)
			return controlFlow((activitydiagram.ControlFlow) it);
		if (it.getClass() == activitydiagram.impl.DecisionNodeImpl.class)
			return decisionNode((activitydiagram.DecisionNode) it);
		if (it.getClass() == activitydiagram.impl.ForkNodeImpl.class)
			return forkNode((activitydiagram.ForkNode) it);
		if (it.getClass() == activitydiagram.impl.InitialNodeImpl.class)
			return initialNode((activitydiagram.InitialNode) it);
		if (it.getClass() == activitydiagram.impl.JoinNodeImpl.class)
			return joinNode((activitydiagram.JoinNode) it);
		if (it.getClass() == activitydiagram.impl.MergeNodeImpl.class)
			return mergeNode((activitydiagram.MergeNode) it);
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return opaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Activitydiagramruntime__OfferT $(final activitydiagramruntime.Offer it) {
		return offer(it);
	}
	default Activitydiagram__OpaqueActionT $(final activitydiagram.OpaqueAction it) {
		return opaqueAction(it);
	}
	default Activitydiagramruntime__TokenT $(final activitydiagramruntime.Token it) {
		if (it.getClass() == activitydiagramruntime.impl.ControlTokenImpl.class)
			return controlToken((activitydiagramruntime.ControlToken) it);
		if (it.getClass() == activitydiagramruntime.impl.ForkedTokenImpl.class)
			return forkedToken((activitydiagramruntime.ForkedToken) it);
		return null;
	}
	default Activitydiagramruntime__TraceT $(final activitydiagramruntime.Trace it) {
		return trace(it);
	}
	default Activitydiagram__ValueT $(final activitydiagram.Value it) {
		return null;
	}
	default Activitydiagram__VariableT $(final activitydiagram.Variable it) {
		return null;
	}
}