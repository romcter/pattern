package com.example.observer.generic;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @param <S> Subject
 * @param <O> Observer
 * @param <A> Argument type
 */
public abstract class Observable<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {

  protected final List<O> observers;

  public Observable() {
    this.observers = new CopyOnWriteArrayList<>();
  }

  public void addObserver(O observer) {
    this.observers.add(observer);
  }

  public void removeObserver(O observer) {
    this.observers.remove(observer);
  }

  /**
   * Notify observers.
   */
  @SuppressWarnings("unchecked")
  public void notifyObservers(A argument) {
    for (O observer : observers) {
      observer.update((S) this, argument);
    }
  }
}
