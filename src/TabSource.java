public class TabSource 
{
    public static void main(String[] args) throws Exception {
        System.out.println("Start");
        try 
        {
            StartWindow.Instance();
        } catch (Exception exc) 
        {
            System.err.print("Error: Could not find an instance of StartWindow.Instance()");
        }
    }
}
