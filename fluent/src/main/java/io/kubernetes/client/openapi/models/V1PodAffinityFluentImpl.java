package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1PodAffinityFluentImpl<A extends V1PodAffinityFluent<A>> extends BaseFluent<A> implements V1PodAffinityFluent<A>{
  public V1PodAffinityFluentImpl() {
  }
  public V1PodAffinityFluentImpl(V1PodAffinity instance) {
    if (instance != null) {
      this.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution());
      this.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution());
    }
  }
  private ArrayList<V1WeightedPodAffinityTermBuilder> preferredDuringSchedulingIgnoredDuringExecution;
  private ArrayList<V1PodAffinityTermBuilder> requiredDuringSchedulingIgnoredDuringExecution;
  public A addToPreferredDuringSchedulingIgnoredDuringExecution(int index,V1WeightedPodAffinityTerm item) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1WeightedPodAffinityTermBuilder>();}
    V1WeightedPodAffinityTermBuilder builder = new V1WeightedPodAffinityTermBuilder(item);
    if (index < 0 || index >= preferredDuringSchedulingIgnoredDuringExecution.size()) { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder); preferredDuringSchedulingIgnoredDuringExecution.add(builder); } else { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(index, builder); preferredDuringSchedulingIgnoredDuringExecution.add(index, builder);}
    return (A)this;
  }
  public A setToPreferredDuringSchedulingIgnoredDuringExecution(int index,V1WeightedPodAffinityTerm item) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1WeightedPodAffinityTermBuilder>();}
    V1WeightedPodAffinityTermBuilder builder = new V1WeightedPodAffinityTermBuilder(item);
    if (index < 0 || index >= preferredDuringSchedulingIgnoredDuringExecution.size()) { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder); preferredDuringSchedulingIgnoredDuringExecution.add(builder); } else { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").set(index, builder); preferredDuringSchedulingIgnoredDuringExecution.set(index, builder);}
    return (A)this;
  }
  public A addToPreferredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm... items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1WeightedPodAffinityTermBuilder>();}
    for (V1WeightedPodAffinityTerm item : items) {V1WeightedPodAffinityTermBuilder builder = new V1WeightedPodAffinityTermBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
  }
  public A addAllToPreferredDuringSchedulingIgnoredDuringExecution(Collection<V1WeightedPodAffinityTerm> items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1WeightedPodAffinityTermBuilder>();}
    for (V1WeightedPodAffinityTerm item : items) {V1WeightedPodAffinityTermBuilder builder = new V1WeightedPodAffinityTermBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
  }
  public A removeFromPreferredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm... items) {
    for (V1WeightedPodAffinityTerm item : items) {V1WeightedPodAffinityTermBuilder builder = new V1WeightedPodAffinityTermBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").remove(builder);if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);}} return (A)this;
  }
  public A removeAllFromPreferredDuringSchedulingIgnoredDuringExecution(Collection<V1WeightedPodAffinityTerm> items) {
    for (V1WeightedPodAffinityTerm item : items) {V1WeightedPodAffinityTermBuilder builder = new V1WeightedPodAffinityTermBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").remove(builder);if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1WeightedPodAffinityTermBuilder> predicate) {
    if (preferredDuringSchedulingIgnoredDuringExecution == null) return (A) this;
    final Iterator<V1WeightedPodAffinityTermBuilder> each = preferredDuringSchedulingIgnoredDuringExecution.iterator();
    final List visitables = _visitables.get("preferredDuringSchedulingIgnoredDuringExecution");
    while (each.hasNext()) {
      V1WeightedPodAffinityTermBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildPreferredDuringSchedulingIgnoredDuringExecution instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1WeightedPodAffinityTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution != null ? build(preferredDuringSchedulingIgnoredDuringExecution) : null;
  }
  public List<V1WeightedPodAffinityTerm> buildPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution != null ? build(preferredDuringSchedulingIgnoredDuringExecution) : null;
  }
  public V1WeightedPodAffinityTerm buildPreferredDuringSchedulingIgnoredDuringExecution(int index) {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(index).build();
  }
  public V1WeightedPodAffinityTerm buildFirstPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(0).build();
  }
  public V1WeightedPodAffinityTerm buildLastPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(preferredDuringSchedulingIgnoredDuringExecution.size() - 1).build();
  }
  public V1WeightedPodAffinityTerm buildMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1WeightedPodAffinityTermBuilder> predicate) {
    for (V1WeightedPodAffinityTermBuilder item: preferredDuringSchedulingIgnoredDuringExecution) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1WeightedPodAffinityTermBuilder> predicate) {
    for (V1WeightedPodAffinityTermBuilder item: preferredDuringSchedulingIgnoredDuringExecution) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withPreferredDuringSchedulingIgnoredDuringExecution(List<V1WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution != null) { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").clear();}
    if (preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList(); for (V1WeightedPodAffinityTerm item : preferredDuringSchedulingIgnoredDuringExecution){this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);}} else { this.preferredDuringSchedulingIgnoredDuringExecution = null;} return (A) this;
  }
  public A withPreferredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm... preferredDuringSchedulingIgnoredDuringExecution) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution.clear(); _visitables.remove("preferredDuringSchedulingIgnoredDuringExecution"); }
    if (preferredDuringSchedulingIgnoredDuringExecution != null) {for (V1WeightedPodAffinityTerm item :preferredDuringSchedulingIgnoredDuringExecution){ this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);}} return (A) this;
  }
  public Boolean hasPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution != null && !preferredDuringSchedulingIgnoredDuringExecution.isEmpty();
  }
  public V1PodAffinityFluentImpl.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecution() {
    return new V1PodAffinityFluentImpl.PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl();
  }
  public V1PodAffinityFluentImpl.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(V1WeightedPodAffinityTerm item) {
    return new V1PodAffinityFluentImpl.PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(-1, item);
  }
  public V1PodAffinityFluentImpl.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(int index,V1WeightedPodAffinityTerm item) {
    return new V1PodAffinityFluentImpl.PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(index, item);
  }
  public V1PodAffinityFluentImpl.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editPreferredDuringSchedulingIgnoredDuringExecution(int index) {
    if (preferredDuringSchedulingIgnoredDuringExecution.size() <= index) throw new RuntimeException("Can't edit preferredDuringSchedulingIgnoredDuringExecution. Index exceeds size.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  public V1PodAffinityFluentImpl.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstPreferredDuringSchedulingIgnoredDuringExecution() {
    if (preferredDuringSchedulingIgnoredDuringExecution.size() == 0) throw new RuntimeException("Can't edit first preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(0, buildPreferredDuringSchedulingIgnoredDuringExecution(0));
  }
  public V1PodAffinityFluentImpl.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editLastPreferredDuringSchedulingIgnoredDuringExecution() {
    int index = preferredDuringSchedulingIgnoredDuringExecution.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  public V1PodAffinityFluentImpl.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1WeightedPodAffinityTermBuilder> predicate) {
    int index = -1;
    for (int i=0;i<preferredDuringSchedulingIgnoredDuringExecution.size();i++) { 
    if (predicate.test(preferredDuringSchedulingIgnoredDuringExecution.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching preferredDuringSchedulingIgnoredDuringExecution. No match found.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  public A addToRequiredDuringSchedulingIgnoredDuringExecution(int index,V1PodAffinityTerm item) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1PodAffinityTermBuilder>();}
    V1PodAffinityTermBuilder builder = new V1PodAffinityTermBuilder(item);
    if (index < 0 || index >= requiredDuringSchedulingIgnoredDuringExecution.size()) { _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder); requiredDuringSchedulingIgnoredDuringExecution.add(builder); } else { _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(index, builder); requiredDuringSchedulingIgnoredDuringExecution.add(index, builder);}
    return (A)this;
  }
  public A setToRequiredDuringSchedulingIgnoredDuringExecution(int index,V1PodAffinityTerm item) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1PodAffinityTermBuilder>();}
    V1PodAffinityTermBuilder builder = new V1PodAffinityTermBuilder(item);
    if (index < 0 || index >= requiredDuringSchedulingIgnoredDuringExecution.size()) { _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder); requiredDuringSchedulingIgnoredDuringExecution.add(builder); } else { _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").set(index, builder); requiredDuringSchedulingIgnoredDuringExecution.set(index, builder);}
    return (A)this;
  }
  public A addToRequiredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1PodAffinityTerm... items) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1PodAffinityTermBuilder>();}
    for (V1PodAffinityTerm item : items) {V1PodAffinityTermBuilder builder = new V1PodAffinityTermBuilder(item);_visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder);this.requiredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
  }
  public A addAllToRequiredDuringSchedulingIgnoredDuringExecution(Collection<V1PodAffinityTerm> items) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1PodAffinityTermBuilder>();}
    for (V1PodAffinityTerm item : items) {V1PodAffinityTermBuilder builder = new V1PodAffinityTermBuilder(item);_visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder);this.requiredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
  }
  public A removeFromRequiredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1PodAffinityTerm... items) {
    for (V1PodAffinityTerm item : items) {V1PodAffinityTermBuilder builder = new V1PodAffinityTermBuilder(item);_visitables.get("requiredDuringSchedulingIgnoredDuringExecution").remove(builder);if (this.requiredDuringSchedulingIgnoredDuringExecution != null) {this.requiredDuringSchedulingIgnoredDuringExecution.remove(builder);}} return (A)this;
  }
  public A removeAllFromRequiredDuringSchedulingIgnoredDuringExecution(Collection<V1PodAffinityTerm> items) {
    for (V1PodAffinityTerm item : items) {V1PodAffinityTermBuilder builder = new V1PodAffinityTermBuilder(item);_visitables.get("requiredDuringSchedulingIgnoredDuringExecution").remove(builder);if (this.requiredDuringSchedulingIgnoredDuringExecution != null) {this.requiredDuringSchedulingIgnoredDuringExecution.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromRequiredDuringSchedulingIgnoredDuringExecution(Predicate<V1PodAffinityTermBuilder> predicate) {
    if (requiredDuringSchedulingIgnoredDuringExecution == null) return (A) this;
    final Iterator<V1PodAffinityTermBuilder> each = requiredDuringSchedulingIgnoredDuringExecution.iterator();
    final List visitables = _visitables.get("requiredDuringSchedulingIgnoredDuringExecution");
    while (each.hasNext()) {
      V1PodAffinityTermBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildRequiredDuringSchedulingIgnoredDuringExecution instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PodAffinityTerm> getRequiredDuringSchedulingIgnoredDuringExecution() {
    return requiredDuringSchedulingIgnoredDuringExecution != null ? build(requiredDuringSchedulingIgnoredDuringExecution) : null;
  }
  public List<V1PodAffinityTerm> buildRequiredDuringSchedulingIgnoredDuringExecution() {
    return requiredDuringSchedulingIgnoredDuringExecution != null ? build(requiredDuringSchedulingIgnoredDuringExecution) : null;
  }
  public V1PodAffinityTerm buildRequiredDuringSchedulingIgnoredDuringExecution(int index) {
    return this.requiredDuringSchedulingIgnoredDuringExecution.get(index).build();
  }
  public V1PodAffinityTerm buildFirstRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution.get(0).build();
  }
  public V1PodAffinityTerm buildLastRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution.get(requiredDuringSchedulingIgnoredDuringExecution.size() - 1).build();
  }
  public V1PodAffinityTerm buildMatchingRequiredDuringSchedulingIgnoredDuringExecution(Predicate<V1PodAffinityTermBuilder> predicate) {
    for (V1PodAffinityTermBuilder item: requiredDuringSchedulingIgnoredDuringExecution) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingRequiredDuringSchedulingIgnoredDuringExecution(Predicate<V1PodAffinityTermBuilder> predicate) {
    for (V1PodAffinityTermBuilder item: requiredDuringSchedulingIgnoredDuringExecution) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withRequiredDuringSchedulingIgnoredDuringExecution(List<V1PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution != null) { _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").clear();}
    if (requiredDuringSchedulingIgnoredDuringExecution != null) {this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList(); for (V1PodAffinityTerm item : requiredDuringSchedulingIgnoredDuringExecution){this.addToRequiredDuringSchedulingIgnoredDuringExecution(item);}} else { this.requiredDuringSchedulingIgnoredDuringExecution = null;} return (A) this;
  }
  public A withRequiredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1PodAffinityTerm... requiredDuringSchedulingIgnoredDuringExecution) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution != null) {this.requiredDuringSchedulingIgnoredDuringExecution.clear(); _visitables.remove("requiredDuringSchedulingIgnoredDuringExecution"); }
    if (requiredDuringSchedulingIgnoredDuringExecution != null) {for (V1PodAffinityTerm item :requiredDuringSchedulingIgnoredDuringExecution){ this.addToRequiredDuringSchedulingIgnoredDuringExecution(item);}} return (A) this;
  }
  public Boolean hasRequiredDuringSchedulingIgnoredDuringExecution() {
    return requiredDuringSchedulingIgnoredDuringExecution != null && !requiredDuringSchedulingIgnoredDuringExecution.isEmpty();
  }
  public V1PodAffinityFluentImpl.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> addNewRequiredDuringSchedulingIgnoredDuringExecution() {
    return new V1PodAffinityFluentImpl.RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl();
  }
  public V1PodAffinityFluentImpl.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> addNewRequiredDuringSchedulingIgnoredDuringExecutionLike(V1PodAffinityTerm item) {
    return new V1PodAffinityFluentImpl.RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(-1, item);
  }
  public V1PodAffinityFluentImpl.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(int index,V1PodAffinityTerm item) {
    return new V1PodAffinityFluentImpl.RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(index, item);
  }
  public V1PodAffinityFluentImpl.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editRequiredDuringSchedulingIgnoredDuringExecution(int index) {
    if (requiredDuringSchedulingIgnoredDuringExecution.size() <= index) throw new RuntimeException("Can't edit requiredDuringSchedulingIgnoredDuringExecution. Index exceeds size.");
    return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(index, buildRequiredDuringSchedulingIgnoredDuringExecution(index));
  }
  public V1PodAffinityFluentImpl.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstRequiredDuringSchedulingIgnoredDuringExecution() {
    if (requiredDuringSchedulingIgnoredDuringExecution.size() == 0) throw new RuntimeException("Can't edit first requiredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(0, buildRequiredDuringSchedulingIgnoredDuringExecution(0));
  }
  public V1PodAffinityFluentImpl.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editLastRequiredDuringSchedulingIgnoredDuringExecution() {
    int index = requiredDuringSchedulingIgnoredDuringExecution.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last requiredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(index, buildRequiredDuringSchedulingIgnoredDuringExecution(index));
  }
  public V1PodAffinityFluentImpl.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingRequiredDuringSchedulingIgnoredDuringExecution(Predicate<V1PodAffinityTermBuilder> predicate) {
    int index = -1;
    for (int i=0;i<requiredDuringSchedulingIgnoredDuringExecution.size();i++) { 
    if (predicate.test(requiredDuringSchedulingIgnoredDuringExecution.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching requiredDuringSchedulingIgnoredDuringExecution. No match found.");
    return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(index, buildRequiredDuringSchedulingIgnoredDuringExecution(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodAffinityFluentImpl that = (V1PodAffinityFluentImpl) o;
    if (!java.util.Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, that.preferredDuringSchedulingIgnoredDuringExecution)) return false;

    if (!java.util.Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, that.requiredDuringSchedulingIgnoredDuringExecution)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(preferredDuringSchedulingIgnoredDuringExecution,  requiredDuringSchedulingIgnoredDuringExecution,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (preferredDuringSchedulingIgnoredDuringExecution != null) { sb.append("preferredDuringSchedulingIgnoredDuringExecution:"); sb.append(preferredDuringSchedulingIgnoredDuringExecution + ","); }
    if (requiredDuringSchedulingIgnoredDuringExecution != null) { sb.append("requiredDuringSchedulingIgnoredDuringExecution:"); sb.append(requiredDuringSchedulingIgnoredDuringExecution); }
    sb.append("}");
    return sb.toString();
  }
  class PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl<N> extends V1WeightedPodAffinityTermFluentImpl<V1PodAffinityFluentImpl.PreferredDuringSchedulingIgnoredDuringExecutionNested<N>> implements V1PodAffinityFluentImpl.PreferredDuringSchedulingIgnoredDuringExecutionNested<N>,Nested<N>{
    PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(int index,V1WeightedPodAffinityTerm item) {
      this.index = index;
      this.builder = new V1WeightedPodAffinityTermBuilder(this, item);
    }
    PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl() {
      this.index = -1;
      this.builder = new V1WeightedPodAffinityTermBuilder(this);
    }
    V1WeightedPodAffinityTermBuilder builder;
    int index;
    public N and() {
      return (N) V1PodAffinityFluentImpl.this.setToPreferredDuringSchedulingIgnoredDuringExecution(index,builder.build());
    }
    public N endPreferredDuringSchedulingIgnoredDuringExecution() {
      return and();
    }
    
  }
  class RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl<N> extends V1PodAffinityTermFluentImpl<V1PodAffinityFluentImpl.RequiredDuringSchedulingIgnoredDuringExecutionNested<N>> implements V1PodAffinityFluentImpl.RequiredDuringSchedulingIgnoredDuringExecutionNested<N>,Nested<N>{
    RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(int index,V1PodAffinityTerm item) {
      this.index = index;
      this.builder = new V1PodAffinityTermBuilder(this, item);
    }
    RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl() {
      this.index = -1;
      this.builder = new V1PodAffinityTermBuilder(this);
    }
    V1PodAffinityTermBuilder builder;
    int index;
    public N and() {
      return (N) V1PodAffinityFluentImpl.this.setToRequiredDuringSchedulingIgnoredDuringExecution(index,builder.build());
    }
    public N endRequiredDuringSchedulingIgnoredDuringExecution() {
      return and();
    }
    
  }
  
}