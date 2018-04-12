package cn.edu.hqu.javaee;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest{
	private PrintStream stream;
	public SlayDragonQuest(PrintStream stream) {
		this.stream=stream;
	}

	public void embark() {
		stream.println("正在杀死恶龙!");
		
	}

}
