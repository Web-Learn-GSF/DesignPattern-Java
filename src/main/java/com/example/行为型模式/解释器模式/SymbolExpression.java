package com.example.行为型模式.解释器模式;

import java.util.HashMap;

/**
 * 抽象运算符号解析器：
 *  1）每个运算符号都只和自己的左右两个数字有关系
 *  2）同时，左右两个数字可能也是一个解析的结果
 *  3）无论何种类型，都是Expression的实现类
 */
public class SymbolExpression extends Expression {
	protected Expression left;
	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	//因为SymbolExpression是让其子类来实现的，因此interpreter()是一个默认实现
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return 0;
	}
}