public class ClypsCustomVisitor extends ClypsBaseVisitor<Boolean>{
//    @Override
//    public Boolean visitExpr(ClypsParser.ExprContext ctx) {
////        int intLeft, intRight;
////        boolean boolLeft, boolRight;
////
////        if(Boolean.parseBoolean(ctx.atom.getText())){
////            boolLeft = visit(ctx.left);
////            boolRight = visit(ctx.right);
////        }else if(ctx.atom.getType()==(int)Integer.parseInt(ctx.atom.getText())){
////            intLeft = visit(ctx.left);
////            intRight = visit(ctx.right);
////        }
////
////        String op = ctx.op.getText();
////        switch (op) {
////            case "||": return left || right;
////            case "&&": return left && right;
////            case "==": return left == right;
////            case "!=": return left != right;
////            case "<": return left < right;
////            case ">": return left > right;
////            case "<=": return left <= right;
////            case ">=": return left >= right;
////            default: throw new IllegalArgumentException("Unknown operator " + op);
////        }
////        //return visitChildren(ctx);
//   }
}
