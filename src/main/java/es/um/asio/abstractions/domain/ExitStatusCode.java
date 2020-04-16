package es.um.asio.abstractions.domain;

/**
 * The Enum that represents the Exit Status of a job
 */
public enum ExitStatusCode {

    /**
     * Unknown code.
     */
    UNKNOWN, 
    
    /**
     * Executing code.
     */
    EXECUTING, 
    
    /**
     * Completed code.
     */
    COMPLETED, 
    
    /**
     * Noop code.
     */
    NOOP, 
    
    /**
     * Failed code.
     */
    FAILED, 
    
    /**
     * Stopped code.
     */
    STOPPED;

}
