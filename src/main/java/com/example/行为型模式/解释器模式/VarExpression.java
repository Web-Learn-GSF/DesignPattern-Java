package com.example.行为型模式.解释器模式;

import java.util.HashMap;

// 变量的解析器 VarExpression.java
public class VarExpression extends Expression {
	private String key; // key=a,key=b,key=c

	public VarExpression(String key) {
		this.key = key;
	}

	// var 得到的就是 {a=10, b=20}
	// interpreter的作用：根据变量的名称返回对应的值ֵ
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}
}