/*
 * Copyright 2012 Decebal Suiu
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this work except in compliance with
 * the License. You may obtain a copy of the License in the LICENSE file, or at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package ro.fortsoft.pf4j;

/**
 * A wrapper over plugin instance.
 *
 * @author Decebal Suiu
 */
public class PluginWrapper {

	PluginDescriptor descriptor;
	String pluginPath;
	PluginClassLoader pluginClassLoader;
	
	public PluginWrapper(PluginDescriptor descriptor) {
		this.descriptor = descriptor;
	}
	
    /**
     * Returns the plugin descriptor.
     */
    public PluginDescriptor getDescriptor() {
    	return descriptor;
    }

    /**
     * Returns the path of this plugin relative to plugins directory.
     */
    public String getPluginPath() {
    	return pluginPath;
    }

    /**
     * Returns the plugin class loader used to load classes and resources
	 * for this plug-in. The class loader can be used to directly access
	 * plug-in resources and classes.
	 */
    public PluginClassLoader getPluginClassLoader() {
    	return pluginClassLoader;
    }

	void setPluginPath(String pluginPath) {
		this.pluginPath = pluginPath;
	}

	void setPluginClassLoader(PluginClassLoader pluginClassLoader) {
		this.pluginClassLoader = pluginClassLoader;
	}

}
