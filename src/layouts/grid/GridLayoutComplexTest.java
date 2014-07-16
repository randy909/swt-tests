package layouts.grid;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class GridLayoutComplexTest {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.makeColumnsEqualWidth = true; // TODO: make a test to demo this
		shell.setLayout(layout);
		
		// Top left button
		GridData data = new GridData(GridData.FILL_BOTH);
		data.widthHint = 200;
		Button butt1 = new Button(shell, SWT.PUSH);
		butt1.setText("one");
		butt1.setLayoutData(data);
		
		Composite comp = new Composite(shell, SWT.NONE);
		data = new GridData(GridData.FILL_BOTH);
		data.horizontalSpan = 2; // TODO: what does this do? make a test that isolates this.
		comp.setLayoutData(data);
		GridLayout compLayout = new GridLayout();
		compLayout.numColumns = 1;
		compLayout.marginHeight = 15;
		comp.setLayout(compLayout);
		
		Button butt2 = new Button(comp, SWT.PUSH);
		butt2.setText("two");
		butt2.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Button butt3 = new Button(comp, SWT.PUSH);
		butt3.setText("three");
		butt3.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER));
		
		Button butt4 = new Button(comp, SWT.PUSH);
		butt4.setText("four");
		butt4.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
		
		data = new GridData();
		data.horizontalAlignment = GridData.FILL;
		data.grabExcessHorizontalSpace = true;
		data.horizontalSpan = 3;
		data.heightHint = 150;
		Button butt5 = new Button(shell, SWT.PUSH);
		butt5.setText("five");
		butt5.setLayoutData(data);
		
		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		if (!display.isDisposed()) { // ctrl-q will cause dispose to throw without this check
			display.dispose();
		}
	}

}
