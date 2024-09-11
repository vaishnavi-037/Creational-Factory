package product;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Render the WindowsButton in the application");
    }

    @Override
    public void onClick() {
        System.out.println("Performing operation \"onClick\" on WindowsButton");
    }
}
