/**
 * Experimental AST Playground
 *
 * Put this file in your A3 directory under <code>src/compiler488/experiment</code>.
 */

package compiler488.experimental;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import compiler488.ast.*;
import compiler488.ast.decl.*;
import compiler488.ast.expn.*;
import compiler488.ast.stmt.*;
import compiler488.ast.type.*;

public class ASTPlayground {
	public static void main(String[] args) { new ASTPlayground().runMain(args); }

	public String prettyPrint(AST node) {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		PrettyPrinter p = new BasePrettyPrinter(new PrintStream(os));

		// The AST interface (and BaseAST class) implements the PrettyPrintable
		// interface, and each kind of AST node is capable of pretty-printing
		// itself using the provided PrettyPrinter
		node.prettyPrint(p);

		try {
			return os.toString("UTF8");
		} catch (UnsupportedEncodingException e) {
			System.err.println("Bad string encoding during pretty-print");
			e.printStackTrace();
			System.exit(1);
		}

		return null;
	}

	public void runMain(String[] args) {
		AST node;

		// TODO: Change the following line to play with different examples
		node = exampleRoutine();
		node = exampleScope();

		System.out.println("AST Pretty-print:");
		System.out.println(prettyPrint(node));
	}

	/** Example involving expressions */
	public Expn exampleExpn() {
		return new ArithExpn(
				ArithExpn.OP_PLUS,
				new IntConstExpn(1),
				new IntConstExpn(2));
	}

	/** Example involving statements */
	public Stmt exampleStmt() {
		return new AssignStmt(
				new SubsExpn(
						"foo",
						new IntConstExpn(3),
						new IntConstExpn(4)),
				exampleExpn()
				);
	}

	/** Example involving scopes */
	public Scope exampleScope() {
		// PDM: I suggest that you add the following two methods to
		// `compiler488.ast.stmt.Scope`. They will make your JCup grammar action
		// code more readable and succinct because the `this` return value
		// enables repeated calls to be chained.
		/*
			public Scope appendStmt(Stmt s) {
				statements.append(s);
				return this;
			}

			public Scope appendDecl(Declaration decl) {
				declarations.append(decl);
				return this;
			}
		*/

		/*
		return new Scope()
				.appendStmt(exampleStmt())
				.appendStmt(exampleStmt())
				.appendDecl(exampleDecl());
		*/

		// If you don't use the chainable "append" methods, you would have to
		// write the above as follows:
		Scope s = new Scope();

		// Notice that `compiler488.ast.ASTList` already has a chainable `append
		// method:
		s.getStatements()
			.append(exampleStmt())
			.append(exampleStmt());

		s.getDeclarations()
			.append(exampleDecl());

		return s;
	}

	/** Example involving variable declarations */
	public Declaration exampleDecl() {
		/*
		return new ScalarDecl("foo", new BooleanType());
		*/

		return new MultiDeclarations(new BooleanType(),
				new ASTList<DeclarationPart>()
					.append(new ScalarDeclPart("u"))
					.append(new ScalarDeclPart("v"))
					.append(new ArrayDeclPart("xs", -10, 10))
					);
	}

	/** Example of routine declarations */
	public RoutineDecl exampleRoutine() {
		// Procedure without arguments
		/*
		return new RoutineDecl("p", exampleScope());
		*/

		// Function without arguments
		/*
		return new RoutineDecl("f", new IntegerType(), exampleScope());
		*/

		// Function with arguments
		return new RoutineDecl("f",
				new BooleanType(),
				new ASTList<ScalarDecl>()
					.append(new ScalarDecl("p", new BooleanType()))
					.append(new ScalarDecl("x", new IntegerType())),
				exampleScope());

		// Procedure with arguments
		/*
		return new RoutineDecl("p",
				new ASTList<ScalarDecl>()
					.append(new ScalarDecl("x", new IntegerType()))
					.append(new ScalarDecl("p", new BooleanType())),
				exampleScope());
		*/
	}
}
