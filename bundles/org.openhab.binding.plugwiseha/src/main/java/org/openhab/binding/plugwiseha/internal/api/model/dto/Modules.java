/*
 * Copyright (c) 2010-2025 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.plugwiseha.internal.api.model.dto;

import java.util.Map;

/**
 * The {@link Modules} class is an object model class that
 * mirrors the XML structure provided by the Plugwise Home Automation
 * controller for the collection of modules.
 * It extends the {@link PlugwiseHACollection} class.
 * 
 * @author B. van Wetten - Initial contribution
 */
public class Modules extends PlugwiseHACollection<Module> {

    @Override
    public void merge(Map<String, Module> modules) {
    }
}
