/**
 * Copyright (C) 2013 Future Invent Informationsmanagement GmbH. All rights
 * reserved. <http://www.fuin.org/>
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or (at your option) any
 * later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library. If not, see <http://www.gnu.org/licenses/>.
 */
package org.fuin.ddd4j.ddd;

import javax.validation.constraints.Size;

import org.fuin.objects4j.common.Contract;
import org.fuin.objects4j.common.Immutable;
import org.fuin.objects4j.common.NotEmpty;
import org.fuin.objects4j.vo.AbstractStringValueObject;

/**
 * Identifies an event type within an aggregate type.
 */
@Immutable
public class EventType extends AbstractStringValueObject<EventType> {

	private static final long serialVersionUID = 1000L;

	@NotEmpty
	@Size(max = 255)
	private final String str;

	/**
	 * Constructor with unique name to use.
	 * 
	 * @param str
	 *            Type name of an aggregate that is unique within all types of
	 *            the context
	 */
	public EventType(@NotEmpty @Size(max = 255) final String str) {
		Contract.requireArgNotEmpty("str", str);
		Contract.requireArgMaxLength("str", str, 255);
		this.str = str;
	}

	/**
	 * Returns the type name as string.
	 * 
	 * @return Unique type name.
	 */
	public final String asString() {
		return str;
	}

	@Override
	public final String toString() {
		return str;
	}

}