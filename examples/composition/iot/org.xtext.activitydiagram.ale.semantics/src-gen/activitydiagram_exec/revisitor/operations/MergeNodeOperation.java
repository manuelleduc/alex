package activitydiagram_exec.revisitor.operations;

import activitydiagram_exec.revisitor.operations.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.ControlNodeOperation;
import activitydiagram_exec.revisitor.operations.NamedElementOperation;
import activitydiagramruntime.Context;

@SuppressWarnings("all")
public interface MergeNodeOperation extends ControlNodeOperation, ActivityNodeOperation, NamedElementOperation {
  public abstract void execute(final Context c);
  
  public abstract boolean hasOffers();
}
