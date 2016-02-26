# CSC488H1S Winter 2016 Assignment 2 - Team 11

Total: **94.9/100**

## Packaging (5/5)

 * Correctly named tarball and file contents


## Grammar quality/readability (38/40)

 * Readable transcription of reference grammar, including statements, declarations and the expression precedence hierarchy
 * (**-1**) repeat..until loops can have more than one body statement without needing an explicit scope
 * (**-1**) Mishandled repeated unary operators like minus and Boolean NOT


## Documentation (20/20)

 * Excellent approach to working together as a team! Bravo
 * Good approach to confirming the encoding of precedence
 * Reasonable discussion of issues encountered by implementing the reference grammar with an LALR(1) parser generator, with strategies to deal with them


## Your testing (23/25)

 * Nice selection of realistic syntax mistakes
 * Very good idea to include A1 programs
 * (**-1**) Missing exercise of _write_ statements with more-than-1 operands, use of _newline_ or integer-valued expressions
 * (**-1**) Missing exercise of _read_ statements


## Official testing (8.9/10)

 * Compiler built successfully
 * Passed 16/18 tests
 * `expressions.488`: Grammar cannot handle repeated unary minus expressions like `- - 1`
 * `harder.488`: Grammar cannot handle repeated NOT expressions like `not not true`
