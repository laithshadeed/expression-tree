package com.laiths;

public class ExpressionTree
{
	protected Node node;

	public ExpressionTree (double num)
	{
		node = new ValueNode(num);
	}

	public ExpressionTree (String operation, double num)
	{
		node = new UnaryNode(operation, new ExpressionTree(num));
	}

	public ExpressionTree (String operation, ExpressionTree tree)
	{
		node = new UnaryNode(operation, tree);
	}

	public ExpressionTree (String operation, ExpressionTree leftOp, ExpressionTree rightOp)
	{
		node = new BinaryNode(operation, leftOp, rightOp);
	}

	public ExpressionTree (String operation, double leftOp, double rightOp)
	{
		node = new BinaryNode(operation, new ExpressionTree(leftOp), new ExpressionTree(rightOp));
	}

	public ExpressionTree (String operation, ExpressionTree leftOp, double rightOp)
	{
		node = new BinaryNode(operation, leftOp, new ExpressionTree(rightOp));
	}

	public ExpressionTree (String operation, double leftOp, ExpressionTree rightOp)
	{
		node = new BinaryNode(operation, new ExpressionTree(leftOp), rightOp);
	}

	public double evaluate()
			throws UnsupportedOperationException
	{
		return node.evaluate();

	}

	public String toString()
	{
		return node.toString();
	}
}
