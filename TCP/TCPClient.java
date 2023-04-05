import java.io.*;
import java.net.*;
import javax.swing.*;

public class TCPClient{
    public static void main(String args[]) throws IOException{
        Socket socket = new Socket("localhost",5003);
        PrintWriter out= new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in= new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String entradaservidor = "";
        String entradausuario = JOptionPane.showInputDialog("Digite:");
        while (!entradausuario.equals("fim")){
            out.println(entradausuario);
            entradaservidor =in.readLine();
            entradausuario = JOptionPane.showInputDialog("Chegou:" + entradaservidor + "\n Digite para enviar");
        }
        out.close();
        in.close();
        socket.close();

    }

}
