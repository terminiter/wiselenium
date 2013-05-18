package org.wiselenium.core.pagefactory;

/**
 * Allows the decorators to be used in a chain of responsibility.
 * 
 * @author Andre Ricardo Schaffer
 * @since 0.0.1
 */
interface WiseDecoratorChain extends ExtendedFieldDecorator {
	
	/**
	 * Sets the next decorator of the chain to be called.
	 * 
	 * @param decorator The decorator.
	 * @return This instance in order to allow chain method calls.
	 * @since 0.0.1
	 */
	WiseDecoratorChain setNext(ExtendedFieldDecorator decorator);
	
}
