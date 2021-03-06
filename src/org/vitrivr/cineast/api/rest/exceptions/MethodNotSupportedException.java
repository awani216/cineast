package org.vitrivr.cineast.api.rest.exceptions;

import spark.Request;

/**
 * @author rgasser
 * @version 1.0
 * @created 09.01.17
 */
public class MethodNotSupportedException extends ActionHandlerException {

  private static final long serialVersionUID = 4872163795505943837L;

    public MethodNotSupportedException(Request request) {
        super("HTTP method '" + request.requestMethod() + "' is not supported for call to' " + request.url() + "'.");
    }
}
