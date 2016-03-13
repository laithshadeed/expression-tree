## Expression Tree Parser (2010)

```
This is a sample expression tree for (1 + 9) * 10:
       *
    /    \
   +      10
/   \
1     9
```

- Give the best OO design for this tree that you can. Justify your decisions
and describe the pros/cons of your approach
- Implement evaluate using this design. I should be able to evaluate any node
in the tree and get the result of the expression (ie. 100 if I evaluated 
the * node, 9 if I evaluated the 9 node, etc.)

## Reflection

This is an old sample code I wrote in 2010. I was trying to learn java by
answering this question. When I looked at my code now (after ~6.5 years).
I realized how horrible it was. I can point out now 10's of mistakes or
bad practices like style and OOP usage/design. It is funny when you look back
in the years to see how you used to code. Then you can appreciate what
you learned over the years. It reminds me with Peter Norvig article:
[Teach Yourself Programming in Ten Years](http://norvig.com/21-days.html).

## Run & Compile

```
% javac -d bin src/com/laiths/*.java
% java -cp bin com.laiths.Main
```

## LICENSE

Public Domain
