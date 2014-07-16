package layouts;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class FillLayoutTest {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		
		// try each one
		//shell.setLayout(new FillLayout(SWT.HORIZONTAL));
		shell.setLayout(new FillLayout(SWT.VERTICAL));

		new Button(shell, SWT.PUSH).setText("one");
		new Button(shell, SWT.PUSH).setText("two");
		new Button(shell, SWT.PUSH).setText("three");
		
		shell.open();
		while(!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
}
