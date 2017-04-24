package com.github.devproject;

/**
 * Simple wigdet class that can be enabled or disabled
 */
public class SampleClass {

	private boolean enabled;

	/**
	 * Create new enabled widget
	 */
	public SampleClass() {
		enabled = true;
	}

	/**
	 * Is the widget currently enabled?
	 * 
	 * @return true if enabled, false otherwise
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Set the widget enable state
	 * 
	 * @param enabled
	 * @return this widget
	 */
	public SampleClass setEnabled(boolean enabled) {
		this.enabled = enabled;
		return this;
	}
}
