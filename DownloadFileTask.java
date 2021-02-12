package Thread;
public class DownloadFileTask extends Thread {


	private DownloadStatus status;

	public DownloadFileTask(DownloadStatus status){
		this.status = status;
	}

	public void run() {

		for(int index = 0; index < 10000; index++){

			if(Thread.currentThread().isInterrupted())return ;

			status.incrementTotalBytes();
		}
	}
}


