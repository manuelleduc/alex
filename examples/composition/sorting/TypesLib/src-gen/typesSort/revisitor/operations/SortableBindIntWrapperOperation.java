package typesSort.revisitor.operations;

import java.util.List;
import sorting.revisitor.operations.SortableOperation;
import sortingAlgorithm.Sortable;

@SuppressWarnings("all")
public interface SortableBindIntWrapperOperation extends SortableOperation {
  public abstract Sortable max(final List<Sortable> lst);
  
  public abstract Sortable min(final List<Sortable> lst);
  
  public abstract List<Sortable> sort(final List<Sortable> lst);
  
  public abstract int comparateTo(final Sortable a, final Sortable b);
}
