package com.example.行为型模式.解释器模式;

import java.util.HashMap;

// 抽象类表达式：通过HashMap的键值对可以获取各个变量的值ֵ Expression.java
public abstract class Expression {
	//解释公式和数值的关系：key就是公式(表达式,如a + b - c)  参数(如a,b,c..)
	//value就是具体的值ֵ，即最终HashMap中存放的就是各个变量的值，如HashMap {a=10, b=20}
	public abstract int interpreter(HashMap<String, Integer> var);
}