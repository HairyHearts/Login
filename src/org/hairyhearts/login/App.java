package org.hairyhearts.login;

import com.baasbox.android.BAASBox;
import com.baasbox.android.BAASBoxConfig;
import com.baasbox.android.BAASBoxConfig.AuthType;

import android.app.Application;

public class App extends Application {
	public static BAASBox bbox;
	
	@Override
	public void onCreate() {
		super.onCreate();
		
		BAASBoxConfig config = new BAASBoxConfig();
		config.API_DOMAIN = "baasbox-hairyhearts.rhcloud.com";
		config.AUTHENTICATION_TYPE = AuthType.SESSION_TOKEN;
		config.HTTP_PORT=80;
		
		bbox = new BAASBox(config, this);
	}
}
