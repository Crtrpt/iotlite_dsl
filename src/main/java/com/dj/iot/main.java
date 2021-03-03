package com.dj.iot;

import com.dj.iot.dsl.IotlangLexer;
import com.dj.iot.dsl.IotlangParser;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws IOException {
        System.out.println("开始执行");
        var lexer=new IotlangLexer(CharStreams.fromFileName("./test.i"));
        var token=new CommonTokenStream(lexer);
        var parser=new IotlangParser(token);

        var tree=parser.prog();
        tree.toStringTree();
        var visit=new IotlangVisitorImpl();
        var res=visit.visit(tree);

        System.out.print(res);

        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewer.setScale(1); // Scale a little
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
