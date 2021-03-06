package featureSelection.basic.procedure.timer;

/**
 * An interface for Time counting.
 * 
 * @author Benjamin_L
 */
public interface TimeCounted {
	/**
	 * Set the start time.
	 * 
	 * @param start
	 * 		The time to be set in nano.
	 */
	void setStart(long start);
	/**
	 * Get the start time.
	 * 
	 * @return the start time in nano.
	 */
	long getStart();
	
	/**
	 * The the time recorded.
	 * 
	 * @param time
	 * 		The time in nano to be set.
	 */
	void setTime(long time);
	/**
	 * Get the time recorded.
	 * 
	 * @return the time recorded in nano.
	 */
	long getTime();
	
	/**
	 * Set the {@link TimeCountStatus}.
	 * 
	 * @param timeStatus
	 * 		The {@link TimeCountStatus} to be set.
	 */
	void setTimeStatus(TimeCountStatus timeStatus);
	/**
	 * Get the {@link TimeCountStatus}
	 * 
	 * @return {@link TimeCountStatus} instance.
	 */
	TimeCountStatus getTimeStatus();
}