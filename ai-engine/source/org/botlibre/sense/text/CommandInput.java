/******************************************************************************
 *
 *  Copyright 2014 Paphus Solutions Inc.
 *
 *  Licensed under the Eclipse Public License, Version 1.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.eclipse.org/legal/epl-v10.html
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 ******************************************************************************/
package org.botlibre.sense.text;


/**
 * Defines the properties of a command input.
 */

public class CommandInput  {
	protected String command;
	protected boolean isCorrection;
	protected boolean isOffended;
	
	public CommandInput(String command) {
		this.command = command;
	}
	
	public CommandInput(String command, boolean isCorrection, boolean isOffended) {
		this.command = command;
		this.isCorrection = isCorrection;
		this.isOffended = isOffended;
	}
	
	public String getCommand() {
		return command;
	}
	
	public void setCommand(String command) {
		this.command = command;
	}
	
	public boolean isCorrection() {
		return isCorrection;
	}
	
	public void setCorrection(boolean isCorrection) {
		this.isCorrection = isCorrection;
	}
	
	public boolean isOffended() {
		return isOffended;
	}
	
	public void setOffended(boolean isOffended) {
		this.isOffended = isOffended;
	}
	
}