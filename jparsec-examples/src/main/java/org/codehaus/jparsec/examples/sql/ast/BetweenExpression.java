/*****************************************************************************
 * Copyright (C) jparsec.org                                                *
 * ------------------------------------------------------------------------- *
 * Licensed under the Apache License, Version 2.0 (the "License");           *
 * you may not use this file except in compliance with the License.          *
 * You may obtain a copy of the License at                                   *
 *                                                                           *
 * http://www.apache.org/licenses/LICENSE-2.0                                *
 *                                                                           *
 * Unless required by applicable law or agreed to in writing, software       *
 * distributed under the License is distributed on an "AS IS" BASIS,         *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  *
 * See the License for the specific language governing permissions and       *
 * limitations under the License.                                            *
 *****************************************************************************/
package org.codehaus.jparsec.examples.sql.ast;

import org.codehaus.jparsec.examples.common.ValueObject;

/**
 * Expression like "expr between a and b".
 * 
 * @author Ben Yu
 */
public final class BetweenExpression extends ValueObject implements Expression {
  public final Expression expression;
  public final boolean between; // between or not between
  public final Expression from;
  public final Expression to;
  
  public BetweenExpression(Expression expression, boolean between, Expression from, Expression to) {
    this.expression = expression;
    this.between = between;
    this.from = from;
    this.to = to;
  }
}
