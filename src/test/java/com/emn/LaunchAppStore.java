package com.emn; /**
 * 
 */

import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.nio.SelectChannelConnector;
import org.mortbay.jetty.webapp.WebAppContext;

/**
 * @author acogoluegnes
 *
 */
public class LaunchAppStore {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		Server server = new Server();
		Connector connector = new SelectChannelConnector();
		connector.setPort(8080);
		connector.setHost("127.0.0.1");
		server.addConnector(connector);

		WebAppContext wac = new WebAppContext();
		wac.setContextPath("/appstore");
        //If don't work, use absolute path
		wac.setWar("src/main/webapp");
		server.setHandler(wac);
		server.setStopAtShutdown(true);
		server.start();
		
		System.out.println("**** Appstore started! ("+(System.currentTimeMillis()-start)/1000+" s)");

	}

}
