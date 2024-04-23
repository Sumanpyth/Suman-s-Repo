import java.applet.*;
import java.awt.*;

public class AppletExample extends Applet
{
public void paint(Graphics g)
{
g.drawString("Hello Welcome to Applet",500,500);
g.drawRect(100,100,150,150);
}
}

/* 
<applet code = "AppletExample" width="300" height="300">
</applet>
*/