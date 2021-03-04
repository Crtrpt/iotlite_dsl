package com.dj.iot;

import com.dj.iot.dsl.IotlangLexer;
import com.dj.iot.dsl.IotlangParser;
import com.dj.iot.garden.Humidifier;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("");
        var lexer = new IotlangLexer(CharStreams.fromFileName("./case/garden.iot"));
        var token = new CommonTokenStream(lexer);
        var parser = new IotlangParser(token);
        var tree = parser.prog();
        tree.toStringTree();
        Scope scope=new Scope();
        var devices=new ArrayList<>();
        devices.add(new Humidifier("xx1",200));
        devices.add(new Humidifier("xx0",200));
        devices.add(new Humidifier("xx0",200));
        devices.add(new Humidifier("xx0",200));
        devices.add(new Humidifier("xx0",200));
        devices.add(new Humidifier("xx0",200));
        devices.add(new Humidifier("xx1",200));
        devices.add(new Humidifier("xx0",200));
        devices.add(new Humidifier("xx0",200));
        devices.add(new Humidifier("xx0",200));
        devices.add(new Humidifier("xx0",200));
        devices.add(new Humidifier("xx0",200));
        devices.add(new Humidifier("xx0",300));
        scope.assignParam("device",devices);
        var visit = new IotlangVisitorImpl(scope,new HashMap<>());
        var ret= visit.visit(tree);
        System.out.println(ret);
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
