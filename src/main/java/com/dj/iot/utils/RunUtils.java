package com.dj.iot.utils;

import com.dj.iot.IotlangVisitorImpl;
import com.dj.iot.dsl.IotlangLexer;
import com.dj.iot.dsl.IotlangParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class RunUtils {
    static  public  void exec(String fileName) throws IOException {
        var lexer=new IotlangLexer(CharStreams.fromFileName(fileName));
        var token=new CommonTokenStream(lexer);
        var parser=new IotlangParser(token);
        var tree=parser.prog();
        tree.toStringTree();
        var visit=new IotlangVisitorImpl();
        var res=visit.visit(tree);
        System.out.println(res);
    }
}
