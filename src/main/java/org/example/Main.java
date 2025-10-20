package org.example;

import static java.lang.System.*;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            out.println("i = " + i);
//        }

        var display = new Display();
        var shell = new Shell(display);
        shell.setLayout(new GridLayout(1, false));
        shell.setText("SWT Demo");
        shell.setSize(300, 200);

        var label = new Label(shell, SWT.NONE);
        label.setText("Hello World!");
        label.setLayoutData(new GridData(
                SWT.CENTER, SWT.CENTER, true, true
        ));

        shell.open();
        while (! shell.isDisposed())
            if (! display.readAndDispatch())
                display.sleep();
        display.dispose();
    }
}