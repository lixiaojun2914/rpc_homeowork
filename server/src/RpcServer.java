import server.RpcThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * RPC服务器启动
 */
public class RpcServer {

    public static final int port = 9001;

    public static void main(String[] args) {
        exportRpc();
    }

    /**
     * 导出RPC接口
     */
    private static void exportRpc() {
        try {
            ServerSocket ss = new ServerSocket(port);
            while(true){
                Socket s = ss.accept();
                if(s!=null){
                    new RpcThread(s).start();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}