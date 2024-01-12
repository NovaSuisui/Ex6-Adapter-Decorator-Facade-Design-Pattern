public class ServerWOFacade {
	public static void main(String[] args) {
		ScheduleServerManager scheduleServerManager = new ScheduleServerManager();
		scheduleServerManager.startServer();
		System.out.println("Start working......");
		System.out.println("After work done.........");
		scheduleServerManager.stopServer();
	}

}
