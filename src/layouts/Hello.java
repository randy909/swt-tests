package layouts;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class Hello {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		Label label = new Label(shell, SWT.CENTER);
		label.setText("Hello, World. AAAAAGGGG");
		label.setBounds(shell.getClientArea());
		shell.open();
		while(!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
}
