/*
 * Copyright 2009-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class CodenarcGriffonPlugin {
    // the plugin version
    String version = '0.7'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [:]
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = []
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-codenarc-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'CodeNarc plugin'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
The CodeNarc Plugin provides static code analysis for Groovy code. It uses the [codeNarc][1] library.
It began as a port of the [Grails CodeNarc][2] plugin created by Burt Beckwith.

Usage
----
The plugin provides a script 'codenarc' that will analyze your code and write its results to an HTML file.
Run the following command

        griffon codenarc

to perform the analysis.

Configuration
-------------
The plugin requires no customization to run. By default it will analyze all Groovy files in

 * src/main
 * griffon-app/controllers
 * griffon-app/models
 * griffon-app/views
 * griffon-app/services

You can restrict which folders are included or add extra ones. The following table lists settings that
will be read from `griffon-app/conf/BuildConfig.groovy` and used if available:

| *Property*                      | *Default Value*                           | *Meaning*                                            |
| ------------------------------- | ----------------------------------------- | ---------------------------------------------------- |
| codenarc.reportName             | 'codenarc.html'                           | the name of the analysis report file                 |
| codenarc.reportLocation         | ${projectTargetDir}/test-reports/codenarc | the location of the analysis report file             |
| codenarc.reportType             | 'html'                                    | the report type; the only valid value is 'html'      |
| codenarc.reportTitle            | "CodeNarc - $griffonAppName"              | the report title                                     |
| codenarc.processSrcGroovy       | true                                      | whether to analyze source in src/main/*.groovy       |
| codenarc.processControllers     | true                                      | whether to analyze source in griffon-app/controllers |
| codenarc.processModels          | true                                      | whether to analyze source in griffon-app/models      |
| codenarc.processViews           | true                                      | whether to analyze source in griffon-app/views       |
| codenarc.processServices        | true                                      | whether to analyze source in griffon-app/services    |
| codenarc.processTestUnit        | true                                      | whether to analyze source in test/unit               |
| codenarc.processTestIntegration | true                                      | whether to analyze source in test/integration        |
| codenarc.extraIncludeDirs       | none                                      | extra source directories to include                  |
| codenarc.maxPriority1Violations | unlimited                                 | the maximum number of Priority 1 violations allowed  |
| codenarc.maxPriority2Violations | unlimited                                 | the maximum number of Priority 2 violations allowed  |
| codenarc.maxPriority3Violations | unlimited                                 | the maximum number of Priority 3 violations allowed  |

Lastly there's `codenarc.ruleSetFiles` which identifies the rules to be applied. The default value for this setting is
`'rulesets/basic.xml,rulesets/exceptions.xml,rulesets/imports.xml,rulesets/unused.xml'`

[1]: http://codenarc.sourceforge.net
[2]: http://grails.org/plugin/codenarc
'''
}
