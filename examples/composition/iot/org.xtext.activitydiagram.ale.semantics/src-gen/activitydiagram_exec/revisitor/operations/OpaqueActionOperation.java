package activitydiagram_exec.revisitor.operations;

import activitydiagram_exec.revisitor.operations.ActionOperation;
import activitydiagram_exec.revisitor.operations.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.ExecutableNodeOperation;
import activitydiagram_exec.revisitor.operations.NamedElementOperation;
import activitydiagramruntime.Context;

@SuppressWarnings("all")
public interface OpaqueActionOperation extends ActionOperation, ExecutableNodeOperation, ActivityNodeOperation, NamedElementOperation {
  public abstract void execute(final Context c);
}
