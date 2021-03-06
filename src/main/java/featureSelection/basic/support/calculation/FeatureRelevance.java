package featureSelection.basic.support.calculation;

/**
 * Calculate Feature relevance.
 * 
 * @author Benjamin_L
 *
 * @param <V>
 * 		Type of feature relevance.
 */
public interface FeatureRelevance<V> 
	extends Calculation<V> 
{
	/**
	 * Get how many attributes involved in calculation by summing up attributes' length
	 * in each calculation.
	 * 
	 * @return The sum of attribute length in {@link long}.
	 */
	long getCalculationAttributeLength();

}
