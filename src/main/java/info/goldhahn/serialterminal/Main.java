package info.goldhahn.serialterminal;

import java.net.MalformedURLException;
import java.util.concurrent.atomic.AtomicBoolean;

import lombok.extern.log4j.Log4j;

import org.springframework.context.Lifecycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@Log4j
public class Main implements Lifecycle {
	private AtomicBoolean running = new AtomicBoolean();

	public static void main(String[] args) {

		AbstractApplicationContext ctx = null;
		if (args.length == 0) {
			ctx = new ClassPathXmlApplicationContext("config.xml");
		} else {
			ctx = new FileSystemXmlApplicationContext(args[0]);
		}
		ctx.registerShutdownHook();
		ctx.start();
	}

	@Override
	public void start() {
		log.info("starting application");
		running.set(true);
	}

	@Override
	public void stop() {
		log.info("stopping application");
		running.set(false);
	}

	@Override
	public boolean isRunning() {
		return running.get();
	}
}
