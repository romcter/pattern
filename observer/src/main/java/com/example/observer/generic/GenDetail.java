package com.example.observer.generic;

import com.example.observer.DetailType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GenDetail extends Observable<GenDetail, Race, DetailType> {

  private DetailType currentDetail;

  public GenDetail() {
    currentDetail = DetailType.ENGINE;
  }

  public void finishDetail() {
    DetailType[] enumValues = DetailType.values();
    currentDetail = enumValues[(currentDetail.ordinal() + 1) % enumValues.length];
    log.info("The detail changed to {}.", currentDetail);
    notifyObservers(currentDetail);
  }
}
