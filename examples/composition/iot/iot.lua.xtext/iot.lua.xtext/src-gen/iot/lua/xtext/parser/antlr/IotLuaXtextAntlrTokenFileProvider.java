/*
 * generated by Xtext 2.12.0
 */
package iot.lua.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class IotLuaXtextAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("iot/lua/xtext/parser/antlr/internal/InternalIotLuaXtext.tokens");
	}
}