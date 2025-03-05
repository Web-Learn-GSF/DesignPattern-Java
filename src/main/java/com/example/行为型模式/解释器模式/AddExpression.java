package com.example.行为型模式.解释器模式;

import java.util.HashMap;

//加法解释器 AddExpression.java
public class AddExpression extends SymbolExpression  {
	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	//处理“+”
	//var即{a=10,b=20...}(值key)
	public int interpreter(HashMap<String, Integer> var) {
		//super.left.interpreter(var)：返回left表达式对应的值，比如a对应的值是10
		//super.right.interpreter(var):返回right表达式对应的值，比如b对应的值是20
		return super.left.interpreter(var) + super.right.interpreter(var);
	}
}
