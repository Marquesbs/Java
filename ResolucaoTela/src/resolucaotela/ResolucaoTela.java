package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela
{
    public static void main(String[] args)
    {
        Toolkit auxiliar = Toolkit.getDefaultToolkit();
        Dimension tela = auxiliar.getScreenSize();
        System.out.println("A resolução da tela é: " + tela.width + " x " + tela.height);
    }
    
}
