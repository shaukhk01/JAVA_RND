package Thread;

public class ThreadDemo extends DownloadStatus {

	public static void show(){
		DownloadStatus status = new DownloadStatus();

		for(int index = 0; index < 10; index++){
			DownloadStatus thread = new Thread(new DownloadFileTask(status));
		}

	}
}
