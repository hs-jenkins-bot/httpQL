package com.hubspot.httpql.filter;

import com.hubspot.httpql.ConditionProvider;
import com.hubspot.httpql.Filter;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Param;

/**
 * @deprecated Use #{@link com.hubspot.httpql.core.filter.Null}
 */
@Deprecated
public class Null extends FilterBase implements Filter {

  @Override
  public String[] names() {
    return new String[] { "is_null" };
  }

  @Override
  public <T> ConditionProvider<T> getConditionProvider(Field<T> field) {
    return new ConditionProvider<T>(field) {
      @Override
      public Condition getCondition(Param<T> value) {
        return field.isNull();
      }
    };
  }
}
