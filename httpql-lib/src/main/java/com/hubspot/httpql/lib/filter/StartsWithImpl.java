package com.hubspot.httpql.lib.filter;

import com.hubspot.httpql.core.filter.Filter;
import com.hubspot.httpql.core.filter.StartsWith;
import com.hubspot.httpql.lib.ConditionProvider;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Param;

public class StartsWithImpl extends FilterBase implements FilterImpl {

  @Override
  public String[] names() {
    return new String[] {
        "startswith"
    };
  }

  @Override
  public <T> ConditionProvider<T> getConditionProvider(Field<T> field) {
    return new ConditionProvider<T>(field) {

      @Override
      public Condition getCondition(Param<T> value) {
        return field.startsWith(value);
      }

    };
  }

  @Override
  public Class<? extends Filter> getAnnotationClass() {
    return StartsWith.class;
  }

}
