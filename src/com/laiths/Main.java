package com.laiths;

public class Main
{
	public static void main (String [] args)
	{
		/**
		 *  t1
		 *      *
		 *     / \
		 *    +    10
		 *   / \
		 *  1   9
		 */
		ExpressionTree t1 = new ExpressionTree("*",
							new ExpressionTree("+",
												1,
												9),
							new ExpressionTree(10));

		/**
		 * t2
		 *   *
		 *  / \
		 * t1  t1
		 */
		ExpressionTree t2 = new ExpressionTree("*", t1, t1);


		/**
		 *  t3
		 *      *
		 *     / \
		 *    -    /
		 *   /    / \
		 *  5    0   5
		 */
		ExpressionTree t3 = new ExpressionTree("*",
							new ExpressionTree("-",
												5),
							new ExpressionTree("/",
												0,
												4));

		/**
		 *  t4
		 *      *
		 *     / \
		 *    -    /
		 *   /    / \
		 *  5    0   0
		 */
		ExpressionTree t4 = new ExpressionTree("*",
							new ExpressionTree("-",
												5),
							new ExpressionTree("/",
												0,
												0));
		/**
		 *  t5
		 *      *
		 *     / \
		 *    +    /
		 *   /    / \
		 *  5    1   0
		 */
		ExpressionTree t5 = new ExpressionTree("*",
							new ExpressionTree("+",
												5),
							new ExpressionTree("/",
												1,
												0));

		/**
		 *  t6
		 *      *
		 *     / \
		 *    +    /
		 *   /    / \
		 *  5    -   0
		 *  	 \
		 *  	  1
		 */
		ExpressionTree t6 = new ExpressionTree("*",
							new ExpressionTree("+",
												5),
							new ExpressionTree("/",
												new ExpressionTree("-",
																	1),
												0));


		ExpressionTree [] trees = {t1, t2, t3, t4, t5, t6};

		for(ExpressionTree t : trees) {
			System.out.println(t);
			try {
				System.out.println(t.evaluate());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
