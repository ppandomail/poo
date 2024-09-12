package archivos;

import java.io.File;
import java.io.FilenameFilter;

public class JFiltroNombres implements FilenameFilter {
	
	private String extension;
	
	public JFiltroNombres(String extension) {
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
		if (this.getExtension().equals("*"))
			return Boolean.TRUE;
		return name.endsWith(this.getExtension());
	}
	
}