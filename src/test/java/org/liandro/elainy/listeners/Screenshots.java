package org.liandro.elainy.listeners;

import com.epam.reportportal.listeners.LogLevel;
import com.epam.reportportal.service.ReportPortal;

import java.util.Date;
import java.io.File;

public class Screenshots {

        public static void log(String message, File file) {
            ReportPortal.emitLog(message, LogLevel.INFO.name(), new Date(), file);
        }

}

