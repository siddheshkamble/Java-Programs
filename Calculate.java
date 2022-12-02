import java.awt.*;
import java.awt.event.*;

class Calculate
{
    public static void main(String Arg[])
    {
        CalculatorFrame cobj = new CalculatorFrame(550,340,"Programming Calculator");
    }
}

class CalculatorFrame extends WindowAdapter
{
    public Button bAdd,bSub,bMult,bDiv;

    public CalculatorFrame(int Height, int Width, String Title)
    {
        Frame fobj = new Frame(Title);  
        fobj.setSize(Width,Height);
        fobj.setVisible(true);

        fobj.addWindowListener(this);

        bAdd = new Button("+");
        bAdd.setFont(new Font("Arial", Font.BOLD, 24));
        bSub = new Button("-");
        bSub.setFont(new Font("Arial", Font.BOLD, 24));
        bMult = new Button("*");
        bMult.setFont(new Font("Arial", Font.BOLD, 24));
        bDiv = new Button("/");
        bDiv.setFont(new Font("Arial", Font.BOLD, 24));
        
        bAdd.setBounds(10,350,80,40);
        bSub.setBounds(90,350,80,40);
        bMult.setBounds(170,350,80,40);
        bDiv.setBounds(250,350,80,40);

        fobj.add(bAdd);
        fobj.add(bSub);
        fobj.add(bMult);
        fobj.add(bDiv);

        fobj.setLayout(null);
    }
        public void windowClosing(WindowEvent obj)
        {
            System.exit(0);
        }
}
