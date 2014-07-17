package layouts.combinations;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class GridsNestedTest {	
	private static void setup(Shell shell) {
		GridLayout shellLayout = new GridLayout(1, true);
		shell.setLayout(shellLayout);
		
		Button b0 = new Button(shell, SWT.PUSH);
		b0.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		b0.setText("one");
		
		// This control's GridLayout is for him and his children,
		// his GridData is for his parent's GridLayout (the shell's)
		Composite comp = new Composite(shell, SWT.BORDER);
		comp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		comp.setLayout(new GridLayout(2, true));
		
		// This control's gridData applies to the parent's layout (the Composite's)
		Button b1 = new Button(comp, SWT.PUSH);
		GridData data = new GridData(GridData.FILL_BOTH);
		b1.setLayoutData(data);
		
		Button b2 = new Button(comp, SWT.PUSH);
		data = new GridData(GridData.FILL_BOTH);
		b2.setLayoutData(data);
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
