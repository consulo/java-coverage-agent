package consulo.java.coverage;

import java.io.File;
import java.security.CodeSource;

import com.intellij.rt.coverage.main.CoveragePremain;

/**
 * @author VISTALL
 * @since 27-Dec-17
 */
public class TestPathUtil
{
	public static String getTestPath() throws Exception
	{
		CodeSource codeSource = TestPathUtil.class.getProtectionDomain().getCodeSource();
		File jarFile = new File(codeSource.getLocation().toURI().getPath());
		return jarFile.getPath();
	}

	public static String getJarPath() throws Exception
	{
		CodeSource codeSource = CoveragePremain.class.getProtectionDomain().getCodeSource();
		File jarFile = new File(codeSource.getLocation().toURI().getPath());
		return jarFile.getPath();
	}
}
