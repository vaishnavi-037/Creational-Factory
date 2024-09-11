package product;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Render the HTMLButton in the application");
    }

    @Override
    public void onClick() {
        System.out.println("Performing operation \"onClick\" on HTMLButton");
    }
}
