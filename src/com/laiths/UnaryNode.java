package com.laiths;

public class UnaryNode implements Node
{
	private String operation;
	private ExpressionTree operand;

	public UnaryNode(String op, ExpressionTree tree)
	{
		operation = op;
		operand = tree;
	}

	public double evaluate()
		throws UnsupportedOperationException
	{
		if(operation.equals("+")) return 1 * operand.evaluate();
		if(operation.equals("-")) return -1 * operand.evaluate();

		throw new UnsupportedOperationException("'" + operation + "' is not supported");

	}

	public String toString()
	{
		return "(" + operation + operand.toString() + ")";
	}
}
