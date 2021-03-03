package com.dj.iot.utils;

import com.dj.iot.IotlangVisitorImpl;
import com.dj.iot.dsl.IotlangLexer;
import com.dj.iot.dsl.IotlangParser;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;

public class RunUtils {
    static public Object exec(String fileName) throws IOException {
        var lexer = new IotlangLexer(CharStreams.fromFileName(fileName));
        var token = new CommonTokenStream(lexer);
        var parser = new IotlangParser(token);
        var tree = parser.prog();
        tree.toStringTree();
        var visit = new IotlangVisitorImpl();
        return visit.visit(tree);
    }

    static public void exec(String fileName, Boolean displayTree) throws IOException {
        var lexer = new IotlangLexer(CharStreams.fromFileName(fileName));
        var token = new CommonTokenStream(lexer);
        var parser = new IotlangParser(token);
        var tree = parser.prog();
        tree.toStringTree();
        var visit = new IotlangVisitorImpl();
        visit.visit(tree);

        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(
                parser.getRuleNames()), tree);
        viewer.setScale(1);
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
