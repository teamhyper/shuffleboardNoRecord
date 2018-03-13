package org.hyperonline.shuffleboard.norecord;

import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.sources.recording.Recorder;

@Description(group = "org.hyperonline",
name = "ShuffleboardNoRecord",
version = "0.1.0", 
summary = "Stop the automatic recording when Shuffleboard is loaded"
)

public class NoRecordPlugin extends Plugin {
	@Override
	public void onLoad() {
		Recorder.getInstance().stop();
	}
}
