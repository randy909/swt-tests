package layouts.grid;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class GridLayoutBasicTest {
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		
		new Button(shell, SWT.PUSH).setText("1");
		new Button(shell, SWT.PUSH).setText("2");
		new Button(shell, SWT.PUSH).setText("3");
		new Button(shell, SWT.PUSH).setText("4");
		new Button(shell, SWT.PUSH).setText("5");
		new Button(shell, SWT.PUSH).setText("6");
		
		shell.setLayout(layout);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		if (!display.isDisposed())
			display.dispose();
	}
}
