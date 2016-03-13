package com.laiths;

public class BinaryNode implements Node
{
	private String operation;
	private ExpressionTree left;
	private ExpressionTree right;

	public BinaryNode(String op, ExpressionTree leftTree, ExpressionTree rightTree)
	{
		operation = op;
		left = leftTree;
		right = rightTree;
	}

	public double evaluate()
		throws UnsupportedOperationException
	{
		if(operation.equals("*")) return left.evaluate() * right.evaluate();
		if(operation.equals("+")) return left.evaluate() + right.evaluate();
		if(operation.equals("-")) return left.evaluate() - right.evaluate();

		if(operation.equals("/")) {
			double rhs = right.evaluate();
			double lhs = left.evaluate();

			if(rhs == 0 && lhs == 0) {
				return Double.NaN;
			}

			if(rhs == 0 && lhs > 0) {
				return Double.POSITIVE_INFINITY;
			}

			if(rhs == 0 && lhs < 0) {
				return Double.NEGATIVE_INFINITY;
			}

			return left.evaluate() / right.evaluate();
		}

		throw new UnsupportedOperationException("'" + operation + "' is not supported");

	}

	public String toString()
	{
		return "(" + left.toString() +  " " + operation + " " + right.toString() + ")";
	}
}
