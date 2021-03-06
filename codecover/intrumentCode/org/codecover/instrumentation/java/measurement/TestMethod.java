/******************************************************************************
 * Copyright (c) 2007 Stefan Franke, Robert Hanussek, Benjamin Keil,          *
 *                    Steffen Kieß, Johannes Langauf,                         *
 *                    Christoph Marian Müller, Igor Podolskiy,                *
 *                    Tilmann Scheller, Michael Starzmann, Markus Wittlinger  *
 * All rights reserved. This program and the accompanying materials           *
 * are made available under the terms of the Eclipse Public License v1.0      *
 * which accompanies this distribution, and is available at                   *
 * http://www.eclipse.org/legal/epl-v10.html                                  *
 ******************************************************************************/

package org.codecover.instrumentation.java.measurement;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Christoph Müller
 * 
 * @version 1.0 ($Id: TestMethod.java 2129 2007-10-24 16:11:38Z langaujs $)
 */
public class TestMethod {
    /** A {@link List} of AssertionFailedError */
    private List/* JUnitFailureContainer */ failures;

    private final String name;

    /**
     * Constructor.
     * 
     * @param name
     *            The name of the JUnit test method.
     */
    public TestMethod(String name) {
        this.name = name;
        this.failures = new LinkedList();
    }

    /**
     * Adds a new JUnitFailureContainer.
     * 
     * @param failure
     *            The JUnitFailureContainer.
     */
    public void addFailure(Object failure) {
        this.failures.add(failure);
    }

    /**
     * @return The {@link List} of JUnitFailureContainer.
     */
    public List getFailures() {
        return this.failures;
    }

    /**
     * @return The name of the test method.
     */
    public String getName() {
        return this.name;
    }
}
