package com.laiths;

public class ValueNode implements Node
{
	protected double value;

	public ValueNode(double item)
	{
		value = item;
	}

	public double evaluate()
	{
		return value;
	}

	public String toString ()
	{
		return "" + value;
	}
}
