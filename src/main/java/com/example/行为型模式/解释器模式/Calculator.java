package com.example.行为型模式.解释器模式;

import java.util.HashMap;
import java.util.Stack;

// Calculator.java
public class Calculator {
	//定义表达式
	private Expression expression;

	//构造函数传参 并解析
	public Calculator(String expStr) { //如传入的expStr = a+b
		// 安排运算先后顺序
		Stack<Expression> stack = new Stack<>();
		// 表达式拆分成字符数组
		char[] charArray = expStr.toCharArray();//expStr拆分为 [a, +, b]

		Expression left = null;
		Expression right = null;
		//遍历字符数组，即遍历 [a, +, b]，针对不同的情况做相应的处理
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+': 
				left = stack.pop();//先从栈中弹出left => "a"
				right = new VarExpression(String.valueOf(charArray[++i]));// 取出left表达式 => "b"
				stack.push(new AddExpression(left, right));// 根据得到的left和right对象构建 AddExpresson 并加入stack中
				break;
			case '-': // 
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default: 
				//如果是一个Var(变量)，就创建一个VarExpression对象，并push到栈中
				stack.push(new VarExpression(String.valueOf(charArray[i])));
				break;
			}
		}
		//当遍历完整个charArray数组后，stack中就得到了最后的Expression
		this.expression = stack.pop();
	}

	public int run(HashMap<String, Integer> var) {
		//将表达式a+b和var：{a=10,b=20}绑定
		//然后传递给expression的interpreter进行处理/解释执行
		return this.expression.interpreter(var);
	}
}