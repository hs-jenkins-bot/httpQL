package com.hubspot.httpql.core.filter;

public class LessThanOrEqual implements Filter {

  @Override
  public String[] names() {
    return new String[] { "lte" };
  }
}
