package com.example.observer;

public enum DetailType {

  ENGINE("Engine"),
  WHEEL("Wheel"),
  SEAT("Seat"),
  HELM("Helm");

  private final String description;

  DetailType(String description) {
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}
