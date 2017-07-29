package server;

public class Server {

	private String serverName;
	private String serverId;
	private String serverAddress;
	private boolean running;
	private boolean stopped;
	private int clientThreads;
	private int serverThread;
	private String description;
	private String serverStatus;

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getServerId() {
		return serverId;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
	}

	public String getServerAddress() {
		return serverAddress;
	}

	public void setServerAddress(String serverAddress) {
		this.serverAddress = serverAddress;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public boolean isStopped() {
		return stopped;
	}

	public void setStopped(boolean stopped) {
		this.stopped = stopped;
	}

	public int getClientThreads() {
		return clientThreads;
	}

	public void setClientThreads(int clientThreads) {
		this.clientThreads = clientThreads;
	}

	public int getServerThread() {
		return serverThread;
	}

	public void setServerThread(int serverThread) {
		this.serverThread = serverThread;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getServerStatus() {
		return serverStatus;
	}

	public void setServerStatus(String serverStatus) {
		this.serverStatus = serverStatus;
	}

}
