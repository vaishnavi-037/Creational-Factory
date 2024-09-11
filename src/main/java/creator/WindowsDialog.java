package creator;

import product.Button;
import product.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
