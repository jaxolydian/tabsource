import java.awt.GridBagConstraints;
import java.awt.Insets;

public class ConstraintEditor
{

	public ConstraintEditor()
	{
		// TODO Default constructor
	}
	public static void setConstraints(GridBagConstraints a, int gx, int gy, int px, int py) {
		a.gridx = gx;
	    a.gridy = gy;
	    a.ipadx = px;
	    a.ipady = py;
	}
	public static void setZeroInsets(GridBagConstraints constraints)
	{
		constraints.insets = new Insets(0,0,0,0);
	}
	public static void setInsets(GridBagConstraints constraints, int i1, int i2, int i3, int i4)
	{
		constraints.insets = new Insets(i1,i2,i3,i4);
	}
}