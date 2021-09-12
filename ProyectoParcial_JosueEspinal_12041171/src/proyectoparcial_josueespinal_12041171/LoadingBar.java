package proyectoparcial_josueespinal_12041171;

import javax.swing.JProgressBar;

public class LoadingBar extends Thread {

    private JProgressBar loadingBar;
    private boolean vive;

    public LoadingBar(JProgressBar loadingBar) {
        this.loadingBar = loadingBar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        vive = true;
        loadingBar.setValue(0);
        while (vive) {
            loadingBar.setValue(loadingBar.getValue() + 1);
            loadingBar.setString(Integer.toString(loadingBar.getValue()) + "%");
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }

    }
}
