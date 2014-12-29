package mypackage;

import net.rim.device.api.ui.component.Dialog;
import net.rim.device.api.ui.component.LabelField;
import net.rim.device.api.ui.component.RichTextField;
import net.rim.device.api.ui.container.MainScreen;

/**
 * A class extending the MainScreen class, which provides default standard
 * behavior for BlackBerry GUI applications.
 */
public final class MyScreen extends MainScreen
{
    /**
     * Creates a new MyScreen object
     */
    public MyScreen()
    {        
		super();
		LabelField title = new LabelField("HelloWorld Sample", 
		LabelField.ELLIPSIS | LabelField.USE_ALL_WIDTH);
		setTitle(title);
		add(new RichTextField("Hello World!"));
    }
    
    /**
     * On close event
     */
	public boolean onClose()
	{
		Dialog.alert("Goodbye!");
		System.exit(0);
		return true;
	}
}
