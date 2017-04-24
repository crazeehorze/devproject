package com.github.devproject.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.github.devproject.SampleClass;

import org.junit.Test;

/**
 * Unit tests of {@link SampleClass} class
 */
public class SampleClassTest {

	/**
	 * Test default enable state of {@link SampleClass}
	 */
	@Test
	public void defaultState() {
		SampleClass sampleClass = new SampleClass();
		assertTrue(sampleClass.isEnabled());
	}

	/**
	 * Test enabling and disabling a {@link SampleClass}
	 */
	@Test
	public void updateEnableState() {
		SampleClass sampleClass = new SampleClass();
		sampleClass.setEnabled(false);
		assertFalse(sampleClass.isEnabled());
		sampleClass.setEnabled(true);
		assertTrue(sampleClass.isEnabled());
	}
}
