package creator;

import product.Button;

public abstract class Dialog {

    //Factory Method
    abstract Button createButton();

    public void render(){
        Button button = createButton();
        button.render();
        button.onClick();
    }
}
