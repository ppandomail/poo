package archivos;

import java.io.File;
import java.io.FilenameFilter;

public class JOtroFiltro implements FilenameFilter {
	
	private String expreg;
	
	public JOtroFiltro(String expreg) {
		this.setExpreg(expreg);
	}
	
	public String getExpreg() {
		return this.expreg;
	}

	public void setExpreg(String expreg) {
		this.expreg = expreg;
	}

	@Override
	public boolean accept(File dir, String name) {
		return name.matches(this.getExpreg());
	}

}