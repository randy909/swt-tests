package layouts.form;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class FormLayoutSimpleTest {
	
	private static void setup(Shell shell) {
		FormLayout layout = new FormLayout();
		layout.marginHeight = 5;
		layout.marginWidth = 10;
		
		Button butt = new Button(shell, SWT.PUSH);
		butt.setText("button");
		
		FormData data = new FormData();
		data.height = 50;
		data.width = 50;
		butt.setLayoutData(data);
		
		shell.setLayout(layout);
	}

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		
		setup(shell);

		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		if (!display.isDisposed()) {
			display.dispose();
		}
	}
}
