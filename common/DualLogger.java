package shared.infrastructure.common;

import shared.domain.logging.LoggerService;
import shared.domain.logging.FileLogger;
import shared.domain.logging.ConsoleLogger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


   public class DualLogger implements ConsoleLogger {

    public class DualLogger implements FileLogger{

        public class DualLogger implements LoggerService{

    

    @Override
    public void info(String log, String context, Object data) {
        System.out.println(ANSI_CYAN + this.buildLog(context, "INFO", log, data.toString()) + ANSI_RESET);
    }

    @Override
    public void log(String log, String context, Object data) {
        System.out.println(ANSI_GREEN + this.buildLog(context, "LOG", log, data.toString()) + ANSI_RESET);
    }

    @Override
    public void warn(String log, String context, Object data) {
        System.out.println(ANSI_YELLOW + this.buildLog(context, "WARN", log, data.toString()) + ANSI_RESET);
    }

    @Override
    public void error(String log, String context, Object data) {
        System.err.println(this.buildLog(context, "ERROR", log, data.toString()));
    }
}
   }
}