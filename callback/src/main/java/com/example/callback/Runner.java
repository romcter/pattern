package com.example.callback;

import lombok.extern.slf4j.Slf4j;

/**
 * Callback pattern is more native for functional languages where functions are treated as
 * first-class citizens. Prior to Java 8 callbacks can be simulated using simple (alike command)
 * interfaces.
 */
@Slf4j
public final class Runner {

  private Runner() {
  }

  public static void main(final String[] args) {
    SimpleTask task = new SimpleTask();
    task.executeWith(() -> log.info("I'm done now."));
  }
}
