package archivos;

import java.io.File;
import java.io.FilenameFilter;

public class JMiFiltro implements FilenameFilter {
	
	private String extension;
	
	public JMiFiltro(String extension) {
		this.setExtension(extension);
	}
	
	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(this.getExtension());
	}

}