package com.compiler.project;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.lang.Math;

public class MyVisitor extends NotSimpleCalcBaseVisitor<Integer> {

    HashMap<String, Integer> map = new HashMap<>();
    @Override
    public Integer visitProgram(NotSimpleCalcParser.ProgramContext ctx) {
        for (NotSimpleCalcParser.StatementContext statement : ctx.statement()) {
            visit(statement);
        }
        return null;
    }

    @Override
    public Integer visitStatement(NotSimpleCalcParser.StatementContext ctx) {
        if (ctx.assign_stmt()!= null) {
            return visit(ctx.assign_stmt());
        } else if (ctx.block_stmt()!= null) {
            return visit(ctx.block_stmt());
        } else if (ctx.if_stmt()!= null) {
            return visit(ctx.if_stmt());
        } else if (ctx.while_stmt()!= null) {
            return visit(ctx.while_stmt());
        } else if (ctx.for_stmt()!= null) {
            return visit(ctx.for_stmt());
        } else if (ctx.loop_stmt()!= null) {
            return visit(ctx.loop_stmt());
        } else if (ctx.print_stmt()!= null) {
            return visit(ctx.print_stmt());
        }
        return null;
    }

    @Override
    public Integer visitAssign_stmt(NotSimpleCalcParser.Assign_stmtContext ctx) {
        String identifier = ctx.Identifier().getText();
        Integer exprValue = visit(ctx.expr());
        map.put(identifier, exprValue);
        return null;
    }

    @Override
    public Integer visitBlock_stmt(NotSimpleCalcParser.Block_stmtContext ctx) {
        return visit(ctx.program());
    }

    @Override
    public Integer visitIf_stmt(NotSimpleCalcParser.If_stmtContext ctx) {
        Integer exprValue = visit(ctx.expr());
        if (exprValue != 0) {
            visit(ctx.statement(0));
        }
        if (ctx.statement().size() > 1) {
            if(exprValue == 0){
                visit(ctx.statement(1));
            }

        }
        return null;
    }

    @Override
    public Integer visitWhile_stmt(NotSimpleCalcParser.While_stmtContext ctx) {
        Integer exprValue = visit(ctx.expr());
        while (exprValue != 0) {
            visit(ctx.statement());
            exprValue = visit(ctx.expr());
        }
        return null;
    }

    @Override
    public Integer visitFor_stmt(NotSimpleCalcParser.For_stmtContext ctx) {
        String identifier = ctx.Identifier().getText();
        int start = Integer.parseInt(ctx.Number(0).getText());
        int end = Integer.parseInt(ctx.Number(1).getText());
        for (int i = start; i <= end; i++) {
            map.put(identifier, i);
            visit(ctx.statement());
        }
        return null;
    }

    @Override
    public Integer visitLoop_stmt(NotSimpleCalcParser.Loop_stmtContext ctx) {
        String identifier = ctx.Identifier().getText();
        int count = Integer.parseInt(ctx.Number().getText());
        for (int i = 1; i <= count; i++) {
            map.put(identifier, i);
            visit(ctx.statement());
        }
        return null;
    }

    @Override
    public Integer visitPrint_stmt(NotSimpleCalcParser.Print_stmtContext ctx) {
        String id = ctx.Identifier().getText();
        Integer value = map.getOrDefault(id, 0);
        if(ctx.StringLiteral() != null){
            String str = ctx.StringLiteral().getText();
            System.out.print(str.substring(1, str.length()-1));
        }
        System.out.println(value);
        return value;
    }

    @Override
    public Integer visitExpr(NotSimpleCalcParser.ExprContext ctx) {
        Integer factorValue = visit(ctx.cmp_expr(0));
        if (ctx.getChildCount() > 1) {
            ParseTree op = ctx.getChild(1);
            Integer factorValue2 = visit(ctx.cmp_expr(1));
            if(op == ctx.DE()){
                return (factorValue == factorValue2) ? 1 : 0;
            }else if(op == ctx.NE()){
                return (factorValue != factorValue2) ? 1 : 0;
            }else if(op == ctx.LT()){
                return (factorValue < factorValue2) ? 1 : 0;
            }else if(op == ctx.GT()){
                return (factorValue > factorValue2) ? 1 : 0;
            }else if(op == ctx.LE()){
                return (factorValue <= factorValue2) ? 1 : 0;
            }else if(op == ctx.GE()){
                return (factorValue >= factorValue2) ? 1 : 0;
            }
            return 0;
        }
        return factorValue;
    }

    @Override
    public Integer visitCmp_expr(NotSimpleCalcParser.Cmp_exprContext ctx) {
        Integer termValue = visit(ctx.term(0));
        for (int i = 1; i < ctx.term().size(); i++) {
            ParseTree op = ctx.getChild(2 * i - 1);
            Integer termValue2 = visit(ctx.term(i));
            for(int j = 0; j < ctx.getChildCount(); j++){
                if(op == ctx.PLUS(j)){
                    termValue = termValue + termValue2;
                } else if (op == ctx.MINUS(j)) {
                    termValue = termValue - termValue2;
                }
            }

        }
        return termValue;
    }
    @Override
    public Integer visitTerm(NotSimpleCalcParser.TermContext ctx) {
        Integer powerValue = visit(ctx.power(0));
        for (int i = 1; i < ctx.power().size(); i++) {
            ParseTree op = ctx.getChild(2 * i - 1);
            Integer powerValue2 = visit(ctx.power(i));
            for(int j = 0; j < ctx.getChildCount(); j++) {
                if (op == ctx.MULT(j)) {
                    powerValue = powerValue * powerValue2;
                } else if (op == ctx.DIV(j)) {
                    powerValue = powerValue / powerValue2;
                } else if (op == ctx.REM(j)) {
                    powerValue = powerValue % powerValue2;
                }
            }
        }
        return powerValue;
    }

    @Override
    public Integer visitPower(NotSimpleCalcParser.PowerContext ctx) {
        Integer cmpExprValue = visit(ctx.factor());
        for (int i = 0; i < ctx.power().size(); i++) {
            Integer cmpExprValue2 = visit(ctx.power(i));

            cmpExprValue = (int) Math.pow(cmpExprValue, cmpExprValue2);
        }
        return cmpExprValue;
    }


    @Override
    public Integer visitFactor(NotSimpleCalcParser.FactorContext ctx) {
        if (ctx.PLUS()!= null || ctx.MINUS()!= null) {
            Integer sign = ctx.PLUS()!= null ? 1 : -1;
            Integer factorValue = visit(ctx.expr());
            return factorValue * sign;
        } else if (ctx.Identifier()!= null) {
            String identifier = ctx.Identifier().getText();
            return map.get(identifier);
        } else if (ctx.Number()!= null) {
            int number = Integer.parseInt(ctx.Number().getText());
            return number;
        } else if (ctx.openp()!= null) {
            Integer exprValue = visit(ctx.expr());
            ctx.closep();
            return exprValue;
        }
        return null;
    }
}