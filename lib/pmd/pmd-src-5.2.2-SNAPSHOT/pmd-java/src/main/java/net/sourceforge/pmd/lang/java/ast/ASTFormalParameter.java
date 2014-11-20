/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
/* Generated By:JJTree: Do not edit this line. ASTFormalParameter.java */

package net.sourceforge.pmd.lang.java.ast;

import net.sourceforge.pmd.Rule;

public class ASTFormalParameter extends AbstractJavaAccessNode implements Dimensionable, CanSuppressWarnings {

    private boolean isVarargs;


    public void setVarargs() {
        isVarargs = true;
    }

    public boolean isVarargs() {
        return isVarargs;
    }
    
    public ASTFormalParameter(int id) {
        super(id);
    }

    public ASTFormalParameter(JavaParser p, int id) {
        super(p, id);
    }

    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    public boolean hasSuppressWarningsAnnotationFor(Rule rule) {
        for (int i = 0; i < jjtGetNumChildren(); i++) {
            if (jjtGetChild(i) instanceof ASTAnnotation) {
                ASTAnnotation a = (ASTAnnotation) jjtGetChild(i);
                if (a.suppresses(rule)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isArray() {
        return checkType() + checkDecl() > 0;
    }

    public int getArrayDepth() {
        if (!isArray()) {
            return 0;
        }
        return checkType() + checkDecl();
    }

    public ASTType getTypeNode() {
        for (int i = 0; i < jjtGetNumChildren(); i++) {
            if (jjtGetChild(i) instanceof ASTType) {
                return (ASTType) jjtGetChild(i);
            }
        }
        throw new IllegalStateException("ASTType not found");
    }

    private int checkType() {
        return getTypeNode().getArrayDepth();
    }

    protected ASTVariableDeclaratorId getDecl() {
        try {
            return (ASTVariableDeclaratorId) jjtGetChild(jjtGetNumChildren()-1);
        } catch (ClassCastException c) {
            System.out.println("CLASS CAST: " + this.getBeginLine() + ":" + this.getBeginColumn() + " " + this.toString());
            return null;
        }
    }

    private int checkDecl() {
        return getDecl().getArrayDepth();
    }

}
