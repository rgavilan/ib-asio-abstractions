package es.um.asio.abstractions.dto;

import java.util.Date;

import es.um.asio.abstractions.domain.ExitStatusCode;
import es.um.asio.abstractions.domain.JobType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(includeFieldNames = true)
public class ImportResultDto {
    
    /**
     * The start date of import.
     */
    private Date startTime;    
    
    /**
     * The exit status code.
     */    
    private ExitStatusCode exitStatusCode;
    
    /**
     * The job type.
     */
    private JobType jobType;
}
