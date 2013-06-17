
CodeNarc plugin
---------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/codenarc](http://artifacts.griffon-framework.org/plugin/codenarc)


The CodeNarc Plugin provides static code analysis for Groovy code. It uses the
[CodeNarc][1] library. It began as a port of the [Grails CodeNarc][2] plugin
created by Burt Beckwith.

Usage
-----
The plugin provides a script 'codenarc' that will analyze your code and write
its results to an HTML file. Run the following command

    griffon codenarc

to perform the analysis.

Configuration
-------------
The plugin requires no customization to run. By default it will analyze all
Groovy files in

 * src/main
 * griffon-app/controllers
 * griffon-app/models
 * griffon-app/views
 * griffon-app/services

You can restrict which folders are included or add extra ones. The following
table lists settings that will be read from `griffon-app/conf/BuildConfig.groovy`
and used if available:

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

Lastly there's `codenarc.ruleSetFiles` which identifies the rules to be applied.
The default value for this setting is
`'rulesets/basic.xml,rulesets/exceptions.xml,rulesets/imports.xml,rulesets/unused.xml'`

[1]: http://codenarc.sourceforge.net
[2]: http://grails.org/plugin/codenarc

