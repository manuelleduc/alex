/*
 * generated by Xtext 2.12.0
 */
package brew.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class BrewStandaloneSetup extends BrewStandaloneSetupGenerated {

	def static void doSetup() {
		new BrewStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
