package com.example.行为型模式.解释器模式;

import java.util.HashMap;

//减法解释器 SubExpression.java
public class SubExpression extends SymbolExpression {
	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	//求出left与right表达式相减的结果
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) - super.right.interpreter(var);
	}
}