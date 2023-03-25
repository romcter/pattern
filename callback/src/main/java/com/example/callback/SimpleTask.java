package com.example.callback;

import lombok.extern.slf4j.Slf4j;

/**
 * Implementation of task that need to be executed.
 */

@Slf4j
public final class SimpleTask extends Task {

  @Override
  public void execute() {
    log.info("Perform some important activity and after call the callback method.");
  }
}
