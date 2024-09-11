package creator;

import product.Button;
import product.HTMLButton;
import product.WindowsButton;

public class HTMLDialog extends Dialog{
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}
