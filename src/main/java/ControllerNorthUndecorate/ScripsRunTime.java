package ControllerNorthUndecorate;

import java.io.IOException;

public class ScripsRunTime {

    private ProcessBuilder pb;// = new ProcessBuilder("cmd.exe", "/C", "w32tm/resync");
    private Runtime run;//= Runtime.getRuntime();
    private Process pc;

    public Process runScrips(String strScrips) {
        try {
            pb = new ProcessBuilder("cmd.exe", "/C", strScrips);
            pc = pb.start();
            sleep((int) 0.5);
            return pc;
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return null;
    }
    
  

    public void endScrips() {
        try {
            sleep((int) 0.5);
            pc.waitFor();
            pc.destroy();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    public void sleep(int time) {
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

}
