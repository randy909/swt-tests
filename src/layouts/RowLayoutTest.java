package layouts;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class RowLayoutTest {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell();
		shell.setLayout(new RowLayout(SWT.VERTICAL));
		
		Button b1 = new Button(shell, SWT.PUSH);
		b1.setText("one");
		RowData rd1 = new RowData();
		rd1.width = 50;
		rd1.height = 50;
		b1.setLayoutData(rd1);
		
		Button b2 = new Button(shell, SWT.PUSH);
		b2.setText("two");
		b2.setLayoutData(new RowData(200, 200));

		// resize the window to see this one wrap
		Button b3 = new Button(shell, SWT.PUSH);
		b3.setText("two");
		b3.setLayoutData(new RowData(50, 50));
		
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		if (!display.isDisposed())
			display.close();
	}

}
