package layouts.grid;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class GridLayoutDataTest {
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		
		GridData data = new GridData(GridData.FILL_BOTH);
		
		// According to the APress SWT book you shouldn't reuse GridData objects like this.
		// Each Control is supposed to get its own GridData instance.
		// But on my mac it appears to work just fine.
		// Maybe this is something they fixed in newer versions of SWT?
		Button b1 = new Button(shell, SWT.PUSH);
		b1.setText("1");
		b1.setLayoutData(data);
		Button b2 = new Button(shell, SWT.PUSH);
		b2.setText("2");
		b2.setLayoutData(data);
		Button b3 = new Button(shell, SWT.PUSH);
		b3.setText("3");
		b3.setLayoutData(data);
		Button b4 = new Button(shell, SWT.PUSH);
		b4.setText("4");
		b4.setLayoutData(data);
		
		shell.setLayout(layout);
		shell.pack(); // shrinks the window to minimum size
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
